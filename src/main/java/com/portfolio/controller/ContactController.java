package com.portfolio.controller;

import com.portfolio.dto.ContactDTO;
import com.portfolio.interfaces.IContactService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

@Path("/contact")
public class ContactController {

    @Inject
    private IContactService iContactService;


    @POST
    @Path("/create")
    public RestResponse<ContactDTO> create(ContactDTO contactDTO) {
        // logica

        var contact = iContactService.create(contactDTO);
        return RestResponse
                .status(RestResponse.Status.CREATED, contact);
    }

    @GET
    @Path("/list-by-id/{contactId}")
    public RestResponse<ContactDTO> listById(@PathParam("contactId") Long contactId) throws Exception {
        var contact = iContactService.listById(contactId);
        return RestResponse
                .status(RestResponse.Status.OK, contact);
    }

    @PUT
    @Path("/update/{contactId}")
    public RestResponse<ContactDTO> update(@PathParam("contactId")  Long contactId, ContactDTO contactDTO) throws Exception {
        var contact = iContactService.update(contactDTO, contactId);
        return RestResponse
                .status(RestResponse.Status.OK, contact);
    }

    @DELETE
    @Path("/delete/{contactId}")
    public RestResponse<Boolean> delete(@PathParam("contactId")  Long contactId) throws Exception {
        var contact = iContactService.delete(contactId);
        return RestResponse
                .status(RestResponse.Status.OK, true);
    }




}
