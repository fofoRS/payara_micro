package org.employeeservice.config;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.employeeservice.entity.AcmeEmployee;

@Stateless
@Path("acmeemployee")
public class AcmeEmployeeFacadeREST {

    @PersistenceContext(unitName = "EmployeeService_1.0PU")
    private EntityManager em;

    public AcmeEmployeeFacadeREST() {

    }

    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<AcmeEmployee> findAll() {
        List<AcmeEmployee> employeeList = null;
        try {
            employeeList = em.createQuery("select object(o) from AcmeEmployee o")
                    .getResultList();
        } catch (NoResultException e){
            
        }
        return employeeList;
        
    }
    
}