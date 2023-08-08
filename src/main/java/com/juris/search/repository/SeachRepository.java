package com.juris.search.repository;

import com.juris.search.entity.SearchEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeachRepository  extends CrudRepository<SearchEntity , Long> {
}
