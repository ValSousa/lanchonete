package br.com.fiap.lanchonete.infrastracture.persistence.repositories;

import br.com.fiap.lanchonete.domain.Cliente;
import br.com.fiap.lanchonete.domain.ports.repositories.ClienteRepositoryPort;
import br.com.fiap.lanchonete.infrastracture.persistence.entidades.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ClienteRepository implements ClienteRepositoryPort {

	private final SpringClientesRepository springClientesRepository;

	public ClienteRepository(SpringClientesRepository springClientesRepository) {
		this.springClientesRepository = springClientesRepository;
	}

	@Override
	public List<Cliente> buscarTodos() {
		List<ClienteEntity> clienteEntities = this.springClientesRepository.findAll();
//		return Cliente.toClientes(clienteEntities);
		return null;
	}

	@Override
	public Cliente incluir(Cliente cliente) {
		
//		LogradouroEntity logradouroEntity = new  LogradouroEntity(cliente.getEndereco().getLogradouro().getId(), cliente.getEndereco().getLogradouro().getNome());
//		EnderecoEntity enderecoEntity = new EnderecoEntity(logradouroEntity,
//				cliente.getEndereco().getId(),
//				cliente.getEndereco().getEndereco(),
//				cliente.getEndereco().getNumero(),
//				cliente.getEndereco().getComplemento(),
//				cliente.getEndereco().getBairro(),
//				cliente.getEndereco().getCidade(),
//				cliente.getEndereco().getEstado(),
//				cliente.getEndereco().getCep());
//
//		ClienteEntity entity = new ClienteEntity(
//				cliente.getCpf(),
//				cliente.getNome(),
//				cliente.getEmail(),
//				cliente.getTelefone(),
//				enderecoEntity,
//				cliente.getDataNascimento(),
//				cliente.getDataCadastro(),
//				cliente.getDataAtualizacao(),
//				cliente.getDataExclusao(),
//				cliente.getAtivo());
//
//		return new Cliente(this.springClientesRepository.save(entity));
		return null;
	}

	@Override
	public Cliente alterar(Cliente cliente) {
//		LogradouroEntity logradouroEntity = new  LogradouroEntity(cliente.getEndereco().getLogradouro().getId(), cliente.getEndereco().getLogradouro().getNome());
//		EnderecoEntity enderecoEntity = new EnderecoEntity(logradouroEntity,
//				cliente.getEndereco().getId(),
//				cliente.getEndereco().getEndereco(),
//				cliente.getEndereco().getNumero(),
//				cliente.getEndereco().getComplemento(),
//				cliente.getEndereco().getBairro(),
//				cliente.getEndereco().getCidade(),
//				cliente.getEndereco().getEstado(),
//				cliente.getEndereco().getCep());
//
//		ClienteEntity entity = new ClienteEntity(
//				cliente.getCpf(),
//				cliente.getNome(),
//				cliente.getEmail(),
//				cliente.getTelefone(),
//				enderecoEntity,
//				cliente.getDataNascimento(),
//				cliente.getDataCadastro(),
//				cliente.getDataAtualizacao(),
//				cliente.getDataExclusao(),
//				cliente.getAtivo());
//
//		return new Cliente(this.springClientesRepository.save(entity));
		return null;
	}

	@Override
	public void excluir(Long id) {
		ClienteEntity entity = this.springClientesRepository.findById(id).get();
		this.springClientesRepository.delete(entity);			
	}

	@Override
	public Cliente buscarPorCPF(String cpf) {
		ClienteEntity entity = this.springClientesRepository.findByCPF(cpf);
//		return new Cliente(entity);
		return null;
	}
}
