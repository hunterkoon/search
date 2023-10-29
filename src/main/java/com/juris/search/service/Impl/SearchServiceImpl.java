package com.juris.search.service.Impl;

import com.juris.search.model.SearchGeneralDTO;
import com.juris.search.service.SearchService;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService<SearchGeneralDTO>{


    @Override
    public String getHashCodeBySearch(SearchGeneralDTO type) {

        //TODO FILTER ALL FIELDS AND MAKE RELATIONSHIP TO SEARCH BY PROXIMITY
        return null;
    }


}
