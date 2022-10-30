package com.example.wathchshopapi.Repository;

import com.example.wathchshopapi.Model.SystemParameter.response.SystemParamResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemParameterRepository extends JpaRepository<SystemParamResponseDto, Long> {
    List<SystemParamResponseDto> findAll();
}
