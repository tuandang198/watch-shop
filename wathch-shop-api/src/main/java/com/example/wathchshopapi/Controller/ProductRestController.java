package com.example.wathchshopapi.Controller;

import com.example.wathchshopapi.Model.Product.request.AddProductRequestDto;
import com.example.wathchshopapi.Model.Product.request.GetListProductRequestDto;
import com.example.wathchshopapi.Model.Product.response.ListProductResponseDto;
import com.example.wathchshopapi.Service.ProductService;
import com.example.wathchshopapi.Utils.ConstantsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ConstantsApi.BASE)
public class ProductRestController {

    @Autowired
    ProductService productService;

    @GetMapping
    ResponseEntity<?> getProductById(@RequestParam Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping
    ResponseEntity<?> addProduct(@RequestBody AddProductRequestDto requestDto) {
        return ResponseEntity.ok(productService.addProduct(requestDto));
    }

    @PostMapping(ConstantsApi.function.ADD)
    ResponseEntity<ListProductResponseDto> getListProduct(@RequestBody GetListProductRequestDto requestDto) {
        return ResponseEntity.ok(productService.getListProduct(requestDto));
    }
}
