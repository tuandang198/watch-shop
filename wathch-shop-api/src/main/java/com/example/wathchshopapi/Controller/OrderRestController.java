package com.example.wathchshopapi.Controller;

import com.example.wathchshopapi.Model.Order.request.AddOrderRequestDto;
import com.example.wathchshopapi.Service.OrderService;
import com.example.wathchshopapi.Utils.ConstantsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ConstantsApi.ORDER)
public class OrderRestController {
    @Autowired
    OrderService orderService;

    @GetMapping
    ResponseEntity<?> getOrderById(@RequestParam Long id) {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @PostMapping
    ResponseEntity<?> addOrder(@RequestBody AddOrderRequestDto requestDto) {
        return ResponseEntity.ok(orderService.addOrder(requestDto));
    }
}
