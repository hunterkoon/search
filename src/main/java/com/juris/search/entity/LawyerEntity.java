package com.juris.search.entity;

import com.juris.search.entity.pk.LawyerPK;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@IdClass(LawyerPK.class)
@Table(name = "tbl-lawyer", schema = "search")
public class LawyerEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String document;
    @Id
    private String orderCode;

    private String name;
    private String lastname;

    @OneToMany
    private List<ParametersEntity> parameters;

    @OneToMany
    private List<RegionEntity> region;
}
