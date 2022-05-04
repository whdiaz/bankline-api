package com.dio.santander.bankline.api.controllers;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repositori.CorrentistaRepoitory;
import com.dio.santander.bankline.api.service.CorrentistaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepoitory repository;

    @Autowired
    private CorrentistaSevice service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();

    }
    @PostMapping
    public  void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista);

    }
}
