package org.skv;

public class Cous3 extends Aunt {
    public Cous3 () {
    }
    public String move(String attack) {
        return "defeated Cousin3";
    }
    public void move(Cous3 attack) {
        attack.move("I have slayed");
    }
}
