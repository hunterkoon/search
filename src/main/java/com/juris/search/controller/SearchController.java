package com.juris.search.controller;

import com.juris.search.model.SearchGeneralDTO;
import com.juris.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/search")
public class SearchController {
    private final SearchService<SearchGeneralDTO> searchService;

    public SearchController(SearchService<SearchGeneralDTO> service) {
        this.searchService = service;
    }

    @PostMapping
    public ResponseEntity<String> getHashCodeByParameters(@RequestBody SearchGeneralDTO searchGeneral){
        //TODO PASS METHOD DEPEND OF ITEMS IN REQUEST
        searchService.getHashCodeBySearch(searchGeneral);
        return  ResponseEntity.ok("");
    }
}
