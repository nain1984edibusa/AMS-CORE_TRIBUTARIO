package gob.mdmq.coretributario.msparametrizacion.dto;

public class ParametroDTO {
   
    private String descripcionParametro;
    
    private float valorNumerico;
    
    private String valorCaracter;

	/**
	 * 
	 */
	public ParametroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param descripcionParametro
	 * @param valorNumerico
	 * @param valorCaracter
	 */
	public ParametroDTO(String descripcionParametro, float valorNumerico, String valorCaracter) {
		super();
		this.descripcionParametro = descripcionParametro;
		this.valorNumerico = valorNumerico;
		this.valorCaracter = valorCaracter;
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
	 * @param valorNumerico the valorNumerico to set
	 */
	public void setValorNumerico(float valorNumerico) {
		this.valorNumerico = valorNumerico;
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
