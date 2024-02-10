package com.juris.search.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "tbl-region", schema = "search")
public class Region implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String stateCode;
    private String number;
    private String city;
    private String neighborhood;
    private String street;
    private String state;
    private String reference;

    @ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lawyer lawyer;

}
