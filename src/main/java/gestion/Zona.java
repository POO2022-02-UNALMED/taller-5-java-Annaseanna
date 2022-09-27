package gestion;
import zooAnimales.Animal;


import java.util.ArrayList;
import java.util.List;



public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona() {
    }
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
        zoo.agregarZonas(this);
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }

    public Zoologico getZoo(){
        return this.zoo;
    }
    public void setZoo(Zoologico z){
        this.zoo = z;
    }

    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }
    public void agregarAnimales(Animal animal){
        this.animales.add(animal);
        animal.setZona(this);
    }

    public int cantidadAnimales(){
        return this.getAnimales().size();
    }

}