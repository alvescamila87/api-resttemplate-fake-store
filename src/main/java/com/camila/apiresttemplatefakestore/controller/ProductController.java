package com.camila.apiresttemplatefakestore.controller;

import com.camila.apiresttemplatefakestore.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ProductDTO searchProducts() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<ProductDTO> responseEntity = restTemplate.getForEntity("https://api.escuelajs.co/api/v1/", ProductDTO.class);

        return responseEntity.getBody();
    }
}
