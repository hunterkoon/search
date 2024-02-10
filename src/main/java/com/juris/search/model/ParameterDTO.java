package com.juris.search.model;

import com.juris.search.entity.Parameters;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParameterDTO {

    private List<String> parameter = new ArrayList<>();

    public final List<String> getDTO(List<Parameters> entities){

        for(Parameters param : entities){
            this.parameter.add(param.getParameter());
        }

        return parameter;
    }

}
