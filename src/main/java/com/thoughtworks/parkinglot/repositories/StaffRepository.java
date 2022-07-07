package com.thoughtworks.parkinglot.repositories;

import com.thoughtworks.parkinglot.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
//@RepositoryRestResource
public interface StaffRepository extends JpaRepository<Staff, Long> {


}
