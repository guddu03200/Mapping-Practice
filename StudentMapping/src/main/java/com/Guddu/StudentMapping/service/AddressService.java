package com.Guddu.StudentMapping.service;

import com.Guddu.StudentMapping.model.Address;
import com.Guddu.StudentMapping.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepository;

    public List<Address> getAllAddresss() {
        return addressRepository.findAll();
    }

    public Address getAddressById(String id) {
        return addressRepository.findById(Long.valueOf(id)).orElse(null);
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(String id) {
        addressRepository.deleteById(Long.valueOf(id));

    }
}
