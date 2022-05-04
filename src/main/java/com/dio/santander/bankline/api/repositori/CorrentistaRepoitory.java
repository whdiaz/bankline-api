package com.dio.santander.bankline.api.repositori;

import com.dio.santander.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepoitory extends JpaRepository<Correntista, Integer> {
}
