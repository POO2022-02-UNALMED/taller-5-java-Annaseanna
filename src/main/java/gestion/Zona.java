package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales;

    public Zona(String nombre, Zoologico zoo) {
        super();
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona() {
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public String getNombre() {
        return nombre;
    }
}