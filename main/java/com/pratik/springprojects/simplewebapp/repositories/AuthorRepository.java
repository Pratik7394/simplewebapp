package com.pratik.springprojects.simplewebapp.repositories;

import com.pratik.springprojects.simplewebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
