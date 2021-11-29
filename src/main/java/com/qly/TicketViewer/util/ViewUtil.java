package com.qly.TicketViewer.util;

import java.io.FileNotFoundException;
import java.net.ConnectException;

public class ViewUtil {
    public String getAllTickets(int pageNum) throws FileNotFoundException, ConnectException {
        //TODO: request URL to get response of tickets
        String requestUrl = "https://zccqly.zendesk.com/api/v2/tickets.json?per_page=25&page="+pageNum;
        String string = HttpUtil.httpRequest(requestUrl);
        return string;
    }

    public String getTicketDetails(int ticketId) throws FileNotFoundException, ConnectException {
        //TODO:
        String requestUrl = "https://zccqly.zendesk.com/api/v2/tickets/"+ ticketId + ".json";
        String string = HttpUtil.httpRequest(requestUrl);
        return string;
    }
}
