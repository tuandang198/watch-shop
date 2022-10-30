package com.example.wathchshopapi.Repository;

import com.example.wathchshopapi.Model.Order.response.OrderResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderResponseDto, Long> {
    OrderResponseDto getById(Long id);

}
