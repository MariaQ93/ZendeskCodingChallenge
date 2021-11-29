# Ticket Viewer

Ticket Viewer is a system that allows users to view ticket lists, as well as view the detail of a selected ticket.

## Setup

* Install the latest version of [Java](https://java.com) and [Maven](https://maven.apache.org/download.html).
* Download the TicketViewer-1.0-SNAPSHOT.jar file and remember where you saved it.
* Open up the command line, and run the program like below.

```bash
cd Download //the file location
java -jar TicketViewer-1.0-SNAPSHOT.jar 
```

## Instruction

* Follow the instruction on the command line
```bash
Typed in Tickets to view all Tickets
Typed in Details to view individual ticket
Typed in Exit to quit the system
```
* When typed in `Tickets`, it will show you the tickets list with the current page number. At the bottom, the next instructions will be shown as below
```bash
Type in n to display the next page
Type in a number to specify the page number to list
Type in q to quit listing
```
if you would like to go to a specific page, just enter the `page number`; if you would like to go to the previous page, enter the character `p`; if you would like to go to the next page, enter the character `n`.

* When typed in `Details`, the program will ask you to enter the Ticket ID which you would like to view.
```bash
Please Enter the Ticket ID:
```
* When you want to quit the program, type in `Exit` to end.



