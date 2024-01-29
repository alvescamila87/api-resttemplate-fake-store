package com.camila.apiresttemplatefakestore.dto;

import java.math.BigDecimal;
import java.util.List;

public record ProductDTO(Long id, String title, Double price, String description, CategoryProductDTO categoryProductDTO, List<String> images) {

}
