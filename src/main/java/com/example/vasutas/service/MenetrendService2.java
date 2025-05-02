package com.example.vasutas.service;

import com.example.vasutas.dto.MenetrendViewDto;
import com.example.vasutas.model.Menetrend2;
import com.example.vasutas.repository.MenetrendRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenetrendService2 {

    @Autowired
    private MenetrendRepository2 menetrendRepository;

    public List<Menetrend2> findAll() {
        return menetrendRepository.findAll();
    }

    public Menetrend2 save(Menetrend2 menetrend) {
        return menetrendRepository.save(menetrend);
    }

    public void delete(Long id) {
        menetrendRepository.deleteById(id);
    }

    public List<MenetrendViewDto> getMenetrendView() {
        return menetrendRepository.findMenetrendView();
    }
}