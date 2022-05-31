package com.jvoq.microservicios.monedero.app.services;


import com.jvoq.microservicios.monedero.app.dtos.WalletTransactionDto;
import com.jvoq.microservicios.monedero.app.models.entity.WalletTransaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WalletTransactionService {

	public Flux<WalletTransactionDto> findAll();

	public Mono<WalletTransactionDto> findById(String id);

	public Mono<WalletTransactionDto> save(WalletTransactionDto walletTransactionDto);

	public Mono<WalletTransactionDto> update(WalletTransactionDto walletTransactionDto, String id);

	public Mono<Void> delete(WalletTransaction walletTransaction);
}
