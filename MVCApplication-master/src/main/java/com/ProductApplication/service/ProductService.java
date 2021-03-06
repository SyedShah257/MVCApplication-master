package com.ProductApplication.service;

import com.ProductApplication.domain.ProductEntry;
import com.ProductApplication.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    protected ProductRepository productRepository;

    public List<ProductEntry> findAll() {
        return productRepository.findAll();
    }

    public ProductEntry save(ProductEntry entry) {
        return productRepository.save(entry);
    }

    public void delete(Long id) {
        productRepository.delete(id);
    }

    public ProductEntry findOne(Long id) {
        return productRepository.findOne(id);
    }
}
