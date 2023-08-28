package com.juris.search.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tbl-lawyer", schema = "search")
public class LawyerEntity {
    @Id
    private String document;
    @Id
    private String orderCode;

    private String name;
    private String lastname;
    private String userName;
    private String password;

    @OneToMany
    List<ParametersEntity> parameters;

    @OneToMany
    List<RegionEntity> region;
}
