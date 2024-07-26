package org.skv;

public class Mother extends MGP{
    public Mother () {
    }
    public void move(Sister attack) {
        attack.move("I have slayed");
    }
    public String move(String attack) {
        return "defeated";
    }
}

