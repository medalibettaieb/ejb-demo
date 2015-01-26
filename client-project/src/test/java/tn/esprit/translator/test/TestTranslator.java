package tn.esprit.translator.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.esprit.translator.TranslatorServiceRemote;

public class TestTranslator {
	TranslatorServiceRemote remote = null;

	@Before
	public void init() {
		try {
			Context ctx = new InitialContext();
			remote = (TranslatorServiceRemote) ctx
					.lookup("ejb-project/TranslatorService!tn.esprit.translator.TranslatorServiceRemote");
		} catch (Exception e) {
		}
	}

	@Test
	public void doTranslate() {
		Assert.assertEquals(remote.translate("courir"), "run");
		System.out.println(remote.translate("courir"));
	}
}
