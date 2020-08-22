package br.com.ctrlabs.jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        Candidato candidato = new Candidato();
        candidato.setNomeCandidato("Joao da Silva");
        
        //Iniciando o JPA manualmente
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("devPU");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(candidato);
        manager.getTransaction().commit();
        manager.close();
        
        System.out.println("ID do candidato.....: " + candidato.getId());
        System.out.println("Nome do candidato...: " + candidato.getNomeCandidato());
    }
}
