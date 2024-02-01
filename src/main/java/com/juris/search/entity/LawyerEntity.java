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
public class LawyerEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String document;
    @Id
    private String orderCode;

    private String name;
    private String lastname;

    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<ParametersEntity> parameters;

    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<RegionEntity> region;

    @OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private RegisterEntity register;

}
