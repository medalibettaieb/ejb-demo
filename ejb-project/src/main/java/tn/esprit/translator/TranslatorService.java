package tn.esprit.translator;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TranslatorService
 */
@Stateless
public class TranslatorService implements TranslatorServiceRemote,
		TranslatorServiceLocal {
	@EJB
	Dictionnary dictionnary;

	public TranslatorService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String translate(String french) {
		String english = dictionnary.getTranslations().get(french);
		// return english!=null?english:"not found";
		if (english != null) {
			return english;
		} else {
			return "not found";
		}
	}

}
