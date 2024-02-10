package com.juris.search.service.Impl;

import com.juris.search.entity.Lawyer;
import com.juris.search.entity.pk.LawyerPK;
import com.juris.search.exception.HandlerException;
import com.juris.search.model.LawyerDTO;
import com.juris.search.repository.LawyerRepository;
import com.juris.search.service.LawyerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Slf4j
public class LawyerServiceImpl implements LawyerService {

    private final LawyerRepository lawerRepository;

    LawyerServiceImpl(LawyerRepository lawerRepository) {
        this.lawerRepository = lawerRepository;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Lawyer save(Lawyer lawyer) {

        lawerRepository.save(Lawyer.builder()
                .document(lawyer.getDocument())
                .name(lawyer.getName())
                .lastname(lawyer.getLastname())
                .orderCode(lawyer.getOrderCode())
                .parameters(lawyer.getParameters())
                .region(lawyer.getRegion())
                .register(lawyer.getRegister())
                .build());

        return lawyer;
    }

    @Override
    public LawyerDTO get(String orderCode, String document) {
        LawyerDTO lawyerDTO = new LawyerDTO();
        Optional<Lawyer> lawyer =
                lawerRepository.findById(new LawyerPK(document, orderCode));
        lawyer.ifPresentOrElse(lawyerDTO::setDTO, () -> {
                    throw new HandlerException("No Client Found");
                }
        );
        return lawyerDTO;
    }

}
