package igra;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends  Participant> {

    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant (T participant) {
        participantList.add(participant);
        System.out.println("V komandy " + name + "bil dobavlen uchastnik " +
                "po imeni " + participant.getName());

    }

    public  void playWith (Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0)
            winnerName = this.name;
        else
            winnerName = team.name;

        System.out.println("Vigrala komanda " + winnerName);
    }
}
