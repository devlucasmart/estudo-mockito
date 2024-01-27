package com.devlucasmart.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.devlucasmart.mockito.helper.ContaHelper.umaConta;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class ContaTest {
    @Spy
    private Conta conta = umaConta();

    @Test
    void validarOrdemDeChamadas() {
        conta.pagaBoleto(300);

        var inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).pagaBoleto(300);
        inOrder.verify(conta).validaSaldo(300);
        inOrder.verify(conta).debita(300);
        inOrder.verify(conta).enviaCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeDeChamadas() {
        conta.validaSaldo(300);
        conta.validaSaldo(500);
        conta.validaSaldo(600);

        Mockito.verify(conta, times(3)).validaSaldo(ArgumentMatchers.anyInt());
    }
}
