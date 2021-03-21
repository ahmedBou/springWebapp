package com.spring.sprinWebapp.repository;

import com.spring.sprinWebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
