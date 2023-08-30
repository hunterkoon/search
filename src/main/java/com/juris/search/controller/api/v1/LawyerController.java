package com.juris.search.controller.api.v1;

import com.juris.search.dao.GenericDAO;
import com.juris.search.entity.LawyerEntity;
import com.juris.search.entity.LawyerPK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Controller
@RequestMapping("api/v1/lawyers")
public class LawyerController {

    @Autowired
    private GenericDAO<LawyerEntity, LawyerPK> dao;

    @PostMapping
    public ResponseEntity<Long> createLawyer(@RequestBody LawyerEntity lawyer) {
        dao.save(lawyer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{lawyerCode}/{documentCode}")
    public ResponseEntity<LawyerEntity> getLawyer(@PathVariable String lawyerCode, @PathVariable String documentCode) {
        return new ResponseEntity<>(dao.findOne(new LawyerPK(lawyerCode, documentCode)), HttpStatus.OK);

    }

}
