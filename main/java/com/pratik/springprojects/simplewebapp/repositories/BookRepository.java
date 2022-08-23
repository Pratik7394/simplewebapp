package com.pratik.springprojects.simplewebapp.repositories;

import com.pratik.springprojects.simplewebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long > {

}
