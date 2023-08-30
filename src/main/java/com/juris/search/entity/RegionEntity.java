package com.juris.search.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@IdClass(RegionPK.class)
@Table(name = "tbl-region", schema = "search")
public class RegionEntity {

    @Id
    private String stateCode;

    @Id
    private String number;

    @Id
    private String document;

    private String city;
    private String neighborhood;
    private String street;
    private String state;
    private String reference;

}
