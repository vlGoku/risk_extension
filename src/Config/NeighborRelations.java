package Config;

import java.util.Map;

public class NeighborRelations {

    public static void addCountryNeighbors1(Map<String, String[]> countryNeighbors) {
        countryNeighbors.put("A1", new String[] {"A2", "A4"});
        countryNeighbors.put("A2", new String[] {"A1", "A3", "A5"});
        countryNeighbors.put("A3", new String[] {"A2", "A6", "B1"});
        countryNeighbors.put("A4", new String[] {"A1", "A5", "C1"});
        countryNeighbors.put("A5", new String[] {"A2", "A4", "A6", "C2"});
        countryNeighbors.put("A6", new String[] {"A3", "A5", "B4", "C3"});

        countryNeighbors.put("B1", new String[] {"A3", "B2", "B4"});
        countryNeighbors.put("B2", new String[] {"B1", "B3", "B5"});
        countryNeighbors.put("B3", new String[] {"B2", "B6"});
        countryNeighbors.put("B4", new String[] {"B1", "B5", "A6", "D1"});
        countryNeighbors.put("B5", new String[] {"B2", "B4", "B6", "D2"});
        countryNeighbors.put("B6", new String[] {"B3", "B5", "D3"});

        countryNeighbors.put("C1", new String[] {"C2", "C4", "A4"});
        countryNeighbors.put("C2", new String[] {"C1", "C3", "C5", "A5"});
        countryNeighbors.put("C3", new String[] {"C2", "C6", "A6", "D1"});
        countryNeighbors.put("C4", new String[] {"C1", "C5"});
        countryNeighbors.put("C5", new String[] {"C2", "C4", "C6"});
        countryNeighbors.put("C6", new String[] {"C3", "C5", "D4"});

        countryNeighbors.put("D1", new String[] {"D2", "D4", "B4", "C3"});
        countryNeighbors.put("D2", new String[] {"D1", "D3", "D5", "B5"});
        countryNeighbors.put("D3", new String[] {"D2", "D6", "B6"});
        countryNeighbors.put("D4", new String[] {"D1", "D5", "C6"});
        countryNeighbors.put("D5", new String[] {"D2", "D4", "D6"});
        countryNeighbors.put("D6", new String[] {"D3", "D5"});
    }

    public static void addCountryNeighbors2(Map<String, String[]> countryNeighbors) {
        countryNeighbors.put("A1", new String[] {"A3"});
        countryNeighbors.put("A2", new String[] {"A3", "A4"});
        countryNeighbors.put("A3", new String[] {"A1", "A2", "A5", "A6"});
        countryNeighbors.put("A4", new String[] {"A2", "A6", "B3"});
        countryNeighbors.put("A5", new String[] {"A3"});
        countryNeighbors.put("A6", new String[] {"A3", "A4","C1"});

        countryNeighbors.put("B1", new String[] {"B2", "B3"});
        countryNeighbors.put("B2", new String[] {"B1", "B4"});
        countryNeighbors.put("B3", new String[] {"B1", "B5", "A4"});
        countryNeighbors.put("B4", new String[] {"B2", "B6"});
        countryNeighbors.put("B5", new String[] {"B3", "B6", "D1"});
        countryNeighbors.put("B6", new String[] {"B4", "B5", "D2"});

        countryNeighbors.put("C1", new String[] {"C2", "A6", "D1"});
        countryNeighbors.put("C2", new String[] {"C1", "C4", "C5"});
        countryNeighbors.put("C3", new String[] {"C4"});
        countryNeighbors.put("C4", new String[] {"C2", "C3", "C6"});
        countryNeighbors.put("C5", new String[] {"C2", "C6", "D5"});
        countryNeighbors.put("C6", new String[] {"C4", "C5"});

        countryNeighbors.put("D1", new String[] {"D3", "B5", "C1"});
        countryNeighbors.put("D2", new String[] {"D4", "B6"});
        countryNeighbors.put("D3", new String[] {"D1", "D4", "D5"});
        countryNeighbors.put("D4", new String[] {"D2", "D3", "D6"});
        countryNeighbors.put("D5", new String[] {"D3", "D6", "C5"});
        countryNeighbors.put("D6", new String[] {"D4", "D5"});
    }

    public static void addCountryNeighbors3(Map<String, String[]> countryNeighbors) {
        countryNeighbors.put("A1", new String[] {"A2", "B1"});
        countryNeighbors.put("A2", new String[] {"A1", "A3", "A4"});
        countryNeighbors.put("A3", new String[] {"A2", "C2"});
        countryNeighbors.put("A4", new String[] {"A2", "A5", "A6"});
        countryNeighbors.put("A5", new String[] {"A4", "B3"});
        countryNeighbors.put("A6", new String[] {"A4","C1"});

        countryNeighbors.put("B1", new String[] {"B2", "A1"});
        countryNeighbors.put("B2", new String[] {"B1", "B4", "B5"});
        countryNeighbors.put("B3", new String[] {"B4", "A5"});
        countryNeighbors.put("B4", new String[] {"B2", "B3", "B6"});
        countryNeighbors.put("B5", new String[] {"B2", "D4"});
        countryNeighbors.put("B6", new String[] {"B4", "D1"});

        countryNeighbors.put("C1", new String[] {"C3", "A6"});
        countryNeighbors.put("C2", new String[] {"C5", "A3"});
        countryNeighbors.put("C3", new String[] {"C1", "C4", "C5"});
        countryNeighbors.put("C4", new String[] {"C3", "D2"});
        countryNeighbors.put("C5", new String[] {"C2", "C3", "C6"});
        countryNeighbors.put("C6", new String[] {"C5", "D6"});

        countryNeighbors.put("D1", new String[] {"D3", "B6"});
        countryNeighbors.put("D2", new String[] {"D3", "C4"});
        countryNeighbors.put("D3", new String[] {"D1", "D2", "D5"});
        countryNeighbors.put("D4", new String[] {"D5", "B5"});
        countryNeighbors.put("D5", new String[] {"D3", "D4", "D6"});
        countryNeighbors.put("D6", new String[] {"D5", "C6"});
    }

    public static void addCountryNeighbors4(Map<String, String[]> countryNeighbors) {
        // America
        countryNeighbors.put("Western US", new String[] {"Northwest Territory", "Eastern US", "Central America"});
        countryNeighbors.put("Northwest Territory", new String[] {"Western US", "Alberta", "Greenland"});
        countryNeighbors.put("Eastern US", new String[] {"Western US", "Central America", "Alberta"});
        countryNeighbors.put("Alberta", new String[] {"Northwest Territory", "Eastern US", "Greenland"});
        countryNeighbors.put("Central America", new String[] {"Western US", "Eastern US"});

        // Greenland
        countryNeighbors.put("Greenland", new String[] {"Northwest Territory", "Alberta", "Iceland"});

        // Europe
        countryNeighbors.put("Iceland", new String[] {"Greenland", "Scandinavia", "Great Britain"});
        countryNeighbors.put("Great Britain", new String[] {"Iceland", "Northern Europe", "Western Europe"});
        countryNeighbors.put("Western Europe", new String[] {"Great Britain", "Northern Europe", "Southern Europe", "North Africa"});
        countryNeighbors.put("Scandinavia", new String[] {"Iceland", "Northern Europe", "Ukraine"});
        countryNeighbors.put("Northern Europe", new String[] {"Scandinavia", "Great Britain", "Western Europe", "Southern Europe", "Ukraine"});
        countryNeighbors.put("Ukraine", new String[] {"Scandinavia", "Northern Europe", "Southern Europe", "Middle East"});
        countryNeighbors.put("Southern Europe", new String[] {"Western Europe", "Northern Europe", "Ukraine", "Egypt", "Middle East"});

        // Africa
        countryNeighbors.put("North Africa", new String[] {"Western Europe", "Egypt", "Congo"});
        countryNeighbors.put("Egypt", new String[] {"North Africa", "Congo", "Southern Europe"});
        countryNeighbors.put("Congo", new String[] {"North Africa", "Egypt"});

        // Asia
        countryNeighbors.put("China", new String[] {"India", "Mongolia"});
        countryNeighbors.put("India", new String[] {"China", "Middle East"});
        countryNeighbors.put("Japan", new String[] {"Mongolia"});
        countryNeighbors.put("Mongolia", new String[] {"China", "Japan"});
        countryNeighbors.put("Middle East", new String[] {"Ukraine", "Southern Europe", "India"});

        // Australia
        countryNeighbors.put("Indonesia", new String[] {"New Guinea"});
        countryNeighbors.put("New Guinea", new String[] {"Indonesia"});
    }


    public static void addCountryNeighbors5(Map<String, String[]> countryNeighbors) {
        // Continent A
        countryNeighbors.put("C5", new String[] {"C6", "A3"});   // C5
        countryNeighbors.put("C6", new String[] {"C5", "A4"});   // C6
        countryNeighbors.put("A3", new String[] {"A4", "C5", "B5"});   // A3
        countryNeighbors.put("A4", new String[] {"A3", "C6", "A6"});   // A4
        countryNeighbors.put("B5", new String[] {"A3", "A5", "B6"});   // B5
        countryNeighbors.put("A6", new String[] {"A4", "B6"});   // A6

        // Continent B
        countryNeighbors.put("D5", new String[] {"D6", "B3"});   // D5
        countryNeighbors.put("D6", new String[] {"D5", "B4"});   // D6
        countryNeighbors.put("B3", new String[] {"D5", "B4", "B1"});   // B3
        countryNeighbors.put("B4", new String[] {"B3", "D6", "B6"});   // B4
        countryNeighbors.put("B5", new String[] {"B6", "A5"});   // B5
        countryNeighbors.put("B6", new String[] {"B4", "A6", "B5"});   // B6

        // Continent C
        countryNeighbors.put("C1", new String[] {"C2", "C3"});         // C1
        countryNeighbors.put("C2", new String[] {"C1", "C4"});         // C2
        countryNeighbors.put("C3", new String[] {"C1", "D4"});         // C3
        countryNeighbors.put("C4", new String[] {"C2", "D4"});         // C4

        // Continent D
        countryNeighbors.put("D1", new String[] {"D2", "D3"});         // D1
        countryNeighbors.put("D2", new String[] {"D1", "D4"});         // D2
        countryNeighbors.put("D3", new String[] {"D1", "D5", "C3"});   // D3
        countryNeighbors.put("D4", new String[] {"D2", "C3", "C4"});   // D4
        countryNeighbors.put("D5", new String[] {"D3", "D6", "B3"});   // D5
        countryNeighbors.put("D6", new String[] {"D5", "B4"});         // D6
    }

}
