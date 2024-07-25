package gob.mdmq.coretributario.msautorizacionserversecurity.services;

import gob.mdmq.coretributario.msautorizacionserversecurity.dto.AuthDTO;
import gob.mdmq.coretributario.msautorizacionserversecurity.dto.LoginDTO;
import gob.mdmq.coretributario.msautorizacionserversecurity.dto.RegisterDTO;

/**
 * Interfaz que define los servicios de autenticación en el sistema.
 */
public interface AuthService {

    AuthDTO login(LoginDTO login) throws Exception;

    AuthDTO register(RegisterDTO register) throws Exception;
}
