package com.juris.search.controller;

import com.juris.search.dao.GenericDAO;
import com.juris.search.entity.LawyerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Controller
@RequestMapping("api/v1/lawyers")
public class LawyerController {

    @Autowired
    GenericDAO<LawyerEntity> dao;

    @PostMapping(name = "/create")
    public ResponseEntity<Long> createLawyer(@RequestBody LawyerEntity lawyer) {
        dao.save(lawyer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
