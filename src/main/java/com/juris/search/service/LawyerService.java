package com.juris.search.service;

import com.juris.search.entity.LawyerEntity;
import com.juris.search.model.LawyerDTO;

public interface LawyerService {

    LawyerEntity save(LawyerEntity lawyer);

    LawyerDTO get(String orderCode, String document);
}
