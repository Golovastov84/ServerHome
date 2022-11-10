package MyCod.StudySkillbox.Modul_22_12.main.java;

import java.util.HashSet;

public class TestHashVoter {
    public static void main(String[] args) {
        HashSet<Voter> voterCounts = new HashSet<>();
        Voter voter1 = new Voter("Ivan", "29/01/2000",1);
        Voter voter2 = new Voter("Ivan", "29/01/2000",2);
        Voter voter3 = new Voter("Ivan", "29/01/2000",4);
        voterCounts.add(voter1);
        voterCounts.add(voter2);
        System.out.println(voterCounts.size());
        System.out.println(voterCounts.contains(voter3));
    }
}
