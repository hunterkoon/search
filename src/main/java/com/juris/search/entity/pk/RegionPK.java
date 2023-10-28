package com.juris.search.entity.pk;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RegionPK implements Serializable  {


    private static final long serialVersionUID = 1L;
    @Id
    private String stateCode;

    @Id
    private String number;

    @Id
    private String document;


}