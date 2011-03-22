package Vendas.DomainModel;

//import java.sql.Date;
import javax.persistence.*;

@Entity
@Table (name="vendas")

public class Vendas {
	
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(fetch=FetchType.LAZY)
	@Id
	private int id;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	//@Column(name="Data")
    //private Date data;

	@Column(name="ValorTotal")
	private float valortotal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//public Date getData() {
	//	return getData();
	//}
	
	//public void setData(Date data) {
	//	this.data = data;
	//}

	
	public float getValortotal() {
		return valortotal;
	}

	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}

	

}
