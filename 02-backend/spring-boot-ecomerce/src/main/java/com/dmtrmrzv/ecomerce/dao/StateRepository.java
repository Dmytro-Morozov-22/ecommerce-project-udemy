package com.dmtrmrzv.ecomerce.dao;

import com.dmtrmrzv.ecomerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

// @CrossOrigin("http://localhost:4200") can delete because it was used cors.addMapping() in MyDataRestConfig.class
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    List<State> findByCountryCode(@Param("code") String code);

}
