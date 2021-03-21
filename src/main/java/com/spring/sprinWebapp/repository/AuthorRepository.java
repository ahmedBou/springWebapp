package com.spring.sprinWebapp.repository;

import com.spring.sprinWebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
