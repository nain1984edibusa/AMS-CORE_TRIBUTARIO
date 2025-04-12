package pe.edu.galaxy.training.java.sb.ms.msnegociogestionclientes.entity;

import java.util.List;

import org.hibernate.annotations.Where;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.util.Objects.isNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PedidoCabecera")
@Table(name = "tbl_pedido_cabecera")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PedidoCabeceraEntity {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "pedido_id")
	private Long id;
		
	@Column(name = "cliente_id")
	private Long idCliente;
	
	@Column(name = "glosa")
	private String glosa; // Resumen 

	@Column(name = "fecha_registro")
	private String fechaRegistro;
	
	@Column(name = "total")
	private Double total;
	
	@Column(name = "estado")
	private String estado;

	//
	@OneToMany(mappedBy = "pedidoCabecera", cascade = CascadeType.ALL)
	@Where(clause = "estado='1'")
	private List<PedidoDetalleEntity> listPedidoDetalle;
	

	public void calcularTotal() {
		
	Double tmpTotal=0.0;
		
		for (PedidoDetalleEntity pie : listPedidoDetalle) {
			if (isNull(listPedidoDetalle)|| listPedidoDetalle.isEmpty() || isNull(pie)) {
				setTotal(0.0);
			}
			
			tmpTotal+=pie.getSubTotal();
		}
		setTotal(tmpTotal);
	}

}

