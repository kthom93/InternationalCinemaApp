package com.kthom93.internationalcinemaapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kevin on 12/6/2017.
 */

public class Model {
    private static Model instance = null;
    private List<Movie> movies = null;
    private List<Movie> movies2 = null;
    private List<Movie> allMovies = null;
    private Map<String, List<Movie>> genreMap = null;
    private Map<String, List<Movie>> countryMap = null;
    private Map<String, List<Movie>> languageMap = null;

    private Movie silence = null;
    private Movie aManCalledOve = null;
    private Movie aFaceInTheCrowd = null;
    private Movie theBattleOfAlgiers = null;
    private Movie jointSecurityArea = null;
    private Movie sonita = null;
    private Movie fourDaysInSeptember = null;
    private Movie shunLiAndThePoet = null;
    private Movie goodByeLenin = null;
    private Movie theEagleHuntress = null;
    private Movie omar = null;
    private Movie neruda = null;
    private Movie theRedTurtle = null;
    private Movie danton = null;
    private Movie iAmNotYourNegro = null;
    private Movie citizenJane = null;
    private Movie theDistinguishedCitizen = null;
    private Movie terjerVigen = null;
    private Movie theirFinest = null;
    private Movie julieta = null;
    private Movie theWorld = null;
    private Movie theGulls = null;
    private Movie theSalesman = null;
    private Movie strike = null;
    private Movie theHost = null;
    private Movie home = null;
    private Movie samiBlood = null;
    private Movie theWave = null;
    private Movie graduation = null;
    private Movie iAmNotMadameBovary = null;
    private Movie theWomensBalcony = null;
    private Movie myNeighborMyKiller = null;
    private Movie aprilAndTheExtraordinaryWorld = null;
    private Movie gandhi = null;
    private Movie hermiaAndHelena = null;
    private Movie yourName = null;
    private Movie burntByTheSun = null;
    private Movie theDekalog = null;

    private Model() {
        movies = new ArrayList<>();
        movies2 = new ArrayList<>();
        allMovies = new ArrayList<>();
        allMovies = new ArrayList<>();
        genreMap = new HashMap<>();
        countryMap = new HashMap<>();
        languageMap = new HashMap<>();
        createMovies();
        addMovies();

    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    private void createMovies() {
        silence = new Movie("Silence", 161, 2016, 84, 36.2048, 138.2529);
        aManCalledOve = new Movie("A Mand Called Ove", 116, 2015, 90, 60.1282, 18.6435);
        jointSecurityArea = new Movie("J.S.A. Joint Security Area", 110, 2000, 75, 35.9078, 127.7669);
        fourDaysInSeptember = new Movie("Four Days In Spetember", 110, 1997, 59, -14.2350, -51.9253);
        shunLiAndThePoet = new Movie("Shun Li and the Poet", 102, 2011, 94, 41.8719, 12.5674);
        goodByeLenin = new Movie("Good Bye, Lenin!", 121, 2003, 90, 51.1657, 10.4515);
        theRedTurtle = new Movie("The Red Turtle", 81, 2016, 95, 39.1120, 150.4997);
        iAmNotYourNegro = new Movie("I Am Not Your Negro", 95, 2016, 98, 37.0902, -95.7129);
        theirFinest = new Movie("Their Finest", 117, 2016, 89, 52.3555, -1.1743);
        theWorld = new Movie("The World", 143, 2004, 71, 29, 120);
        theHost = new Movie("The Host", 121, 2006, 93, 37, 126);
        home = new Movie("Home", 108, 2008, -1, 46,2);
        theWave = new Movie("The Wave", 107, 2008, 67, 51.1657, 10.4515);
        iAmNotMadameBovary = new Movie("I Am Not Madame Bovary", 139, 2016, 84, 39.9138, 116.3636);
        theWomensBalcony = new Movie("The Women's Balcony", 96, 2016, 96, 31, 35.2137);
        myNeighborMyKiller = new Movie("My Neightbor My Killer", 80, 2009, 100, -1.0403, 29.8739);
        aprilAndTheExtraordinaryWorld = new Movie("April And The Extraordinary World", 106, 2015, 96, 45, 3);
        yourName = new Movie("Your Name", 107, 2016, 97, 35, 137);
        theDekalog = new Movie("The Dekalog", 60, 1989, 97, 51.9194, 19.1451);
        julieta = new Movie("Julieta", 100, 2016, 82, 40.4168, -3.7038);


        aFaceInTheCrowd = new Movie("A Face in the Crowd", 126, 1957, 92, 40.7128, -74.0060);
        theBattleOfAlgiers = new Movie("The Battle of Algiers", 121, 1966, 99, 28.0339, 1.6596);
        sonita = new Movie("Sonita", 91, 2015, 100, 33.9391, 67.7100);
        theEagleHuntress = new Movie("The Eagle Huntress", 101, 2016, 93, 48.0196, 66.9237);
        omar = new Movie("Omar", 98, 2013, 90, 31.9522, 35.2332);
        neruda = new Movie("Neruda", 107, 2016, 94, -35.6751, -71.5430);
        danton = new Movie("Danton", 136, 1983, 89, 46, 5);
        citizenJane = new Movie("Citizen Jane: Battle for the City", 92, 2016, 94, 40, -75);
        theDistinguishedCitizen = new Movie("The Distinguished Citizen", 118, 2016, 100, -38.4161, -63.6167);
        terjerVigen = new Movie("Terje Vigen", 65, 1917, -1, 62, 15);
        theGulls = new Movie("The Gulls", 87, 2015, -1, 46.5677, 45.7732);
        theSalesman = new Movie("The Salesman", 125, 2016, 96, 32.4279, 53.6880);
        strike = new Movie("Strike", 95, 1925, 100, 41.8781, -87.6298);
        samiBlood =new Movie("Sami Blood", 110, 2016, 95, 67.4, 18);
        graduation = new Movie("Graduation", 128, 2016, 95, 45.9432, 24.9668);
        gandhi = new Movie("Gandhi", 191, 1982, 87, 20.5937, 78.9629);
        hermiaAndHelena = new Movie("Hermia and Helena", 87, 2016, 86, 39, -76);
        burntByTheSun = new Movie("Burnt By The Sun", 135, 1994, 79, 61.5240, 105.3188);
    }
    private void addMovies() {
        movies.add(silence);
        movies.add(aManCalledOve);
        movies.add(jointSecurityArea);
        movies.add(fourDaysInSeptember);
        movies.add(shunLiAndThePoet);
        movies.add(goodByeLenin);
        movies.add(theRedTurtle);
        movies.add(iAmNotYourNegro);
        movies.add(theirFinest);
        movies.add(theHost);
        movies.add(home);
        movies.add(iAmNotMadameBovary);
        movies.add(theWomensBalcony);
        movies.add(aprilAndTheExtraordinaryWorld);
        movies.add(theDekalog);
        movies.add(theWorld);
        movies.add(yourName);
        movies.add(myNeighborMyKiller);
        movies.add(theWave);
        movies.add(julieta);

        movies2.add(aFaceInTheCrowd);
        movies2.add(theBattleOfAlgiers);
        movies2.add(sonita);
        movies2.add(theEagleHuntress);
        movies2.add(omar);
        movies2.add(neruda);
        movies2.add(danton);
        movies2.add(citizenJane);
        movies2.add(theDistinguishedCitizen);
        movies2.add(terjerVigen);
        movies2.add(theGulls);
        movies2.add(theSalesman);
        movies2.add(strike);
        movies2.add(samiBlood);
        movies2.add(graduation);
        movies2.add(hermiaAndHelena);
        movies2.add(burntByTheSun);
    }

    public List<Movie> getRatings() {
        List<Movie> ratingsList = new ArrayList<>();
        double percentage = -2;
        int index = 0;
        allMovies.clear();

        for (Movie movie : movies) {
            allMovies.add(movie);
        }
        for (Movie movie : movies2) {
            allMovies.add(movie);
        }
        while (allMovies.size() > 0) {
            percentage = -2;
            for (int i = 0; i < allMovies.size(); ++i) {
                if (allMovies.get(i).getTomatoes() > percentage) {
                    percentage = allMovies.get(i).getTomatoes();
                    index = i;
                }
            }
            ratingsList.add(allMovies.get(index));
            allMovies.remove(index);
        }
        return ratingsList;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies2() { return movies2; }

    public void setMovies2(List<Movie> movies2) { this.movies2 = movies2; }
}
