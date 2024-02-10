package com.juris.search.entity;

import com.juris.search.entity.pk.LawyerPK;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(LawyerPK.class)
@Table(name = "tbl-lawyer", schema = "search")
public class Lawyer implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false)
    private String document;

    @Id
    @Column(nullable = false)

    private String orderCode;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastname;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Parameters> parameters;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Region> region;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Register register;

    public static boolean equalsNull(Lawyer lawyer) {
        return lawyer.getDocument().isBlank() || lawyer.getOrderCode().isBlank()
                    || lawyer.getName().isBlank() || lawyer.getLastname().isBlank();
    }

}
