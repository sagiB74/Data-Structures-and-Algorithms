package practice;

import java.util.Objects;

public class Pirate {
    String name;
    int bounty;

    public Pirate (String name , int bounty){
        this.name = name;
        this.bounty = bounty;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty){
        this.bounty = bounty;

    }

    @Override
    public String toString(){
        return name + " bounty: " + bounty;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pirate pirate = (Pirate) o;
        return bounty == pirate.bounty && Objects.equals(name, pirate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bounty);
    }
}
