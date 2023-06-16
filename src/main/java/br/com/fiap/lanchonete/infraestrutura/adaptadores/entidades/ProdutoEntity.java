package br.com.fiap.lanchonete.infraestrutura.adaptadores.entidades;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import br.com.fiap.lanchonete.dominio.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "produtos")
public class ProdutoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@Column(name = "preco")
	private BigDecimal preco;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
	@Column(name = "dataCadastro")
	private LocalDateTime dataCadastro;

	@Column(name = "status")
	private Boolean status;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorias")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private CategoriaEntity categorias;
    
	public ProdutoEntity(String nome, String descricao, BigDecimal valor, LocalDateTime dataCadastro, boolean status, CategoriaEntity categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = valor;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.categorias = categoria;
	}
	
	public ProdutoEntity(Long id, String nome, String descricao, BigDecimal valor, LocalDateTime dataCadastro, boolean status, CategoriaEntity categoria) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = valor;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.categorias = categoria;
	}
	
    public Produto toProduto() {
        return new Produto(this.id, this.nome, this.descricao, this.preco, this.dataCadastro, this.status, this.categorias);
    }

}