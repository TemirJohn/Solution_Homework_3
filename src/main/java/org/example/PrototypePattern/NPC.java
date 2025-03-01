package org.example.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NPC implements CloneableGame {
    private String npcName;
    private String npcDescription;
    private int npcHealth;
    private List<String> skills;

    public NPC(String npcName, String npcDescription, int npcHealth) {
        this.npcName = npcName;
        this.npcDescription = npcDescription;
        this.npcHealth = npcHealth;
        this.skills = new ArrayList<>();
    }

    public String toString() {
        return npcName + ": HP:" + npcHealth + "\n" + npcDescription + "\nSkills: " + skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public List<String> getSkills() {
        return skills;
    }
    public String getNpcName() {
        return npcName;
    }

    public String getNpcDescription() {
        return npcDescription;
    }

    public int getNpcHealth() {
        return npcHealth;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    public void setNpcDescription(String npcDescription) {
        this.npcDescription = npcDescription;
    }

    public void setNpcHealth(int npcHealth) {
        this.npcHealth = npcHealth;
    }


    public NPC clone() {
        NPC clone = new NPC(this.npcName, this.npcDescription, this.npcHealth);

        clone.skills = new ArrayList<>(this.skills);
        return clone;}
}
