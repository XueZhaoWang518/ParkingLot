package com.thoughtworks.parkinglot.repositories;

import com.thoughtworks.parkinglot.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
//@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {

}
