package com.juris.search.service.Impl;

import com.juris.search.entity.LawyerEntity;
import com.juris.search.repository.LawerRepository;
import com.juris.search.service.LawyerService;
import org.springframework.stereotype.Service;

@Service
public class LawyerServiceImpl implements LawyerService {

    private final LawerRepository lawerRepository;

    LawyerServiceImpl(LawerRepository lawerRepository) {
        this.lawerRepository = lawerRepository;
    }

    @Override
    public LawyerEntity save(LawyerEntity lawyer) {
        lawerRepository.save(lawyer);
        return lawyer;
    }
}
