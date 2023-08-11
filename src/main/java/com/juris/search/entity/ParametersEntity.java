package com.juris.search.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl-parameters", schema = "search")
public class ParametersEntity {

    @Id
    Long id;

    @Column
    String parameter;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    LawyerEntity lawyer;
}
