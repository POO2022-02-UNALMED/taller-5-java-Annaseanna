
import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private List<Zona> zona;

    public Zoologico(String nombre, String ubicacion) {
        super();
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico() {
        this.zona = new ArrayList<>();
    }

    public void agregarZonas(Zona zona) {
        this.zona.add(zona);
    }

    public int cantidadTotalAnimales() {
        return zona.stream()
                .mapToInt(zona -> zona.getAnimales().size())
                .sum();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Zona> getZona() {
        return zona;
    }
}