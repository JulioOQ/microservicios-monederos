package com.jvoq.microservicios.monedero.app.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.jvoq.microservicios.monedero.app.models.entity.WalletTransaction;


@Repository
public interface WalletTransactionRepository extends ReactiveMongoRepository<WalletTransaction, String> {

}
