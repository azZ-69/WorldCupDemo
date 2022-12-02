import model.Groups;
import model.Players;
import model.Team;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Players p1 = new Players("Gotze", 10, 30, 4.7);
        Players p2 = new Players("Gundogan", 20, 40, 4.9);
        Players p3 = new Players("Thomas Muller", 25, 33, 4.8);
        Players p4 = new Players("Loris", 30, 37, 4.5);
        Players p5 = new Players("Foden", 55, 23, 4.6);
        Players p6 = new Players("Rashford", 29, 24, 4.4);
        Players p7 = new Players("Casemiro", 44, 30, 4.8);
        Players p8 = new Players("Vincius jr", 26, 31, 4.7);
        Players p9 = new Players("Neymar", 58, 27, 4.2);
        Players p10 = new Players("Oliver Giroud", 46, 31, 4.7);
        Players p11 = new Players("Griezman", 67, 35, 4.4);
        Players p12 = new Players("Bzulee", 12, 23, 4.8);


        ArrayList<Players> germanplayers = new ArrayList<>();
        germanplayers.add(p1);
        germanplayers.add(p2);
        germanplayers.add(p3);


        ArrayList<Players> englandplayers = new ArrayList<>();
        englandplayers.add(p4);
        englandplayers.add(p5);
        englandplayers.add(p6);

        ArrayList<Players> brasilplayers = new ArrayList<>();
        brasilplayers.add(p7);
        brasilplayers.add(p8);
        brasilplayers.add(p9);

        ArrayList<Players> franceplayers = new ArrayList<>();
        franceplayers.add(p10);
        franceplayers.add(p11);
        franceplayers.add(p12);


        Team t1 = new Team(germanplayers, "Germany", "black/white", 3);
        Team t2 = new Team(englandplayers, "England", "white", 2);
        Team t3 = new Team(brasilplayers, "Brasil", "yellow", 1);
        Team t4 = new Team(franceplayers, "France", "blue", 4);


        ArrayList<Team> teamA = new ArrayList<>();
        teamA.add(t1);
        teamA.add(t2);


        ArrayList<Team> teamB = new ArrayList<>();
        teamB.add(t3);
        teamB.add(t4);


        Groups g1 = new Groups("GroupA", teamA);
        Groups g2 = new Groups("GroupB", teamB);
    }
}








