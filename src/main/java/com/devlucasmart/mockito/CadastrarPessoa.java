package com.devlucasmart.mockito;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastrarPessoa {
    private ApiDosCorreios apiDosCorreios;
    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        var pessoa = new Pessoa(nome, documento, nascimento);
        var dadosLocalizacao = apiDosCorreios.buscarDadosComBaseNoCep(cep);
        pessoa.adicionarDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }
}
