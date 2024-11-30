package com.app.Code.repository;

import com.app.Code.model.ServiceCrew;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ServiceCrewRepository extends SimpleJpaRepository<ServiceCrew, String> {
    private final EntityManager em;
    public ServiceCrewRepository(EntityManager em) {
        super(ServiceCrew.class, em);
        this.em = em;
    }
    @Override
    public List<ServiceCrew> findAll() {
        return em.createNativeQuery("Select * from \"code\".\"ServiceCrew\"", ServiceCrew.class).getResultList();
    }
}