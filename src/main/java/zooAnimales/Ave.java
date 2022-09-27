package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {

    public static int halcones;
    public static int aguilas;
    private final static List<Ave> listado = new ArrayList<>();

    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave() {
        listado.add(this);
    }

    public static int cantidadAves() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(aguila);
        return aguila;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }
}