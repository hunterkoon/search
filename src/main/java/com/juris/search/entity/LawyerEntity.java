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
    @GeneratedValue
    private Long id;

    private String name;
    private String Lastname;
    private String document;
    private String orderCode;
    private String userName;
    private String password;

    @OneToMany
    List<ParametersEntity> parameters;
}
