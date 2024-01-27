package com.devlucasmart.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static com.devlucasmart.mockito.helper.PessoaHelper.dadosLocalizacao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    @Mock
    private ApiDosCorreios apiDosCorreios;
    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        when(apiDosCorreios.buscarDadosComBaseNoCep("73800000")).thenReturn(dadosLocalizacao());
        var pessoa = cadastrarPessoa.cadastrarPessoa("Lucas", "87687687687", LocalDate.now(), "73800000");

        assertEquals("Lucas", pessoa.getNome());
        assertEquals("apt", pessoa.getEndereco().getComplemento());
    }
}
