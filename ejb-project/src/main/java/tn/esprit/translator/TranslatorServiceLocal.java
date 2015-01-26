package tn.esprit.translator;

import javax.ejb.Local;

@Local
public interface TranslatorServiceLocal {
	String translate(String french);
}
