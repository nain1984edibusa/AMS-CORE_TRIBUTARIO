package gob.mdmq.coretributario.msautorizacionserversecurity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO (Data Transfer Object) que representa la autenticación con un token.
 */
@Data @AllArgsConstructor
public class AuthDTO {
    String token;
}
