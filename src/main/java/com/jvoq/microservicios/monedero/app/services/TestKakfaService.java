package com.jvoq.microservicios.monedero.app.services;

import java.util.function.Consumer;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.jvoq.microservicios.monedero.app.dtos.WalletDto;
import com.jvoq.microservicios.monedero.app.models.entity.Wallet;
import com.jvoq.microservicios.monedero.app.models.repository.WalletRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TestKakfaService {

  //@Autowired
 // private WalletRepository walletRepository;

  //@Autowired
  //private ModelMapper mapper;

  @Bean
  public Consumer<WalletDto> actualizarSaldo() {
    /*
     * return walletDto -> {
     * walletRepository.findById(walletDto.getIdMonedero()).flatMap(c -> {
     * c.setSaldo(c.getSaldo() + walletDto.getSaldo());
     * 
     * return walletRepository.save(c); });
     * 
     * };
     */
    return WalletDto -> log
        .info("TRANSACCION: " + WalletDto.getCorreo() + " Descripcion: " + WalletDto.getNumCelular());

  }
  
/*
  private WalletDto convertEntityToDto(Wallet wallet) {
    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    return mapper.map(wallet, WalletDto.class);
  }

  private Wallet convertDtoToEntity(WalletDto walletDto) {
    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    return mapper.map(walletDto, Wallet.class);
  }
*/
}
