package com.juris.search.service.Impl;

import com.juris.search.entity.SearchEntity;
import com.juris.search.model.SearchGeneralDTO;
import com.juris.search.repository.SeachRepository;
import com.juris.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class SearchServiceImpl implements SearchService<SearchGeneralDTO>{

private final SeachRepository repository;

    public SearchServiceImpl(SeachRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getHashCodeBySearch(SearchGeneralDTO type) {

        //TODO FILTER ALL FIELDS AND MAKE RELATIONSHIP TO SEARCH BY PROXIMITY
        repository.save(new SearchEntity().getEntity(type));
        return null;
    }
}
