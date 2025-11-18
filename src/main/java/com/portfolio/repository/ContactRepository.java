package com.portfolio.repository;

import com.portfolio.model.Contact;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ContactRepository implements PanacheRepository<Contact> {

    public List<Contact> listAllContacts(){
        return listAll();
    }

    public Contact listByContactId(Long contactId){
        return findById(contactId);
    }
}
