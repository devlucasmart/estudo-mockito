package com.devlucasmart.mockito;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Conta {
    private int saldo;

    public void pagaBoleto(int valorAPAgar) {
        validaSaldo(valorAPAgar);
        debita(valorAPAgar);
        enviaCreditoParaEmissor(valorAPAgar);
    }

    public void validaSaldo(int valorAPagar) {
        if (valorAPagar > saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(int valorAPagar) {
        this.saldo = this.saldo - valorAPagar;
    }

    public void enviaCreditoParaEmissor(int valorAPagar) {
        //envia valor para emissor do boleto
    }

}
