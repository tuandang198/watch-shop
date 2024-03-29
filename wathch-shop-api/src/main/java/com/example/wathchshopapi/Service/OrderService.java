package com.example.wathchshopapi.Service;

import com.example.wathchshopapi.Model.Order.request.AddOrderRequestDto;
import com.example.wathchshopapi.Model.Order.response.OrderResponseDto;
import com.example.wathchshopapi.Repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

//    private final OrderDetailRepository orderDetailRepository;

    public OrderResponseDto getOrderById(Long id) {
        OrderResponseDto orderResponseDto = Optional.ofNullable(orderRepository.getById(id)).orElseThrow(
                () -> new RuntimeException("Order not found.")
        );
//        orderResponseDto.setOrderDetailResponseDtos(Optional.ofNullable(orderDetailRepository.findAllByFkOrderIdAndAndIsDeleted(id, 0)).orElseThrow(
//                () -> new RuntimeException("Order detail not found.")
//        ));
        return orderResponseDto;
    }

    public OrderResponseDto addOrder(AddOrderRequestDto requestDto) {

        return null;
    }
}
