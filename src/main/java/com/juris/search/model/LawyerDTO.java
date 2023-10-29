package com.juris.search.model;

import com.juris.search.entity.LawyerEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LawyerDTO {

    private String name;
    private String lastname;
    private String document;
    private String orderCode;

    public final LawyerDTO getDTO(LawyerEntity entity){
        this.name = entity.getName();
        this.lastname = entity.getLastname();
        this.document = entity.getDocument();
        this.orderCode = entity.getOrderCode();
        return this;
    }

}
