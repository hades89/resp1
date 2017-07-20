package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import Exception.NoResultException;

public class CountryUtil {
//	public static List<Country> getCountries(final Locale inLocale) {
//		String[] countryCodes = Locale.getISOCountries();
//		List<Country> countries = new ArrayList<Country>(countryCodes.length);
//		for (String countryCode : countryCodes) {
//			countries.add(new Country(countryCode, new Locale("", countryCode).getDisplayCountry(inLocale)));
//		}
//		Collections.sort(countries, new Comparator<Country>() {
//			public int compare(Country c1, Country c2) {
//				return c1.getName().compareTo(c2.getName());
//			}
//		});
//		return countries;
//	}
	
	public static Country getCount(Locale inLocale, String code) throws NoResultException{
		Country c = new Country();
		Locale l = new Locale("", code);

		c.setCountryCode(l.getCountry());
		c.setName(l.getISO3Country());
		
		return c;
	}
	
	public static List<Country> getCounts(){
		String[] countryCodes = Locale.getISOCountries();
		List<Country> countries = new ArrayList<Country>();
		for (String countryCode : countryCodes) {
			Country c = new Country();
			c.setCountryCode(countryCode);
			c.setName(new Locale("cn", countryCode).getISO3Country());
			countries.add(c);
		}
		
		return countries;
	}

//	public static Map<String, String> getCountriesMap(final Locale inLocale) {
//		List<Country> countries = getCountries(inLocale);
//		Map<String, String> countriesMap = new LinkedHashMap<String, String>(countries.size());
//		for (Country country : countries) {
//			countriesMap.put(country.getCountryCode(), country.getName());
//		}
//		return countriesMap;
//	}

	public static void printCounties(List<Country> countries) {
		for (Country country : countries) {
			System.out.println(country);
		}
	}
}
