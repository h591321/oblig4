package utils;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import utils.Validator;
public class SkjemaBean {
    
    private String fornavnFeil="";
    private String etternavnFeil="";
    private String mobilFeil="";
    private String passordFeil="";
    private String passordRepetertFeil="";
    private String kjonnFeil="";
    
	private String fornavn;
	private String etternavn;
	private String mobil;
	private String passord;
	private String passordRepetert;
	private String kjonn;
	
	public SkjemaBean(HttpServletRequest request) {
		this.fornavn=request.getParameter("fornavn");
		this.etternavn=request.getParameter("etternavn");
		this.mobil=request.getParameter("mobil");
		this.passord=request.getParameter("passord");
		this.passordRepetert=request.getParameter("passordRepetert");
		this.kjonn=request.getParameter("kjonn");
	}
	
	public boolean allInputValid(){
		return Validator.ValidFornavn(fornavn)&&Validator.ValidEtternavn(etternavn)&&Validator.ValidMobil(mobil)
				&&Validator.ValidPassord(passord)&&Validator.ValidPassordRepetert(passordRepetert,passord)&&Validator.ValidKjonn(kjonn);
	}
	public void setupFeilMelding() {
		if(!Validator.ValidFornavn(fornavn)) {
			fornavn="";
			fornavnFeil="Ugyldig fornavn";
		}
		if(!Validator.ValidEtternavn(etternavn)) {
			etternavn="";
			etternavnFeil="Ugyldig etternavn";
		}
		if(!Validator.ValidMobil(mobil)) {
			mobil="";
			mobilFeil="Ugyldig mobilnr";
		}
		if(!Validator.ValidPassord(passord)) {
			passord="";
			passordFeil="Ugyldig passord";
		}
		if(!Validator.ValidPassordRepetert(passordRepetert,passord)) {
			passordRepetert="";
			passordRepetertFeil="Passordene må være like";
		}
		if(!Validator.ValidKjonn(kjonn)) {
			kjonnFeil="Velg et kjønn";
		}
	}
		
	
	//getters
	public String getPassordRepetertFeil() {
		return passordRepetertFeil;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public String getMobil() {
		return mobil;
	}

	public String getPassord() {
		return passord;
	}

	public String getPassordRepetert() {
		return passordRepetert;
	}

	public String getKjonn() {
		return kjonn;
	}

	public String getFornavnFeil() {
		return fornavnFeil;
	}

	public String getEtternavnFeil() {
		return etternavnFeil;
	}

	public String getMobilFeil() {
		return mobilFeil;
	}

	public String getPassordFeil() {
		return passordFeil;
	}

	public String getKjonnFeil() {
		return kjonnFeil;
	}



}
