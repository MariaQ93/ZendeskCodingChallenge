package com.qly.TicketViewer.handler;

import com.google.gson.Gson;
import com.qly.TicketViewer.model.Ticket;
import com.qly.TicketViewer.model.TicketDetail;
import com.qly.TicketViewer.model.Tickets;

public class JSONHandler {
    public Tickets convertToList(String json) {
        Gson gson = new Gson();
        Tickets tickets = gson.fromJson(json, Tickets.class);

        return tickets;
    }

    public TicketDetail convertToTicketDetail(String json) {
        //TODO:
        Gson gson = new Gson();
        Ticket ticket = gson.fromJson(json, Ticket.class);

        TicketDetail ticketDetail = ticket.getTicket();
        return ticketDetail;
    }
}
