package org.skv;

public class Father extends FGP{
    public Father () {
    }
    public void move(Me attack) {
        attack.move("I have slayed");
    }
    public void move(Uncle attack) {
        attack.move("I have slayed");
    }
    public String move(String attack) {
        return "defeated";
    }
}
