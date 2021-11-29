package com.qly.TicketViewer.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tickets {
    List<TicketDetail> tickets;
    int count;
    String next_page;
    String previous_page;

    public Tickets() {
        super();
    }

    public Tickets(TicketDetail ticketDetail) {
        tickets = Arrays.asList(ticketDetail);
    }

    public List<TicketDetail> getTickets() {
        return tickets;
    }

    public int getCount() {
        return count;
    }

    public String getNext_page() {
        return next_page;
    }

    public String getPrevious_page() {
        return previous_page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tickets tickets1 = (Tickets) o;
        return count == tickets1.count && Objects.equals(tickets, tickets1.tickets) && Objects.equals(next_page, tickets1.next_page) && Objects.equals(previous_page, tickets1.previous_page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tickets, count, next_page, previous_page);
    }
}
