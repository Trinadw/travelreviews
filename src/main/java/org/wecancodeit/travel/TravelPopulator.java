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
		cityRepo.save(new City("Rome", "/images/Webp.net-resizeimageRome.jpg", "April 2016",
				"Rome has museums and history galore for you to explore. I loved my visit here. The Vatican was breathtaking. I will admit that after staring at the ceiling in the Sistine Chapel I was a little disappointed. There are oodles of people, even in the off season. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"Rome, Italy’s capital, is a sprawling, cosmopolitan city with nearly 3,000 years of globally influential art, architecture and culture on display. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				italy));
		cityRepo.save(new City("Venice", "/images/veniceimage.jpg", "April 2016",
				"Venice was a delight to visit. The canals are smelly, but beautiful. The old world charm of the city takes you back in time, but the usual modern amenities are availble. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"Venice, the capital of northern Italy’s Veneto region, is built on more than 100 small islands in a lagoon in the Adriatic Sea. It has no roads, just canals – including the Grand Canal thoroughfare – lined with Renaissance and Gothic palaces. The central square, Piazza San Marco, contains St. Mark’s Basilica, which is tiled with Byzantine mosaics, and the Campanile bell tower offering views of the city’s red roofs. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				italy));
		
		Country russia = new Country ("Russia");
		countryRepo.save(russia);
		cityRepo.save(new City ("St. Petersburg", "/images/Webp.net-resizeimageStPeter.jpg" ,"April 2015", "St. Petersburg was a friendly city with lots of beautiful palaces, museums and cathedrals. I was amazed at the beauty of the architecture. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		"St. Petersburg is a Russian port city on the Baltic Sea. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		russia));
		Country england = new Country ("England");
		countryRepo.save(england);
		cityRepo.save(new City ("London", "/images/Webp.net-resizeimageLondon.jpg" ,"March 2001", "Fun city, full of history and people. The museums are magical.The food leaves something to be desired but you don't go to London for food. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		"London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		england));
		Country turkey = new Country ("Turkey");
		countryRepo.save(turkey);
		cityRepo.save(new City ("Ankara", "/images/10376915_10204668152405497_359648568241821963_nankaraimage.jpg" ,"September 2014", "Ankara was amazing. The antiquities were magnificent. There is a lot of history to learn. Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		"Ankara, Turkey’s cosmopolitan capital, sits in the country’s central Anatolia region. It’s a center for the performing arts, home to the State Opera and Ballet, the Presidential Symphony Orchestra and several national theater companies. Overlooking the city is Anitkabir, the enormous hilltop mausoleum of Kemal Atatürk, modern Turkey’s first president, who declared Ankara the capital in 1923. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		turkey));
		cityRepo.save(new City ("Istanbul", "/images/Webp.net-resizeimageIstanbul.jpg" ,"September 2014", "A city full of people that hold onto tradition while embracing innovation. I absolutely despised the food in Turkey. I lived off cucumbers and watermelon for almost two weeks when I visited. With that said, the sights were worth the lack of food. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		"Istanbul is a major city in Turkey that straddles Europe and Asia across the Bosphorus Strait. Its Old City reflects cultural influences of the many empires that once ruled here. In the Sultanahmet district, the open-air, Roman-era Hippodrome was for centuries the site of chariot races, and Egyptian obelisks also remain. The iconic Byzantine Hagia Sophia features a soaring 6th-century dome and rare Christian mosaics.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		turkey));
		cityRepo.save(new City ("Cappadocia", "/images/10449907_10204668134485049_3071149560729503752_ncappadocia.jpg" ,"September 2014", " Cappadocia was quite an adventure. We were able to tour the cave dwellings and see how intricate the dwellings were. Ita amazing to think that people with ancient tools were able to get through rock and create places to live. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
				+ "\r\n"
				+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		"Cappadocia, a semi-arid region in central Turkey, is known for its distinctive “fairy chimneys,” tall, cone-shaped rock formations clustered in Monks Valley, Göreme and elsewhere. Other notables sites include Bronze Age homes carved into valley walls by troglodytes (cave dwellers) and later used as refuges by early Christians. The 100m-deep Ihlara Canyon houses numerous rock-face churches.\r\n"
				+ "\r\n"
				+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
				+ "\r\n"
				+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
		turkey));
		
	}

}
