package com.portfolio.interfaces;

import com.portfolio.dto.AddressDTO;
import com.portfolio.model.Address;

import java.util.List;

public interface IAddressRepository {
    public Address find(Long addressId);
    public List<Address> listAddressByContactId(Integer contactId);
    public boolean delete(long addressId);
    public Address update(long addressId, AddressDTO updateAddress);
}
