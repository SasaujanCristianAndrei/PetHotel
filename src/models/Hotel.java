package models;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Animal> caini;
    private List<Animal> pisici;

    public Hotel()
    {
        this.caini = new ArrayList<>();
        this.pisici=new ArrayList<>();
    }


    public double sumaPretCaine(List<Animal> Caini)
    {
        double totalSumCaine=0;
        for(int i=0;i<getCaini().size();i++) {
            if (caini.get(i).getSpecie().equals("CAINE")) {
                totalSumCaine = totalSumCaine + 50 + (0.02 * getCaini().get(i).getGreutate());
            }
        }
        return totalSumCaine;
    }

    public double sumaPretPisici(List<Animal> Pisici)
    {
        double totalSumPisici=0;
        for(int i=0;i<getPisici().size();i++) {
            if (pisici.get(i).getSpecie().equals("PISICA")) {
                totalSumPisici = totalSumPisici +30;
            }
        }
        return totalSumPisici;
    }


    public List<Animal> getCaini() {
        return caini;
    }

    public void setCaini(List<Animal> caini) {
        this.caini = caini;
    }

    public List<Animal> getPisici() {
        return pisici;
    }

    public void setPisici(List<Animal> pisici) {
        this.pisici = pisici;
    }
}
