package PenaltyDatabase;

import java.util.*;

public class PenaltyDatabase {
    private Map<String, List<Penalty>> database = new HashMap<>();

    public void addPenalty(String personCode, Penalty penalty) {
        database.computeIfAbsent(personCode, k -> new ArrayList<>()).add(penalty);
    }

    public void printPenaltiesByCode(String personCode) {
        if (database.containsKey(personCode)) {
            System.out.println(database.get(personCode));
        } else {
            System.out.println("No penalties found.");
        }
    }

    public void printPenaltiesByType(String type) {
        database.values().forEach(list -> list.stream()
                .filter(p -> p.type.equals(type))
                .forEach(System.out::println));
    }

    public void printPenaltiesByCity(String city) {
        database.values().forEach(list -> list.stream()
                .filter(p -> p.city.equals(city))
                .forEach(System.out::println));
    }
}
