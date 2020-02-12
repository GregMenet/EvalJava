package javatest;

/**
 * place
 */
public abstract class place {

    public int numeroPlace;
    public vehicule vehicule;

    // Constructeur
    public place(int numeroPlace, vehicule vehicule) {
		this.numeroPlace = numeroPlace;
		this.vehicule = vehicule;
    }

    // Place de parking
    public int getNum() {
		return this.numeroPlace;
    }

}