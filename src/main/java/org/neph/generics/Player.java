package org.neph.generics;

/**
 * @ Author NMuchiri
 **/

public abstract class Player {
    private final String name;

    public Player(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

