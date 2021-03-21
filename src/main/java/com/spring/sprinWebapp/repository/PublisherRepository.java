package com.spring.sprinWebapp.repository;

import com.spring.sprinWebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
