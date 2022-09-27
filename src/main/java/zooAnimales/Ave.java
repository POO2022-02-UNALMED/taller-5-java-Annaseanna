package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    static private ArrayList<Ave> listado = new ArrayList<Ave>();
    static public int halcones;
    static public int aguilas;
    private String colorPlumas;

    public Ave() {
        Ave.listado.add(this);
    }
    public Ave(String nombre,int edad,String habitat,String genero,String colorplumas) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.colorPlumas = colorplumas;
        Ave.listado.add(this);
    }

    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void getColorPlumas(String c){
        colorPlumas = c;
    }

    public String movimiento() {
        return "volar";
    }

    static public ArrayList<Ave> getListado(){
        return Ave.listado;
    }

    static public int cantidadAves() {
        return Ave.getListado().size();
    }

    static public Ave crearHalcon(String nombre,int edad,String genero) {
        halcones++;
        return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
    }

    static public Ave crearAguila(String nombre,int edad,String genero) {
        aguilas++;
        return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
    }
}