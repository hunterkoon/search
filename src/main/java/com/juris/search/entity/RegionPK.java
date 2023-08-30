package com.juris.search.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RegionPK implements Serializable  {

    @Id
    private String stateCode;

    @Id
    private String number;

    @Id
    private String document;


}
