package tn.esprit.translator;

import javax.ejb.Remote;

@Remote
public interface TranslatorServiceRemote {
	String translate(String french);
}
