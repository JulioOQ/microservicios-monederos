package com.jvoq.microservicios.monedero.app.kafka;



import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {
  

  private String idTransaccion;
  private String medioPago;
  private Double monto;
  private String numeroTransaccion;
  private String idCuenta;
  private String idMonederoMovil;
  private Date fecha;


}
