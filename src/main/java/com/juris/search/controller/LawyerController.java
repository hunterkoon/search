package com.juris.search.controller;

import com.juris.search.model.LawyerDTO;
import com.juris.search.model.SearchGeneralDTO;
import com.juris.search.service.SearchService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/lawyers")
public class LawyerController {


    public ResponseEntity<Long> createLawyer(@RequestBody LawyerDTO lawyer) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
