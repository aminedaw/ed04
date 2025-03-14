import java.util.List;
public class Persona {
    private String nombre;
    private List<String> telefonos;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String[] telefonos) {
        this.telefonos = List.of(telefonos);
    }
    }
