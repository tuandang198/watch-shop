package com.example.wathchshopapi.Repository;

import com.example.wathchshopapi.Model.Order.response.OrderDetailResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailResponseDto, Long> {
    List<OrderDetailResponseDto> findAllByFkOrderIdAndAndIsDeleted(Long fkOrderId, Integer isDeleted);
}
