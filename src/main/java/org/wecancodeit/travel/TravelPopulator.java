package org.wecancodeit.travel;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TravelPopulator implements CommandLineRunner {

	@Resource
	private CountryRepository countryRepo;
	@Resource
	private CityRepository cityRepo;

	@Override
	public void run(String... args) throws Exception {

		Country italy = new Country("Italy");
		countryRepo.save(italy);
		cityRepo.save(new City("Rome", "/images/Webp.net-resizeimageRome.jpg", "March 2016",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				italy));
		Country russia = new Country ("Russia");
		countryRepo.save(russia);
		cityRepo.save(new City ("St. Petersburg", "/images/Webp.net-resizeimageStPeter.jpg" ,"April 2015", "Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		russia));

	}

}
