package com.juris.search.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(name = "tbl-lawyer", schema = "search")
public class LawyerEntity {
    @Id
    private Long id;

    private String name;
    private String Lastname;
    private String document;
    private String orderCode;
    private String userName;
    private String password;
}
