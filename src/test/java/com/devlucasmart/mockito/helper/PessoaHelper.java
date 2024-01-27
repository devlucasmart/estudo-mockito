package com.devlucasmart.mockito.helper;

import com.devlucasmart.mockito.DadosLocalizacao;

public class PessoaHelper {
    public static DadosLocalizacao dadosLocalizacao() {
        return DadosLocalizacao.builder()
                .uf("MG")
                .bairro("Centro")
                .logradouro("Rua 2")
                .complemento("apt")
                .cidade("Patos de Minas")
                .build();
    }
}
