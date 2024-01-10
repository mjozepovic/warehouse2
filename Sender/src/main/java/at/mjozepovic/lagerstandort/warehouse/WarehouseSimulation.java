package at.mjozepovic.lagerstandort.warehouse;

import at.mjozepovic.model.WarehouseData;

import java.util.Random;

public class WarehouseSimulation {

    public WarehouseData getData( String inID ) {

        String[][] cities = {
                {"Linz", "4020", "Am Hauptplatz 3", "Linz Hauptlager", "Österreich"},
                {"Innsbruck", "6020", "Maria-Theresien-Straße 10", "Innsbruck Lager", "Österreich"},
                {"Klagenfurt", "9020", "Neuer Platz 1", "Klagenfurt Lager", "Österreich"}
        };

        int r = new Random().nextInt(2);

        WarehouseData data = new WarehouseData();
        data.setWarehouseID(inID);
        data.setWarehouseName(cities[r][3]);
        data.setStreet(cities[r][2]);
        data.setPlz(cities[r][1]);
        data.setCity(cities[r][0]);
        data.setCountry(cities[r][4]);

        return data;

    }
}