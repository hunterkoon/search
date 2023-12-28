package com.juris.search.service.Impl;

import com.juris.search.entity.LawyerEntity;
import com.juris.search.entity.pk.LawyerPK;
import com.juris.search.exception.HandlerException;
import com.juris.search.model.LawyerDTO;
import com.juris.search.repository.LawyerRepository;
import com.juris.search.service.LawyerService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LawyerServiceImpl implements LawyerService {

    private final LawyerRepository lawerRepository;

    LawyerServiceImpl(LawyerRepository lawerRepository) {
        this.lawerRepository = lawerRepository;
    }

    @Override
    @Transactional
    public LawyerEntity save(LawyerEntity lawyerEntity) {

        lawerRepository.save(LawyerEntity.builder()
                .document(lawyerEntity.getDocument())
                .name(lawyerEntity.getName())
                .orderCode(lawyerEntity.getOrderCode())
                .parameters(lawyerEntity.getParameters())
                //.region(lawyerEntity.getRegion())
                .register(lawyerEntity.getRegister())
                .build());

        return lawyerEntity;
    }

    @Override
    public LawyerDTO get(String orderCode, String document) {
        LawyerPK pk = new LawyerPK().getPK(document, orderCode);
        Optional<LawyerEntity> lawyer = lawerRepository.findById(pk);
        if (lawyer.isPresent()) {
            return new LawyerDTO().getDTO(lawyer.get());
        }
        throw new HandlerException("No Client Found");
    }
}
