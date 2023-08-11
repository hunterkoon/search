package com.juris.search.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class SearchGeneralDTO {

    private String profession;
    private String name;
    private Integer experienceYears;
    private String Lastname;
    private String document;
    private String orderCode;
    private String userCode;
    private Set<String> parameters;



    //TODO ADD ALL PARAMETERS OF POSSIBLE TO SEACH AND RETURN LIMITED NUMBERS OF LAWYERS;
}
