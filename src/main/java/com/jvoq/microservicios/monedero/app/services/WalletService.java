package com.jvoq.microservicios.monedero.app.services;

import com.jvoq.microservicios.monedero.app.dtos.WalletDto;
import com.jvoq.microservicios.monedero.app.models.entity.Wallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface WalletService {
  public Flux<WalletDto> findAll();

  public Mono<WalletDto> findById(String id);

  public Mono<WalletDto> save(WalletDto walletDto);

  public Mono<WalletDto> update(WalletDto walletDto, String id);

  public Mono<Void> delete(Wallet wallet);

  public Mono<WalletDto> findByCellphoneNumber(String cellphoneNumber);
}
