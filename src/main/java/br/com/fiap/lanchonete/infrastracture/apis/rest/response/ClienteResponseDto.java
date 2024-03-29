package br.com.fiap.lanchonete.infrastracture.apis.rest.response;

import br.com.fiap.lanchonete.domain.Cliente;

import java.time.LocalDateTime;

public record ClienteResponseDto(Long id,
                                 String cpf,
                                 String nome,
                                 String email,
                                 String telefone,
                                 LocalDateTime dataCadastro) {

    public ClienteResponseDto(Cliente cliente) {
        this(cliente.getId(), cliente.getCpf(), cliente.getNome(), cliente.getEmail(),
                cliente.getTelefone(), cliente.getDataCadastro());
    }
}
