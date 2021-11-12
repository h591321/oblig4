package test_oblig4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utils.*;

public class ValidatorTest {


        @Test
        public void erGyldigTest() {
			String fornavn = "Anine";
			String etternavn = "Nyheim Bjermeland";
			String mobil = "94132905";
			String passord = "passpass";
			String passordRepetert = "passpass";
			String kjonn = "mann";
            assertTrue(Validator.ValidFornavn(fornavn));
            assertTrue(Validator.ValidEtternavn(etternavn));
            assertTrue(Validator.ValidMobil(mobil));
            assertTrue(Validator.ValidPassord(passord));
            assertTrue(Validator.ValidPassordRepetert(passordRepetert, passord));
            assertTrue(Validator.ValidKjonn(kjonn));
        }

        @Test
		public void erUgyldigTest() {
			String fornavn = "M";
			String etternavn = "N";
			String mobil = "941329052";
			String passord = "pass2";
			String passordRepetert = "pass";
			String kjonn = null;

            assertFalse(Validator.ValidFornavn(fornavn));
            assertFalse(Validator.ValidEtternavn(etternavn));
            assertFalse(Validator.ValidMobil(mobil));
            assertFalse(Validator.ValidPassord(passord));
            assertFalse(Validator.ValidPassordRepetert(passordRepetert, passord));
            assertFalse(Validator.ValidKjonn(kjonn));
        }
}
