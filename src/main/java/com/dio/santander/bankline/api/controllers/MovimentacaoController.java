package com.dio.santander.bankline.api.controllers;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repositori.CorrentistaRepoitory;
import com.dio.santander.bankline.api.repositori.MovimentacaoRepository;
import com.dio.santander.bankline.api.service.CorrentistaSevice;
import com.dio.santander.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentaçoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();

    }
    @PostMapping
    public  void save(@RequestBody NovaMovimentacao movimentacao){
        service.save(movimentacao);

    }
}
