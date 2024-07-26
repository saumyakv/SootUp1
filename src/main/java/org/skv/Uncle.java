package org.skv;

public class Uncle extends FGP {
    public Uncle() {
    }

    public void move(Cous1 attack) {
        attack.move("I have slayed");
    }

    public String move(String attack) {
        return "defeated";
    }
}
