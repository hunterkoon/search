package com.juris.search.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.sound.midi.Sequence;
import java.time.LocalDateTime;
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
}
