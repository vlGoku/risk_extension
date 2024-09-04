package View;
import Controller.BoardController;
import Model.Country;
import Config.CountryCoordinates;

import javax.swing.*;
import java.awt.*;

import java.util.Map;

import static Config.Helper.buildBoardConstraints;
import static java.awt.Component.CENTER_ALIGNMENT;

public class ContinentCreator {

    GridBagLayout continentLayout = new GridBagLayout();
    GridBagConstraints continentConstraints = new GridBagConstraints();
    JPanel continentPanel = new JPanel(continentLayout);

    String[] allCountryNames = new String[] {
            "A1", "A2", "A3", "A4", "A5", "A6",
            "B1", "B2", "B3", "B4", "B5", "B6",
            "C1", "C2", "C3", "C4", "C5", "C6",
            "D1", "D2", "D3", "D4", "D5", "D6"};

    //new countries
    //TODO use new countries
    String[][] allCountryNamesNew = new String[][] {
            //America
            {"Western US", "Northwest Territory", "Eastern US", "Alberta", "Central America"},
            //Europe
            {"Iceland", "Great Britain", "Western Europe", "Scandinavia", "Northern Europe", "Ukraine", "Southern Europe"},
            //Africa
            {"North Africa", "Egypt", "Congo"},
            //Asia
            {"China", "India", "Japan", "Mongolia", "Middle East", "Yaktusk"},
            //Australia
            {"Indonesia", "New Guinea"}
    };

    Color[] allContinentColors = new Color[] {
            new Color(249,225,68),
            new Color(241,115,115),
            new Color(99,189,89),
            new Color(67,80,156),
            new Color(50, 120, 150),
    };

    public BoardController controller;

    public ContinentCreator(BoardController controller) {
        this.controller = controller;
    }

    // Different from the other creators, since the countries here are placed with a standard GridLayout instead of
    // more complex GridBagLayout
    public JPanel createBoard1(String continentName, Map<String, Country> allCountries, Map<String, CountryView> allCountryViews) {
        JPanel continent = new JPanel(new GridLayout(2, 3));

        for (int i = 1; i <= 6; i++) {
            Country c = new Country(continentName + i, continentName);
            allCountries.put(c.getName(), c);
            CountryView cView = new CountryView(controller, c);
            JPanel country = switch (continentName) {
                case "A" -> cView.createCountry(new Color(249,225,68), c.getName());
                case "B" -> cView.createCountry(new Color(241,115,115), c.getName());
                case "C" -> cView.createCountry(new Color(99,189,89), c.getName());
                case "D" -> cView.createCountry(new Color(67,80,156), c.getName());
                default -> cView.createCountry(Color.BLACK, c.getName());
            };
            allCountryViews.put(c.getName(), cView);
            continent.add(country, CENTER_ALIGNMENT);

        }

        return continent;
    }


    // Creator for all other Boards except for Board 1.
    public void createAndPlaceAllCountries(int[][] countryPlacements, Map<String, Country> allCountries, Map<String, CountryView> allCountryViews) {
        for (int i = 0; i < countryPlacements.length; i++) {
            Country newCountry = new Country(allCountryNames[i], allCountryNames[i].substring(0,1));
            allCountries.put(newCountry.getName(), newCountry);
            CountryView cView = new CountryView(controller, newCountry);

            Color countryColor = switch (newCountry.getContinent()) {
                case "A" -> new Color(249,225,68);
                case "B" -> new Color(241,115,115);
                case "C" -> new Color(99,189,89);
                case "D" -> new Color(67,80,156);
                default -> new Color(0,0,0);
            };

            JPanel countryPanel = cView.createCountry(countryColor, newCountry.getName());
            continentPanel.add(countryPanel, buildBoardConstraints(continentConstraints,countryPlacements[i][0],countryPlacements[i][1],
                                                                                        countryPlacements[i][2],countryPlacements[i][3]));
            allCountryViews.put(newCountry.getName(), cView);

        }
    };

    //TODO make this work
    public void createAndPlaceAllCountriesNew(int[][] countryPlacements, Map<String, Country> allCountries, Map<String, CountryView> allCountryViews) {
        for (int i = 0; i < countryPlacements.length; i++) {
            for (int j = 0; j < countryPlacements.length; j++) {
                String[] continent = new String[] {"America", "Europe", "Africa", "Asia", "Australia"};
                Country newCountry = new Country(allCountryNamesNew[i][j], continent[i]);
                allCountries.put(newCountry.getName(), newCountry);
                CountryView cView = new CountryView(controller, newCountry);

                Color countryColor = switch (newCountry.getContinent()) {
                    case "A" -> new Color(249, 225, 68);
                    case "B" -> new Color(241, 115, 115);
                    case "C" -> new Color(99, 189, 89);
                    case "D" -> new Color(67, 80, 156);
                    default -> new Color(0, 0, 0);
                };

                JPanel countryPanel = cView.createCountry(countryColor, newCountry.getName());
                continentPanel.add(countryPanel, buildBoardConstraints(continentConstraints, countryPlacements[i][0], countryPlacements[i][1],
                        countryPlacements[i][2], countryPlacements[i][3]));
                allCountryViews.put(newCountry.getName(), cView);

            }
        }
    };

    public JPanel createBoard2(Map<String, Country> allCountries, Map<String, CountryView> allCountryViews) {
        
        continentLayout.columnWidths = new int[] {100,100,100,100,100,100,100,100};
        continentLayout.rowHeights = new int[] {100,100,100,100,100,100,100};

        createAndPlaceAllCountries(CountryCoordinates.allCountryPlacements2, allCountries, allCountryViews);

        return continentPanel;
    }

    public JPanel createBoard3(Map<String, Country> allCountries, Map<String, CountryView> allCountryViews) {
        
        continentLayout.columnWidths = new int[] {100,100,100,100,100,100,100,100};
        continentLayout.rowHeights = new int[] {100,100,100,100,100,100,100,100};

        createAndPlaceAllCountries(CountryCoordinates.allCountryPlacements3, allCountries, allCountryViews);

        return continentPanel;
    }

    public JPanel createBoard4(Map<String, Country> allCountries, Map<String, CountryView> allCountryViews){
        continentLayout.columnWidths = new int[] {100, 100, 100, 100, 100, 100, 100, 100};
        continentLayout.rowHeights = new int[] {100,100,100,100,100,100,100,100};

        createAndPlaceAllCountriesNew(CountryCoordinates.allCountryPlacements4, allCountries, allCountryViews);

        return continentPanel;
    }

    public JPanel createBoard5(Map<String, Country> allCountries, Map<String, CountryView> allCountryViews){
        continentLayout.columnWidths = new int[] {100, 100, 100, 100, 100, 100, 100, 100};
        continentLayout.rowHeights = new int[] {100,100,100,100,100,100,100,100};

        createAndPlaceAllCountriesNew(CountryCoordinates.allCountryPlacements5, allCountries, allCountryViews);

        return continentPanel;
    }

}
