package com.Guddu.StudentMapping.repo;

import com.Guddu.StudentMapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop, String> {
}
