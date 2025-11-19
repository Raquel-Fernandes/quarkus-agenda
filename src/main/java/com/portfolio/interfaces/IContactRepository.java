package com.portfolio.interfaces;

import com.portfolio.dto.ContactDTO;
import com.portfolio.model.Contact;

import java.util.List;

public interface IContactRepository {
    public Contact find(Long contactId);
    public List<Contact> list();
    public boolean delete(long contactId);
    public Contact update(long contactId, ContactDTO updateContact);
}
