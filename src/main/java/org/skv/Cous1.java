package org.skv;

public class Cous1 extends Aunt{
    public Cous1 () {
    }
    public void move(Cous2 attack) {
        attack.move("I have slayed");
    }
    public String move(String attack) {
        return "defeated Cousin1";
    }
}
