package gob.mdmq.coretributario.msnegociogestiontributo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class ParametroEntity {
	
	@Id
	private ObjectId id;
	
	private Long parametroId;
	
	private String descripcionParametro;
	
	private BigDecimal valorNumerico;
	
	private String valorCaracter;
}
