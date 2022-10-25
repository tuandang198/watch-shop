package com.example.wathchshopapi.Controller;

import com.example.wathchshopapi.Service.ProductService;
import com.example.wathchshopapi.Utils.ConstantsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ConstantsApi.BASE)
public class ProductRestController {

    @Autowired
    ProductService productService;

    @GetMapping
    ResponseEntity<?> getProductById(@RequestParam Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
