package com.juris.search.entity.pk;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LawyerPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String document;
    @Id
    private String orderCode;

}