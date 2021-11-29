package com.qly.TicketViewer.handler;

import com.qly.TicketViewer.model.TicketDetail;
import com.qly.TicketViewer.model.Tickets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JSONHandlerTest {
    private final JSONHandler jsonHandler = new JSONHandler();
    private final TicketDetail ticketDetail = new TicketDetail(1, "Test");
    private final Tickets ticketDetailList = new Tickets(ticketDetail);

    @Test
    void convertToList() {
        String testInput = "{\"tickets\":[{\"id\":1, \"subject\":\"Test\"}]}";
        assertEquals(ticketDetailList, jsonHandler.convertToList(testInput));
    }

    @Test
    void convertToTicketDetail() {
        String testInput = "{\"ticket\":{\"id\":1, \"subject\":\"Test\"}}";
        assertEquals(ticketDetail, jsonHandler.convertToTicketDetail(testInput));
    }
}