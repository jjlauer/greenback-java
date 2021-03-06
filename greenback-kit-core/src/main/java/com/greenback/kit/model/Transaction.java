package com.greenback.kit.model;

import java.time.Instant;
import java.util.List;

public class Transaction extends Document {
 
    private String id;
    private TransactionType type;
    private String currencyCode;
    private String accountId;
    private String contactId;
    private List<Attachment> attachments;
    private List<Item> items;
    private TransactionTotals totals;
    private Instant transactedAt;
    private Instant dueAt;
    private Instant createdAt;
    private Instant updatedAt;
    
    // expand
    
    private Account account;
    private Contact contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public TransactionTotals getTotals() {
        return totals;
    }

    public void setTotals(TransactionTotals totals) {
        this.totals = totals;
    }

    public Instant getTransactedAt() {
        return transactedAt;
    }

    public void setTransactedAt(Instant transactedAt) {
        this.transactedAt = transactedAt;
    }

    public Instant getDueAt() {
        return dueAt;
    }

    public void setDueAt(Instant dueAt) {
        this.dueAt = dueAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}