package org.skv;

public class Sister extends Mother {
    public Sister () {
    }

    public String move(String attack) {
        return "defeated";
    }
    public void move(Aunt attack) {
        Aunt daughter = new Cous1();
        Aunt son = new Cous2();
        attack.move("I have slayed");
    }
}
