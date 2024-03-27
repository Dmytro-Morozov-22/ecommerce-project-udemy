package com.dmtrmrzv.ecomerce.dao;

import com.dmtrmrzv.ecomerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

// @CrossOrigin("http://localhost:4200") can delete because it was used cors.addMapping() in MyDataRestConfig.class
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
