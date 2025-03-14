import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<Contacto> contactos;
    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void addContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public boolean eliminarContacto(Contacto contacto) {
        return contactos.remove(contacto);
    }

}

