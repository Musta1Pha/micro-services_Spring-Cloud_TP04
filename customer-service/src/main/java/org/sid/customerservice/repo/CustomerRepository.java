package org.sid.customerservice.repo;

import org.sid.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource // Exposer le webservice Restful qui permet de gérer les customers
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
