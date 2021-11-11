package database;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DeltagerDAO {
	@PersistenceContext(name = "brukerPU")
	private static EntityManager em;
	
	public  List<Deltager> hentAlleDeltagere(){
		return em.createQuery("SELECT b FROM Deltager b", Deltager.class).getResultList();
	}
	public static Deltager hentDeltager(String mobil) {
		return em.find(Deltager.class, mobil);
	}
	public void lagreNyDeltager(Deltager nyDeltager) {
		em.persist(nyDeltager);
	}
}
