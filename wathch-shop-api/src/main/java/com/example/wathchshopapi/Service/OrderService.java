package com.example.wathchshopapi.Service;

import com.example.wathchshopapi.Model.Order.request.AddOrderRequestDto;
import com.example.wathchshopapi.Model.Order.response.OrderResponseDto;
import com.example.wathchshopapi.Repository.OrderDetailRepository;
import com.example.wathchshopapi.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;

    public OrderResponseDto getOrderById(Long id) {
        OrderResponseDto orderResponseDto = Optional.ofNullable(orderRepository.getById(id)).orElseThrow(
                () -> new RuntimeException("Order not found.")
        );
        orderResponseDto.setOrderDetailResponseDtos(Optional.ofNullable(orderDetailRepository.findAllByFkOrderIdAndAndIsDeleted(id, 0)).orElseThrow(
                () -> new RuntimeException("Order detail not found.")
        ));
        return orderResponseDto;
    }

    public OrderResponseDto addOrder(AddOrderRequestDto requestDto) {

        return null;
    }
}
