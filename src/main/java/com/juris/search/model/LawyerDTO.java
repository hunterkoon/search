package com.juris.search.model;

import com.juris.search.entity.Lawyer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LawyerDTO {

    private String name;
    private String lastname;
    private String document;
    private String orderCode;

    public void setDTO(Lawyer entity) {
        this.name = entity.getName();
        this.lastname = entity.getLastname();
        this.document = entity.getDocument();
        this.orderCode = entity.getOrderCode();
    }
}
