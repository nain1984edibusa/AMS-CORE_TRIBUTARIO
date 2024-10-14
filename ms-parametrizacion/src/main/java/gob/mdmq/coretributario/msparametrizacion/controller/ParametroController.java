package gob.mdmq.coretributario.msparametrizacion.controller;

import gob.mdmq.coretributario.msparametrizacion.dto.ParametroDTO;
import gob.mdmq.coretributario.msparametrizacion.entity.ParametroEntity;
import gob.mdmq.coretributario.msparametrizacion.services.ParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/parametro")
public class ParametroController {

    @Autowired
    ParametroService productService;

    @GetMapping
    public ResponseEntity<List<ParametroEntity>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParametroEntity> getOne(@PathVariable("id") int id) {
        return ResponseEntity.ok(productService.getOne(id));
    }

    @PostMapping
    public ResponseEntity<ParametroEntity> save(@RequestBody ParametroDTO dto) {
        return ResponseEntity.ok(productService.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParametroEntity> update(@PathVariable("id") int id, @RequestBody ParametroDTO dto) {
        return ResponseEntity.ok(productService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ParametroEntity> delete(@PathVariable("id") int id) {
        return ResponseEntity.ok(productService.delete(id));
    }
}
