package Vendas.DomainModel;

import javax.persistence.*;

@Entity
@Table(name="itensvenda")

public class ItensVenda {
	@Column
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="produto")
	private Produto id_produto;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="vendas")
	private Vendas id_venda;
	
	@Column
	private int quantidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getId_produto() {
		return id_produto;
	}

	public void setId_produto(Produto id_produto) {
		this.id_produto = id_produto;
	}

	public Vendas getId_venda() {
		return id_venda;
	}

	public void setId_venda(Vendas id_venda) {
		this.id_venda = id_venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
