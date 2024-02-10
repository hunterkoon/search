package com.juris.search.repository;

import com.juris.search.entity.Lawyer;
import com.juris.search.entity.pk.LawyerPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LawyerRepository extends CrudRepository<Lawyer, LawyerPK> {
}
