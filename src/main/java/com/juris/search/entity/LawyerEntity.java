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

    private String hashCode;

    private LocalDateTime inclusion;

    private String userName;
}
