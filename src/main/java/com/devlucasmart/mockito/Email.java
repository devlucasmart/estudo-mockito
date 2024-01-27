package com.devlucasmart.mockito;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String enderecoEmail;
    private String mensagem;
    private Formato formato;
}
