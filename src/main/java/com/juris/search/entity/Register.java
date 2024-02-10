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
public class Register implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String username;


    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Lawyer lawyer;

    @Column
    private String password;

}
