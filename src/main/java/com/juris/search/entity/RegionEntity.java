package com.juris.search.entity;

import com.juris.search.entity.pk.RegionPK;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@IdClass(RegionPK.class)
@Table(name = "tbl-region", schema = "search")
public class RegionEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
