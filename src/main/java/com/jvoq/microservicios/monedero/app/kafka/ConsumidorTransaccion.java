package com.jvoq.microservicios.monedero.app.kafka;

import java.util.function.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.jvoq.microservicios.monedero.app.services.WalletService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ConsumidorTransaccion {

  @Autowired
  private WalletService walletService;

  @Bean
  public Consumer<Transaccion> transaccion() {

    return transaccion -> {
      log.info("idMonedero " + transaccion.getIdMonederoMovil() + "monto " + transaccion.getMonto());

      if (transaccion.getMedioPago().toLowerCase().equals("yanqui")) {
        log.info("Si pertenece a yanqui, idMonedero " + transaccion.getIdMonederoMovil() + "monto " + transaccion.getMonto());

        walletService.updateSaldo(transaccion.getIdMonederoMovil(), transaccion.getMonto()).subscribe();
      } else {
        log.info(
            "No pertenece a yanqui,idMonedero " + transaccion.getIdMonederoMovil() + "monto " + transaccion.getMonto());

      }

    };

  }
}
