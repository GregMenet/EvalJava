package javatest;

/**
 * vehicule
 */
public class vehicule {

    private String numImmatriculation;
    private String voiture;

    public vehicule(String numImmatriculation, String voiture) {
        this.setNumImmatriculation(numImmatriculation);
        this.setVoiture(voiture);
    }

    public String getVoiture() {
        return voiture;
    }

    public void setVoiture(String voiture) {
        this.voiture = voiture;
    }

    public String getNumImmatriculation() {
        return numImmatriculation;
    }

    public void setNumImmatriculation(String numImmatriculation) {
        this.numImmatriculation = numImmatriculation;
    }

    
    

    



}