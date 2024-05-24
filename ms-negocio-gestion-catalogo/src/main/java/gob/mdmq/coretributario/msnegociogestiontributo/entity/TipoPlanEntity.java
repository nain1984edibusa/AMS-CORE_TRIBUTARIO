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
@Entity(name = "TipoPlan")
@Table(name = "GBT_TIPO_PLAN", catalog = "MDMQ_CORE_TRIBUTARIO", schema = "CORE")
public class TipoPlanEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TIPO_PLAN_ID")
	private Long tipoPlanId;
	
	@Column(name = "TIPO_PROCESO_ID")
	private Long tipoProcesoId;
	
	@Column(name = "DESCRIPCION_PLAN")
	private String descripcionPlan;
}
