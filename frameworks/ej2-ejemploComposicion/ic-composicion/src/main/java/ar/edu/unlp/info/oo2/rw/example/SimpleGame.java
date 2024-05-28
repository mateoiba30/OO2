package ar.edu.unlp.info.oo2.rw.example;

import ar.edu.unlp.info.oo2.rw.model.*;

public class SimpleGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.add(new Robot("Twonky", new Caterpillar(), new NuclearPlant(), new BombsSystem()));
        board.add(new Robot("Hammer Bot", new Overcraft(), new NuclearPlant(), new LasersSystem()));
        board.add(new Robot("New Robot", new Overcraft(), new SolarPanelWithBattery(), new LasersSystem()));
        board.add(new Robot("Other New Robot", new CuatroPorCuatro(), new SolarPanelWithBattery(), new LasersSystem()));
        board.runForCicles(5);
    }
}
