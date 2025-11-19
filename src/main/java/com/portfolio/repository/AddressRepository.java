package com.portfolio.repository;

import com.portfolio.dto.AddressDTO;
import com.portfolio.interfaces.IAddressRepository;
import com.portfolio.model.Address;
import com.portfolio.model.Contact;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AddressRepository implements PanacheRepository<Address>, IAddressRepository {

    public Address find(Long addressId) {
        return findById(addressId);
    }

    public List<Address> listAddressByContactId(Integer contactId){
        return Address.list("contact_id", contactId);
    }

    public boolean delete(long addressId) {
        return Address.deleteById(addressId);
    }

    public Address update(long addressId, AddressDTO updateAddress) {
        Address address = Address.findById(addressId);
        address.street = updateAddress.street;
        address.number = updateAddress.number;
        address.zip_code = updateAddress.zip_code;

        persist(address);

        return address;

    }
}
