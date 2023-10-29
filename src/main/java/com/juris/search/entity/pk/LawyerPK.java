package com.juris.search.entity.pk;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class LawyerPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String document;
    @Id
    private String orderCode;

    public LawyerPK getPK(String document , String orderCode){
        this.document = document;
        this.orderCode = orderCode;
        return this;
    }

}
