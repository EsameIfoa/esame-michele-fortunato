package it.ifoa.progettofinaleifoa.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.repositories.ProductRepository;

@Service
public class ProductService implements CrudService<Product, Long>{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> readAll() {
        return productRepository.findAll();
    }

    @Override
    public Product read(Long key) {
        return productRepository.findById(key).get();
    }

    //COMPLETA
    //COMPLETA GLI OVVERIDE DELLA CLASSE CON I METODI MANCANTI
    //CREATE - UPDATE
    //NON DIMENTICARE I MAPPING GET E POST CORRISPONDENTI

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update (Long id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST); 
        }
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

}