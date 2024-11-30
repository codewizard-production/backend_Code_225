package com.app.Code.repository;

import com.app.Code.model.RoadsideAssistance;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RoadsideAssistanceRepository extends SimpleJpaRepository<RoadsideAssistance, String> {
    private final EntityManager em;
    public RoadsideAssistanceRepository(EntityManager em) {
        super(RoadsideAssistance.class, em);
        this.em = em;
    }
    @Override
    public List<RoadsideAssistance> findAll() {
        return em.createNativeQuery("Select * from \"code\".\"RoadsideAssistance\"", RoadsideAssistance.class).getResultList();
    }
}