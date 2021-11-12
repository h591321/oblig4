package database;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DeltagerDAO {
	
	@PersistenceContext(name = "brukerPU")
	private EntityManager em;
	
	public synchronized List<Deltager> hentAlleDeltagere(){
		return em.createQuery("select s from Deltager s order by s.fornavn", Deltager.class).getResultList();
		
	}
	public synchronized Deltager hentDeltager(String mobil) {
		return em.find(Deltager.class, mobil);
	}
	public void lagreNyDeltager(Deltager nyDeltager) {
		em.persist(nyDeltager);
	}
}
