package com.portfolio.repository;


import com.portfolio.model.Address;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AddressRepository implements PanacheRepository<Address> {

    public List<Address> listAddressByContactId(Integer contactId){
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
