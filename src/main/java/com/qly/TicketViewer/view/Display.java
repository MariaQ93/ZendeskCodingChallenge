package com.qly.TicketViewer.view;


import com.qly.TicketViewer.model.TicketDetail;

import java.util.List;

public class Display {
    public void displayList(List<TicketDetail> ticketList) {
        for(TicketDetail ticket : ticketList) {
            System.out.println(ticket.getId() + " " + ticket.getSubject());
        }
    }

    public void displayDetail(TicketDetail ticketDetail) {
        System.out.println(ticketDetail.getId() + " " + ticketDetail.getSubject()+" "+ticketDetail.getDescription());
    }
}
