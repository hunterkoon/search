package com.juris.search.controller.api.v1;

import com.juris.search.dao.GenericDAO;
import com.juris.search.entity.LawyerEntity;
import com.juris.search.entity.RegionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Controller
@RequestMapping("api/v1/regions")
public class RegionController {

    @Autowired
    GenericDAO<RegionEntity> dao;

    @PostMapping
    public ResponseEntity<Long> createRegion(@RequestBody List<RegionEntity> regions) {
        dao.saveAll(regions);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}