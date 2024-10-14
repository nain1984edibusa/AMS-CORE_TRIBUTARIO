package gob.mdmq.coretributario.msparametrizacion.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "parametro")
public class ParametroEntity {

    @Id
    private int id;
    
    private String descripcionParametro;
    
    private float valorNumerico;
    
    private String valorCaracter;

	/**
	 * 
	 */
	public ParametroEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idParametro
	 * @param descripcionParametro
	 * @param valorNumerico
	 * @param valorCaracter
	 */
	public ParametroEntity(int id, String descripcionParametro, float valorNumerico, String valorCaracter) {
		super();
		this.id = id;
		this.descripcionParametro = descripcionParametro;
		this.valorNumerico = valorNumerico;
		this.valorCaracter = valorCaracter;
	}

	/**
	 * @return the idParametro
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param idParametro the idParametro to set
	 */
	public void setIdParametro(int id) {
		this.id = id;
	}

	/**
	 * @return the descripcionParametro
	 */
	public String getDescripcionParametro() {
		return descripcionParametro;
	}

	/**
	 * @param descripcionParametro the descripcionParametro to set
	 */
	public void setDescripcionParametro(String descripcionParametro) {
		this.descripcionParametro = descripcionParametro;
	}

	/**
	 * @return the valorNumerico
	 */
	public float getValorNumerico() {
		return valorNumerico;
	}

	/**
	 * @param f the valorNumerico to set
	 */
	public void setValorNumerico(float f) {
		this.valorNumerico = f;
	}

	/**
	 * @return the valorCaracter
	 */
	public String getValorCaracter() {
		return valorCaracter;
	}

	/**
	 * @param valorCaracter the valorCaracter to set
	 */
	public void setValorCaracter(String valorCaracter) {
		this.valorCaracter = valorCaracter;
	}
}
