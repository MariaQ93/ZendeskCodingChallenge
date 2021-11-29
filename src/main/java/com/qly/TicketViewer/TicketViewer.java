package com.qly.TicketViewer;

import com.qly.TicketViewer.handler.JSONHandler;
import com.qly.TicketViewer.model.TicketDetail;
import com.qly.TicketViewer.model.Tickets;
import com.qly.TicketViewer.util.ViewUtil;
import com.qly.TicketViewer.view.Display;

import java.io.FileNotFoundException;
import java.net.ConnectException;
import java.util.Scanner;


public class TicketViewer {
    public static void main(String[] args){
        ViewUtil viewTicketService = new ViewUtil();
        JSONHandler jsonHandler = new JSONHandler();
        Display display = new Display();
        //TODO: Display welcome information and/or guide
        System.out.println("Welcome to the Ticket Viewer System");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Typed in Tickets to view all Tickets\nTyped in Details to view individual ticket\nTyped in Exit to quit the system\n");
            String input = scanner.nextLine();
            //TODO: Retrieve Users' Inputs
            if(input.equals("Tickets")){
                int pageNum = 1;
                try{
                    String response = viewTicketService.getAllTickets(pageNum);
                    Tickets ticketList = jsonHandler.convertToList(response);
                    display.displayList(ticketList.getTickets());
                    int totalPages = (int)Math.ceil(ticketList.getCount()/25.0);
                    System.out.println(pageNum + "/"+ totalPages +" pages" );

                    if(totalPages > 1){
                        while(true){
                            if(pageNum > 1)
                                System.out.println("Type in p to display the previous page");
                            if(pageNum < totalPages)
                                System.out.println("Type in n to display the next page");

                            System.out.println("Type in number to specify the page number to list\nType in q to quit listing");
                            input = scanner.nextLine();
                            if(input.equals("p") && pageNum > 1) {
                                pageNum--;
                            }else if(input.equals("n") && pageNum < totalPages){
                                pageNum++;
                            }else{
                                try{
                                    int number = Integer.parseInt(input);
                                    if(number <= totalPages && number >= 1)
                                        pageNum = number;
                                    else
                                        throw new Exception();
                                }catch (Exception e){
                                    System.out.println("Illegal Input");
                                    break;
                                }
                            }

                            response = viewTicketService.getAllTickets(pageNum);
                            ticketList = jsonHandler.convertToList(response);
                            display.displayList(ticketList.getTickets());
                            System.out.println(pageNum + "/"+ totalPages +" pages" );
                        }
                    }
                } catch (FileNotFoundException fne){
                    System.out.println("Illegal Input");
                } catch (ConnectException ce){
                    System.out.println("Connection Failed");
                } catch (Exception e){
                    e.printStackTrace();
                }

            }else if(input.equals("Details")){
                //TODO: Display ticket details
                System.out.print("Please Enter the Ticket ID:");
                int ID = Integer.parseInt(scanner.nextLine());
                try {
                    String response = viewTicketService.getTicketDetails(ID);
                    TicketDetail ticketDetail = jsonHandler.convertToTicketDetail(response);
                    display.displayDetail(ticketDetail);
                } catch (FileNotFoundException fne){
                    System.out.println("Illegal Input");
                } catch (ConnectException ce){
                    System.out.println("Connection Failed");
                } catch (Exception e){
                    e.printStackTrace();
                }

            }else if(input.equals("Exit")){
                System.out.println("Thank you for using");
                System.exit(0);
            }else{
                System.out.println("ERROR: Please Enter the correct input");
            }
        }

    }
}

