package com.juris.search.entity;

import com.juris.search.entity.pk.RegisterPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(RegisterPK.class)
@Table(name = "tbl-register", schema = "search")
public class RegisterEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String username;

    @Id
    private String document;

    @Column
    private String password;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private LawyerEntity lawyer;


}
