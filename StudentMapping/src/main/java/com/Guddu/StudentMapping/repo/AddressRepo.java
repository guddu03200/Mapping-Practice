package com.Guddu.StudentMapping.repo;

import com.Guddu.StudentMapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
