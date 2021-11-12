package utils;

import javax.ejb.EJB;

import database.Deltager;
import database.DeltagerDAO;

public class Validator {
	
	//@EJB
	//private DeltagerDAO deltagerDAO;
	
	public static final String ANY_LETTER_s = "^[a-zA-ZÊ¯Â∆ÿ≈ -]";
    public static final String TWO_TWENTY_TIMES = "{2,20}";
    public static final String ANY_LETTER = "^[a-zA-ZÊ¯Â∆ÿ≈-]";
    public static final String PHONE_LENGTH = "^[0-9]{8}$";
    public static final String PASS_LENGTH = "[0-9a-zA-ZÊ¯Â∆ÿ≈]{8,100}";
    
	
	public static boolean ValidFornavn(String fornavn) {
		return fornavn!=null&&fornavn.matches(ANY_LETTER+TWO_TWENTY_TIMES+"$");
	}
	public static boolean ValidEtternavn(String etternavn) {
		return etternavn!=null&&etternavn.matches(ANY_LETTER_s+TWO_TWENTY_TIMES+"$");
	}
	public static boolean ValidMobil(String mobil) {
		return mobil!=null&&mobil.matches(PHONE_LENGTH);
	}
	public static boolean ValidPassord(String passord) {
		return passord!=null&&passord.matches(PASS_LENGTH);
	}
	public static boolean ValidPassordRepetert(String passordRepetert, String passord) {
		return passordRepetert!=null&&passordRepetert.equals(passord);
	}
	public static boolean ValidKjonn(String kjonn) {
		return kjonn!=null;
	}
	public static boolean isValidLogin(String mobil, String passord, DeltagerDAO deltagerDAO) {
		Deltager deltager = deltagerDAO.hentDeltager(mobil);
		if(deltager!=null) {
			return PassordUtil.validerMedSalt(passord, deltager.getSalt(), deltager.getPassord());
		}else {
			return false;
		}
	}
	
}
