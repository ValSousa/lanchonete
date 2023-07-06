package br.com.fiap.lanchonete.infrastracture.persistence.repositories;

import br.com.fiap.lanchonete.domain.Pedido;
import br.com.fiap.lanchonete.domain.ports.repositories.PedidoRepositoryPort;
import br.com.fiap.lanchonete.infrastracture.persistence.entidades.PedidoEntity;
import br.com.fiap.lanchonete.infrastracture.persistence.entidades.ProdutoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Slf4j
@Component
public class PedidoRepository implements PedidoRepositoryPort {

	private final SpringPedidosRepository springPedidosRepository;

	public PedidoRepository(SpringPedidosRepository springPedidosRepository) {
		this.springPedidosRepository = springPedidosRepository;
	}


	@Override
	public List<Pedido> buscarTodos() {
		List<PedidoEntity> pedidosEntities = this.springPedidosRepository.findAll();
		return pedidosEntities.stream().map(PedidoEntity::toPedido).toList();
	}

	@Override
	public Optional<Pedido> buscarPorId(Long id) {
		Optional<PedidoEntity> optionalPedidoEntity = this.springPedidosRepository.findById(id);
		return optionalPedidoEntity.map(PedidoEntity::toPedido);
	}

	@Override
	public Optional<Pedido> buscarPorCodigoPedido(String codigo) {
		Optional<PedidoEntity> optionalPedidoEntity = this.springPedidosRepository.findByCodigoPedido(codigo);
		return optionalPedidoEntity.map(PedidoEntity::toPedido);
	}

	@Override
	public Pedido salvar(Pedido pedido) {
		PedidoEntity pedidoEntity = this.springPedidosRepository.save(new PedidoEntity(pedido));
		return pedidoEntity.toPedido();
	}
}
