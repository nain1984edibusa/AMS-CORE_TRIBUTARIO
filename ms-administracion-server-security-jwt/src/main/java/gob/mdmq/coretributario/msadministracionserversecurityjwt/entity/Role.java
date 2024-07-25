package gob.mdmq.coretributario.msadministracionserversecurityjwt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * Esta clase representa a la tabla de la BD llamada <b>roles</b>
 * en la cual las propiedades definidas aqui seran mapeadas a la tabla.
 * y en dicha tabla se encuentran los tipos de acceso al siste <b>(ADMIN, USER, PUBLIC)</b>.
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Role")
@Table(name = "roles")

public class Role implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRole;

    @Column(name = "nombre_role")
    private String nombreRole;

    private String descripcion;

}
