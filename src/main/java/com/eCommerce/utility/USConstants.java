package com.eCommerce.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {

	public final static String US = "US";

	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
	{
		put("Manila", "Manila");
		put("Davao City", "Davao City");
		put("Quezon City", "Quezon City");
		put("Caloocan", "Caloocan");
		put("Cebu City", "Cebu City");
		put("Zamboanga City", "Zamboanga City");
		put("Taguig", "Taguig");
		put("Antipolo", "Antipolo");
		put("Pasig", "Pasig");
		put("Cagayan de Oro", "Cagayan de Oro");
		put("Parañaque", "Parañaque");
		put("Dasmarinas", "Dasmarinas");
		put("Valenzuela", "Valenzuela");
		put("Bacoor", "Bacoor");
		put("General Santos", "General Santos");
		put("Las Piñas", "Las Piñas");
		put("Makati", "Makati");
		put("Baguio", "Baguio");
		put("San Jose del Monte", "San Jose del Monte");
		put("Bacolod", "Bacolod");
		put("Iloilo City", "Iloilo City");
		put("Dasmariñas", "Dasmariñas");
		put("Muntinlupa", "Muntinlupa");
		put("Pasay", "Pasay");
		put("Imus", "Imus");
		put("Mandaluyong", "Mandaluyong");
		put("Marikina", "Marikina");
		put("Butuan", "Butuan");
		put("Angeles", "Angeles");
		put("Naga", "Naga");
		put("Lapu-Lapu", "Lapu-Lapu");
		put("Santiago", "Santiago");
		put("Legazpi", "Legazpi");
		put("Lucena", "Lucena");
		put("Tarlac City", "Tarlac City");
		put("Malaybalay", "Malaybalay");
		put("Olongapo", "Olongapo");
		put("Ormoc", "Ormoc");
		put("Ligao", "Ligao");
		put("Cotabato City", "Cotabato City");
		put("Dumaguete", "Dumaguete");
		put("Talisay", "Talisay");
		put("Bayawan", "Bayawan");
		put("Calbayog City", "Calbayog City");
		put("Dapitan", "Dapitan");
		put("Pagadian", "Pagadian");

		}
	};
	
	public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
