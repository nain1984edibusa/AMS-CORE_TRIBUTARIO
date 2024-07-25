package gob.mdmq.coretributario.msautorizacionserversecurity.controller;


/*gob.mdmq.coretributario.msautorizacionserversecurity.dto


import com.zair.models.dtos.LoginDTO;
import com.zair.models.dtos.RegisterDTO;
import com.zair.services.AuthService;*/


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gob.mdmq.coretributario.msautorizacionserversecurity.dto.LoginDTO;
import gob.mdmq.coretributario.msautorizacionserversecurity.dto.RegisterDTO;


import gob.mdmq.coretributario.msautorizacionserversecurity.dto.ClienteDTO;
import gob.mdmq.coretributario.msautorizacionserversecurity.services.AuthService;
import gob.mdmq.coretributario.msautorizacionserversecurity.services.ClienteService;
import gob.mdmq.coretributario.msautorizacionserversecurity.services.ServiceException;



@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO dto) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.login(dto));
        } catch (BadCredentialsException | UsernameNotFoundException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("{\"error\": \"Invalid credentials\"}");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterDTO dto) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(service.register(dto));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\": \"Error registering user\"}");
        }
    }
}
