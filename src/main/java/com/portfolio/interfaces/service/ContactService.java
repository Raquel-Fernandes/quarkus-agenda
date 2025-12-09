package com.portfolio.interfaces.service;

import com.portfolio.dto.ContactDTO;
import com.portfolio.model.Contact;
import com.portfolio.map.ContactMapper;
import com.portfolio.repository.ContactRepository;
import com.portfolio.interfaces.IContactService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ContactService implements IContactService {

    @Inject
    private ContactRepository contactRepository;
    @Inject
    ContactMapper mapper;

    @Transactional
    public ContactDTO create(ContactDTO contactDTO)
    {
        // abrir transação
        Contact contact = mapper.toEntity(contactDTO);
        contactRepository.persist(contact);

        contactDTO = mapper.toDTO(contact);

        return contactDTO;
    }

    @Transactional
    public ContactDTO update(ContactDTO contactDTO, Long contactId) throws Exception {
        Contact contact = contactRepository.findById(contactId);

        if(contact == null) {
            throw new Exception("Contato não existente");
        }

        Contact updateContact = mapper.toEntity(contactDTO);

        contact.setName(updateContact.name);
        contact.setEmail(updateContact.email);
        contact.setPhone(updateContact.phone);
        contact.setBirthDate(updateContact.birthDate);

        return mapper.toDTO(contact);
    }

    @Transactional
    public boolean delete(Long contactId) throws Exception {
        Contact contact = contactRepository.findById(contactId);

        if(contact == null) {
            throw new Exception("Contato não existente");
        }

        contactRepository.delete(contact);
        return true;
    }

    public ContactDTO listById(Long contactId) throws Exception {
        Contact contact = contactRepository.findById(contactId);

        if(contact == null) {
            throw new Exception("Contato não existente");
        }

        return mapper.toDTO(contact);
    }





}
