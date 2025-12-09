package com.portfolio.repository;

import com.portfolio.model.Contact;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContactRepository implements PanacheRepository<Contact> {

}
