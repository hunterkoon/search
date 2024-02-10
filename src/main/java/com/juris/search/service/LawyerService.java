package com.juris.search.service;

import com.juris.search.entity.Lawyer;
import com.juris.search.model.LawyerDTO;

public interface LawyerService {

    Lawyer save(Lawyer lawyer);

    LawyerDTO get(String orderCode, String document);
}
