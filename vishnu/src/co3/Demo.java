package co3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CricketPlayer {
    private String name;
    private String country;
    private int totalRuns;
    private double rating;
    
    public CricketPlayer(String name, String country, int totalRuns, double rating) {
        this.name = name;
        this.country = country;
        this.totalRuns = totalRuns;
        this.rating = rating;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCountry() {
        return country;
    }
    
    public int getTotalRuns() {
        return totalRuns;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
}

class Demo {
    public static void main(String[] args) {
        List<CricketPlayer> players = new ArrayList<>();
        players.add(new CricketPlayer("Sachin Tendulkar", "India", 18426, 99.94));
        players.add(new CricketPlayer("Ricky Ponting", "Australia", 13704, 51.85));
        players.add(new CricketPlayer("Jacques Kallis", "South Africa", 13289, 55.37));
        players.add(new CricketPlayer("Brian Lara", "West Indies", 11953, 52.88));
        players.add(new CricketPlayer("Kumar Sangakkara", "Sri Lanka", 14234, 57.40));
        
        // Sort players in descending order based on totalRuns
        Collections.sort(players, new Comparator<CricketPlayer>() {
            public int compare(CricketPlayer p1, CricketPlayer p2) {
                return p2.getTotalRuns() - p1.getTotalRuns();
            }
        });
        
        // Print sorted players
        for (CricketPlayer player : players) {
            System.out.println(player.getName() + " (" + player.getCountry() + "): " + player.getTotalRuns());
        }
    }
}
