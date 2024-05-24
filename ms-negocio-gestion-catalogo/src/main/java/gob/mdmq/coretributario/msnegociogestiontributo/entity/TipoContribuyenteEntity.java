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
@Entity(name = "TipoContribuyente")
@Table(name = "GBT_TIPO_CONTRIBUYENTE", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "CORE")
public class TipoContribuyenteEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TIPO_CONTRIBUYENTE_ID")
	private Long tipoContribuyenteId;
	
	@Column(name = "DESCRIPCION_CONTRIBUYENTE")
	private String descripcionContribuyente;
}

