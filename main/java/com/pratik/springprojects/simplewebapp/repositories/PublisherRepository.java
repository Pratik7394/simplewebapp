package com.pratik.springprojects.simplewebapp.repositories;

import com.pratik.springprojects.simplewebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
