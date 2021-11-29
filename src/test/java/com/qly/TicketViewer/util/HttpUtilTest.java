package com.qly.TicketViewer.util;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.net.ConnectException;

import static org.junit.jupiter.api.Assertions.*;

class HttpUtilTest {
    private final String urlString = "https://zccqly.zendesk.com/api/v2/tickets/1";
    private final String testString = "{\"ticket\":{\"url\":\"https://zccqly.zendesk.com/api/v2/tickets/1.json\",\"id\":1,\"external_id\":null,\"via\":{\"channel\":\"sample_ticket\",\"source\":{\"from\":{},\"to\":{},\"rel\":null}},\"created_at\":\"2021-11-29T00:39:04Z\",\"updated_at\":\"2021-11-29T00:39:05Z\",\"type\":\"incident\",\"subject\":\"Sample ticket: Meet the ticket\",\"raw_subject\":\"Sample ticket: Meet the ticket\",\"description\":\"Hi there,\\n\\nI’m sending an email because I’m having a problem setting up your new product. Can you help me troubleshoot?\\n\\nThanks,\\n The Customer\\n\\n\",\"priority\":\"normal\",\"status\":\"open\",\"recipient\":null,\"requester_id\":422087797852,\"submitter_id\":422087795592,\"assignee_id\":422087795592,\"organization_id\":null,\"group_id\":4414986840717,\"collaborator_ids\":[],\"follower_ids\":[],\"email_cc_ids\":[],\"forum_topic_id\":null,\"problem_id\":null,\"has_incidents\":false,\"is_public\":true,\"due_at\":null,\"tags\":[\"sample\",\"support\",\"zendesk\"],\"custom_fields\":[],\"satisfaction_rating\":null,\"sharing_agreement_ids\":[],\"fields\":[],\"followup_ids\":[],\"ticket_form_id\":360003531312,\"brand_id\":360007079932,\"allow_channelback\":false,\"allow_attachments\":true}}";
    @Test
    void httpRequest() {
        try {
            assertEquals(testString, HttpUtil.httpRequest(urlString));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ConnectException e) {
            e.printStackTrace();
        }
    }
}