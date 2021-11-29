package com.qly.TicketViewer.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TicketDetail {
    String url;
    Integer id;
    Integer external_id;
    Map<String, Object> via;
    Date created_at;
    Date updated_at;
    String type;
    String subject;
    String raw_subject;
    String description;
    String priority;
    String status;
    String recipient;
    Long requester_id;
    Long submitter_id;
    Long assignee_id;
    Long organization_id;
    Long group_id;
    List<Long> collaborator_ids;
    List<Long> follower_ids;
    List<Long> email_cc_ids;
    Long forum_topic_id;
    Long problem_id;
    Boolean has_incidents;
    Boolean is_public;
    Date due_at;
    List<String> tags;
    List<String> custom_fields;
    Object satisfaction_rating;
    List<Long> sharing_agreement_ids;
    List<String> fields;
    List<Long> followup_ids;
    Long ticket_form_id;
    Long brand_id;
    Boolean allow_channelback;
    Boolean allow_attachments;

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public TicketDetail(int id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public TicketDetail() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDetail that = (TicketDetail) o;
        return Objects.equals(url, that.url) && Objects.equals(id, that.id) && Objects.equals(external_id, that.external_id) && Objects.equals(via, that.via) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(type, that.type) && Objects.equals(subject, that.subject) && Objects.equals(raw_subject, that.raw_subject) && Objects.equals(description, that.description) && Objects.equals(priority, that.priority) && Objects.equals(status, that.status) && Objects.equals(recipient, that.recipient) && Objects.equals(requester_id, that.requester_id) && Objects.equals(submitter_id, that.submitter_id) && Objects.equals(assignee_id, that.assignee_id) && Objects.equals(organization_id, that.organization_id) && Objects.equals(group_id, that.group_id) && Objects.equals(collaborator_ids, that.collaborator_ids) && Objects.equals(follower_ids, that.follower_ids) && Objects.equals(email_cc_ids, that.email_cc_ids) && Objects.equals(forum_topic_id, that.forum_topic_id) && Objects.equals(problem_id, that.problem_id) && Objects.equals(has_incidents, that.has_incidents) && Objects.equals(is_public, that.is_public) && Objects.equals(due_at, that.due_at) && Objects.equals(tags, that.tags) && Objects.equals(custom_fields, that.custom_fields) && Objects.equals(satisfaction_rating, that.satisfaction_rating) && Objects.equals(sharing_agreement_ids, that.sharing_agreement_ids) && Objects.equals(fields, that.fields) && Objects.equals(followup_ids, that.followup_ids) && Objects.equals(ticket_form_id, that.ticket_form_id) && Objects.equals(brand_id, that.brand_id) && Objects.equals(allow_channelback, that.allow_channelback) && Objects.equals(allow_attachments, that.allow_attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, id, external_id, via, created_at, updated_at, type, subject, raw_subject, description, priority, status, recipient, requester_id, submitter_id, assignee_id, organization_id, group_id, collaborator_ids, follower_ids, email_cc_ids, forum_topic_id, problem_id, has_incidents, is_public, due_at, tags, custom_fields, satisfaction_rating, sharing_agreement_ids, fields, followup_ids, ticket_form_id, brand_id, allow_channelback, allow_attachments);
    }
}
