package org.skv;

public class Me extends Father {
    public Me() {
    }
    public String move(String attack) {
        return "defeated";
    }
    public void move(Sister attack) {
        attack.move("I have slayed");
    }
}