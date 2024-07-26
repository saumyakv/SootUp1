package org.skv;

public class Aunt extends MGP {
    public Aunt () {
    }
    public void move(Cous4 attack) {
        Aunt daughter = new Cous1();
        Aunt son = new Cous2();
        attack.move("Slay");
    }
    public String move(String attack) {
        return "defeated";
    }
}
