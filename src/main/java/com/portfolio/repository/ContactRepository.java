package com.portfolio.repository;

import com.portfolio.dto.ContactDTO;
import com.portfolio.interfaces.IContactRepository;
import com.portfolio.model.Contact;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ContactRepository implements PanacheRepository<Contact>, IContactRepository {

    public Contact find(Long contactId) {
        return findById(contactId);
    }

    public List<Contact> list(){
        return listAll();
    }

    public boolean delete(long contactId) {
        return Contact.deleteById(contactId);
    }

    public Contact update(long contactId, ContactDTO updateContact) {
        Contact contact = Contact.findById(contactId);
        contact.name = updateContact.name;
        contact.email = updateContact.email;
        contact.phone = updateContact.phone;
        contact.birth_date = updateContact.birth_date;

        persist(contact);

        return contact;

    }


}
