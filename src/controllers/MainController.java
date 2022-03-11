package controllers;

import models.Animal;
import models.Hotel;
import views.MainView;
import views.SecondView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainController {

    private MainView mainView;
    private SecondView secondView;
    private Hotel hotel;

    public MainController(MainView mainView, SecondView secondView, Hotel hotel)
    {
        this.mainView = mainView;
        this.secondView = secondView;
        this.hotel = hotel;

        this.secondView.addVeziPretListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int c=0;
                for(int i=0;i<hotel.getCaini().size();i++)
                {

                    if(hotel.getCaini().get(i).getNume().equals(secondView.getTextNumeField()) && secondView.getComboSpecieBox().equals("CAINE"))
                    {
                        secondView.showMessage("Pretul curent cazare si servicii:"+hotel.getCaini().get(i).getPret());
                    }
                    c=1;
                }

                for(int i=0;i<hotel.getPisici().size();i++)
                {
                    if(hotel.getPisici().get(i).getNume().equals(secondView.getTextNumeField()) && secondView.getComboSpecieBox().equals("PISICA"))
                    {
                        secondView.showMessage("Pretul curent cazare si servicii:"+hotel.getPisici().get(i).getPret());
                    }
                    c=1;
                }

                if(c==0)
                {
                    secondView.showMessage("Cazati mai intai animalul");

                }
            }
        });

        this.secondView.addSpalaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int c=0;
                for(int i=0;i<hotel.getCaini().size();i++)
                {
                    if(hotel.getCaini().get(i).getNume().equals(secondView.getTextNumeField()) && secondView.getComboSpecieBox().equals("CAINE"))
                    {
                      hotel.getCaini().get(i).setPret(hotel.getCaini().get(i).getPret()+15);
                      //secondView.showMessage("Pretul curent cazare si servicii:"+hotel.getCaini().get(i).getPret());
                    }
                    c=1;
                }

                for(int i=0;i<hotel.getPisici().size();i++)
                {
                    if(hotel.getPisici().get(i).getNume().equals(secondView.getTextNumeField()) && secondView.getComboSpecieBox().equals("PISICA"))
                    {
                      hotel.getPisici().get(i).setPret(hotel.getPisici().get(i).getPret()+15);
                      //secondView.showMessage("Pretul curent cazare si servicii:"+hotel.getPisici().get(i).getPret());
                    }
                    c=1;
                }
                if(c==0) secondView.showMessage("Cazati mai intai animalul");

            }
        });

        this.secondView.addPlimbaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c=0;
                for(int i=0;i<hotel.getCaini().size();i++)
                {
                    if(hotel.getCaini().get(i).getNume().equals(secondView.getTextNumeField()) && secondView.getComboSpecieBox().equals("CAINE"))
                    {
                        hotel.getCaini().get(i).setPret(hotel.getCaini().get(i).getPret()+5);
                        //secondView.showMessage("Pretul curent cazare si servicii:"+hotel.getCaini().get(i).getPret())
                    }
                    c=1;
                }

                for(int i=0;i<hotel.getPisici().size();i++)
                {
                    if(hotel.getPisici().get(i).getNume().equals(secondView.getTextNumeField()) && secondView.getComboSpecieBox().equals("PISICA"))
                    {
                        hotel.getPisici().get(i).setPret(hotel.getPisici().get(i).getPret()+5);
                        //secondView.showMessage("Pretul curent cazare si servicii:"+hotel.getPisici().get(i).getPret());
                    }
                    c=1;
                }
                if(c==0) secondView.showMessage("Cazati mai intai animalul");
            }
        });

        this.mainView.addVfDisponibilitateListner(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mainView.getComboBoxMain().equals("CAINE"))
                {

                    if(hotel.getCaini().size()<5)
                    {
                        mainView.setAfisareLocLabel("Da, este loc!");
                    }
                    else
                    {
                        mainView.setAfisareLocLabel("Nu este loc!");
                    }
                }
                if(mainView.getComboBoxMain().equals("PISICA"))
                {
                    if(hotel.getPisici().size()<10)
                    {
                        mainView.setAfisareLocLabel("Da, este loc!");
                    }
                    else
                    {
                        mainView.setAfisareLocLabel("Nu este loc!");
                    }
                }

            }
        });

        this.secondView.addCazeazaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String nume=secondView.getTextNumeField();

                    try
                    {
                        Double.parseDouble(nume);
                        throw new Exception("nu e nume");
                    }catch (Exception exceptie2)
                    {
                        if(exceptie2.getMessage().equals("nu e nume"))
                            throw new Exception("nu e nume");
                    }

                    String specie=secondView.getComboSpecieBox();

                    double greutate=secondView.getTextGreutateField();
                    if(greutate<0) throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");

                    if(hotel.getCaini().size()>5)
                    {
                        throw new Exception("Nu mai este loc in adapost");
                    }

                    if(hotel.getPisici().size()>10)
                    {
                        throw new Exception("Nu mai este loc in adapost");
                    }



                    if(specie.equals("CAINE"))
                    {
                        double pretC=0;
                        pretC=50+(0.02*greutate);
                        Animal animal=new Animal(nume,greutate,specie,pretC);
                        hotel.getCaini().add(animal);

                    }
                    else
                    {
                        double pretP=0;
                        pretP=30;
                        Animal animal=new Animal(nume,greutate,specie,pretP);
                        hotel.getPisici().add(animal);
                    }

                    secondView.showMessage("Animalul a fost cazat!");

                }catch(Exception exception)
                {
                    if(exception.getMessage().equals("Nu mai este loc in adapost"))
                    {
                        secondView.showMessage("Hotelul este plin");
                    }else{

                        secondView.showMessage("Bad input");
                }

                }


            }
        });


        this.secondView.addExistListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                secondView.setVisible(false);
                mainView.setVisible(true);
            }
        });

        this.mainView.addInregistrareListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.setVisible(false);
                secondView.setVisible(true);
            }
        });



    }
}
