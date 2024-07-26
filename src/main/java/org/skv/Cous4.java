package org.skv;

public class Cous4 extends Aunt {
    public Cous4 () {
    }
    public String move(String attack) {
        return "defeated Cousin4";
    }
    public void move(Mother attack) {
        attack.move("I have slayed");
    }
}
