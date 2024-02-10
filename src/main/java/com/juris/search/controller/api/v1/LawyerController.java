package com.juris.search.controller.api.v1;

import com.juris.search.entity.Lawyer;
import com.juris.search.service.LawyerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Controller
@RequestMapping("api/v1/lawyers")
public class LawyerController {

    private final LawyerService lawyerService;

    LawyerController(LawyerService lawyerService) {
        this.lawyerService = lawyerService;
    }

    @PostMapping
    public ResponseEntity<Lawyer> create(@RequestBody Lawyer lawyer) {
       return new ResponseEntity<>(lawyerService.save(lawyer), HttpStatus.CREATED);
    }

    @GetMapping("/{orderCode}/{documentCode}")
    public ResponseEntity<?> getLawyer(@PathVariable String orderCode, @PathVariable String documentCode) {
        return ResponseEntity.ok(lawyerService.get(orderCode, documentCode));
    }

}
