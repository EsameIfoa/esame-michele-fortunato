package it.ifoa.progettofinaleifoa.repositories;

import org.springframework.data.repository.ListCrudRepository;
import it.ifoa.progettofinaleifoa.models.Product;

public interface ProductRepository extends ListCrudRepository<Product, Long>{
    
}