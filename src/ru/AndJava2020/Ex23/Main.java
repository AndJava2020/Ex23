package ru.AndJava2020.Ex23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<String, String>();
        map.put("Mer","Bruh");
        map.put("Ven","Bro");
        map.put("Ea","Imru");
        map.put("Ma","Put");
        map.put("Jup","Zur");
        map.put("Sat","Hash");
        map.put("Ur","Bruh");
        map.put("Nep","Cache");
        map.put("Pl","Hash");
        map.put("Er","Bruh");

        System.out.println(map);

        Map<String,Integer> mapFrequency=new HashMap<String, Integer>();
        LinkedList<String> keys=new LinkedList<String>(map.values());

        for (int i = 0; i < keys.size() ; i++) {
            if(mapFrequency.get(keys.get(i))==null){
                mapFrequency.put(keys.get(i),1);
            }
            else{
                mapFrequency.put(keys.get(i),mapFrequency.get(keys.get(i))+1);
            }
        }

        System.out.println(mapFrequency);
        keys=new LinkedList<String>(mapFrequency.keySet());
        for (int i = 0; i < keys.size() ; i++) {
            if(mapFrequency.get(keys.get(i))>1) {
                HashMap<String, String> copy = new HashMap<String, String>(map);
                for (Map.Entry<String, String> pair : copy.entrySet()) {
                    if (pair.getValue().equals(keys.get(i)))
                        map.remove(pair.getKey());
                }
            }
        }
        System.out.println(map);
        System.out.println();

        Map<String, ArrayList<String>> map2 = new HashMap();
        Set<City> cities=new HashSet<City>(){};
        cities.add(new City("Russia","Moscow"));
        cities.add(new City("Russia","St Petersburg"));
        cities.add(new City("Ukraine","Kiev"));
        cities.add(new City("Belarus","Minsk"));
        System.out.println(cities);

        Set<String> namesOfCountries= new HashSet<>();
        for (City t: cities
        ) {
            namesOfCountries.add(t.getCountry());
        }
        for (String countryName:namesOfCountries) {
            ArrayList<String>citiesString= new ArrayList<>();
            for (City t:cities) {
                if(t.getCountry()==countryName) citiesString.add(t.getCity());
            }
            map2.put(countryName,citiesString);
        }
        System.out.println(map2);

    }
}
