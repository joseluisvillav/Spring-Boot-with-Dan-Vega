package com.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.crud.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}
