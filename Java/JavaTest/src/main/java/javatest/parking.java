package javatest;

import java.util.ArrayList;

/**
 * parking
 */
public class parking {

    private ArrayList<place> places = new ArrayList<place>();

    private ArrayList<vehicule> vehiculesPresents = new ArrayList<vehicule>();

    // nom du parking
    private String nom;
    // nombre de place sur le parking
    private int nbPlaces;

    public ArrayList<place> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<place> places) {
        this.places = places;
    }
    public ArrayList<vehicule> getVehiculesPresents() {
        return vehiculesPresents;
    }

    public void setVehiculesPresents(ArrayList<vehicule> vehiculesPresents) {
        this.vehiculesPresents = vehiculesPresents;
    }

    public parking(String nom, int nbPlaces)  {
        this.nom = nom;
        this.nbPlaces = nbPlaces;

        for(int i = 0; i < nbPlaces; i++);
    }
    


}

