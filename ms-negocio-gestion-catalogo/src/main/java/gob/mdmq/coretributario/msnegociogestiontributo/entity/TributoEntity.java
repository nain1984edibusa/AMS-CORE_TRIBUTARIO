package gob.mdmq.coretributario.msnegociogestiontributo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Tributo")
@Table(name = "COR_TRIBUTO", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "CORE")
public class TributoEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TRIBUTO_ID")
	private Long tributoId;
	
	@Column(name = "CLASE_TRIBUTO_ID")
	private Long claseTributoId;
	
	@Column(name = "DESCRIPCION_TRIBUTO")
	private String descripcionTributo;
	
	@Column(name = "DECLARATIVO")
	private String declarativo;
}
