package gob.mdmq.coretributario.msparametrizacion.services;

import gob.mdmq.coretributario.msparametrizacion.dto.ParametroDTO;
import gob.mdmq.coretributario.msparametrizacion.entity.ParametroEntity;
import gob.mdmq.coretributario.msparametrizacion.repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ParametroService {

    @Autowired
    ParametroRepository productRepository;

    public List<ParametroEntity> getAll() {
        return productRepository.findAll();
    }

    public ParametroEntity getOne(int id) {
        return productRepository.findById(id).get();
    }

    public ParametroEntity save(ParametroDTO dto) {
        int id = autoIncrement();
        ParametroEntity product = new ParametroEntity(id, dto.getDescripcionParametro(), dto.getValorNumerico(), dto.getValorCaracter());
        return productRepository.save(product);
    }

    public ParametroEntity update(int id, ParametroDTO dto) {
        ParametroEntity product = productRepository.findById(id).get();
        product.setDescripcionParametro(dto.getDescripcionParametro());
        product.setValorNumerico(dto.getValorNumerico());
        product.setValorCaracter(dto.getValorCaracter());
        return productRepository.save(product);
    }

    public ParametroEntity delete(int id) {
        ParametroEntity product = productRepository.findById(id).get();
        productRepository.delete(product);
        return product;
    }

    // private methods
    private int autoIncrement() {
        List<ParametroEntity> products = productRepository.findAll();
        return products.isEmpty()? 1 :
                products.stream().max(Comparator.comparing(ParametroEntity::getId)).get().getId() + 1;
    }

}
