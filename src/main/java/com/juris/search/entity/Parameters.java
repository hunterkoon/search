package com.juris.search.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "tbl-parameters", schema = "search")
@SequenceGenerator(name = "PARAM_SQ", sequenceName = "PARAMETER_SEQ", initialValue = 1, allocationSize = 1)
public class Parameters implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAM_SQ")
    private Long id;

    @Column
    private String parameter;

    @Column
    private String orderCode;

    @ManyToOne(cascade = CascadeType.PERSIST , fetch = FetchType.LAZY)
    private Lawyer lawyer;
}
