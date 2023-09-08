package com.icia.practice.service;

import com.icia.practice.dto.PracticeDTO;
import com.icia.practice.repository.PracticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeService {

    @Autowired
    PracticeRepository practiceRepository = new PracticeRepository();
    public void save(PracticeDTO practiceDTO) {
        practiceRepository.save(practiceDTO);
    }

    public boolean login(PracticeDTO practiceDTO) {
        PracticeDTO loginDTO = practiceRepository.login(practiceDTO);
        if (loginDTO == null) {
            return false;
        }else {
            return true;
        }
    }
}
