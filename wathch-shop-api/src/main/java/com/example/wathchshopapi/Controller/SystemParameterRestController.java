package com.example.wathchshopapi.Controller;

import com.example.wathchshopapi.Service.SystemParamService;
import com.example.wathchshopapi.Utils.ConstantsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ConstantsApi.SYSTEM_PARAM)
public class SystemParameterRestController {
    @Autowired
    SystemParamService systemParamService;

    @GetMapping(ConstantsApi.function.GET_ALL)
    ResponseEntity<List<?>> getAll() {
        return ResponseEntity.ok(systemParamService.getAll());
    }
}
