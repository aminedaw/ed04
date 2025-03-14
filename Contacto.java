import java.util.List;
public class Contacto {
    private String nombre;
    private List<String> telefonos;
    /**
    * @param nombre El nombre del contacto
     * @param telefonos La lista de teléfonos del contacto
     */
    public Contacto(String nombre, List<String> telefonos) {
        this.nombre = nombre;
        this.telefonos = telefonos;
    }
    }
