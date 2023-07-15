package com.Guddu.StudentMapping.repo;

import com.Guddu.StudentMapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, String> {
}
