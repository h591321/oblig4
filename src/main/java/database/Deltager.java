package database;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="oblig4", name="deltager")
public class Deltager {

	@Id
	private String mobil;
	private String fornavn;
	private String etternavn;
	private String kjonn;
	private String passord;



	//@Embedded
	
	public Deltager(String mobil, String fornavn,String etternavn,String kjonn, String passord) {
		this.mobil=mobil;
		this.fornavn=fornavn;
		this.etternavn=etternavn;
		this.kjonn=kjonn;
		this.passord=passord;
	}
	
	public String getPassord() {
		return passord;
	}

	public Deltager() {}
	
}
