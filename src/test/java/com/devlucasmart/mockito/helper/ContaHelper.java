package com.devlucasmart.mockito.helper;

import com.devlucasmart.mockito.Conta;

public class ContaHelper {

    public static Conta umaConta() {
        return Conta.builder().saldo(1000).build();
    }
}
