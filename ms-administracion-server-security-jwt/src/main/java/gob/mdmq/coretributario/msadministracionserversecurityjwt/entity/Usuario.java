package gob.mdmq.coretributario.msadministracionserversecurityjwt.entity;

import jakarta.persistence.CascadeType;

/*import javax.persistence.*;
import javax.validation.constraints.NotNull;*/

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa a la tabla de la BD llamada <b>usuarios</b>
 * en la cual las propiedades definidas aqui seran mapeadas a la tabla.
 * Ya que existe una relacion de Muchos a Muchos con la Tabla roles se genera la relacion
 * @ManyToMany con la tabla {@link Role}.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    /* ~ Propiedades
    ==================================== */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @NotNull
    private String username;

    @NotNull
    private String correo;

    @NotNull
    private String password;

    private boolean activo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	 
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "id_usuario", nullable = false),
            inverseJoinColumns = @JoinColumn(name="id_role", nullable = false)
        )
    
   
    private List<Role> roles;

    /* ~ Metodos
    ==================================== */
	/*
	 * public Usuario(){ roles = new ArrayList<Role>(); }
	 * 
	 * public Integer getIdUsuario() { return idUsuario; }
	 * 
	 * public String getUsername() { return username; }
	 * 
	 * public void setUsername(String username) { this.username = username; }
	 * 
	 * public String getCorreo() { return correo; }
	 * 
	 * public void setCorreo(String correo) { this.correo = correo; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 * 
	 * public boolean isActivo() { return activo; }
	 * 
	 * public void setActivo(boolean activo) { this.activo = activo; }
	 */
	 public List<Role> getRoles() { return roles; }
	  
	  public void setRoles(List<Role> roles) { this.roles = roles; }
	  
	  public void agregarRoleALista(Role role){ this.roles.add(role); }
	 
} // fin de la clase entidad
