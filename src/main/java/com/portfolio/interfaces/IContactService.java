package com.portfolio.interfaces;

import com.portfolio.dto.ContactDTO;
import com.portfolio.model.Contact;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface IContactService {

    ContactDTO create(ContactDTO contactDTO);
    public ContactDTO update(ContactDTO contactDTO, Long contactId) throws Exception;
    boolean delete(Long contactId) throws Exception;
    ContactDTO listById(Long contactId) throws Exception;
}
