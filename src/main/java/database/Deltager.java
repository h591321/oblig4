package database;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig4", name = "Deltager")
public class Deltager {

	@Id
	private String mobil;
	private String fornavn;
	private String etternavn;
	private String salt;
	public String getMobil() {
		return mobil;
	}

	public String getFornavn() {
		return fornavn;
	}
	public String getSalt() {
		return salt;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getKjonn() {
		return kjonn;
	}

	private String kjonn;
	private String passord;



	//@Embedded
	
	public Deltager(String mobil, String fornavn,String etternavn,String kjonn, String passord, String salt) {
		this.mobil=mobil;
		this.fornavn=fornavn;
		this.etternavn=etternavn;
		this.kjonn=kjonn;
		this.passord=passord;
		this.salt=salt;
	}
	
	public String getPassord() {
		return passord;
	}

	public Deltager() {}
	
}
