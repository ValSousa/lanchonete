package br.com.fiap.lanchonete.infrastracture.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.lanchonete.infrastracture.persistence.entidades.EnderecoEntity;

@Repository
public interface SpringEnderecosRepository extends JpaRepository<EnderecoEntity, Long> {

}