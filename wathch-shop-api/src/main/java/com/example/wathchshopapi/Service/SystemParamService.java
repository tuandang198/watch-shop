package com.example.wathchshopapi.Service;

import com.example.wathchshopapi.Model.SystemParameter.response.SystemParamResponseDto;
import com.example.wathchshopapi.Repository.SystemParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemParamService {
    @Autowired
    SystemParameterRepository systemParameterRepository;

    public List<SystemParamResponseDto> getAll() {
        return systemParameterRepository.findAll();
    }
}
