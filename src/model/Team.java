package model;

import java.util.ArrayList;

public class Team {
    ArrayList<Players> players;
    String name;
    String jersey_colour;
    int team_position;

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersey_colour() {
        return jersey_colour;
    }

    public void setJersey_colour(String jersey_colour) {
        this.jersey_colour = jersey_colour;
    }

    public int getTeam_position() {
        return team_position;
    }

    public void setTeam_position(int team_position) {
        this.team_position = team_position;
    }

    public Team(ArrayList<Players> players, String name, String jersey_colour, int team_position) {
        this.players = players;
        this.name = name;
        this.jersey_colour = jersey_colour;
        this.team_position = team_position;
    }
}
