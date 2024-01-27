package com.devlucasmart.mockito;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosLocalizacao {
    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;
}
