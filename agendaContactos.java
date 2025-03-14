import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class agendaContactos implements AgendaInterface {
    private List<Persona> contactos;
    
    public agendaContactos() {
        this.contactos = new ArrayList<>();
    }

    @Override
    public void addContacto(Persona persona) {
        contactos.add(persona);
    }

    @Override
    public void removeContacto(Persona persona) {
        contactos.remove(persona);
    }

    @Override
    public Persona buscarContacto(String nombre) {
        for (Persona persona : contactos) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        return null;
    }

    @Override
    public void mostrarContactos() {
        for (Persona persona : contactos) {
            System.out.print(persona.getNombre() + " - " + Arrays.toString(persona.getTelefonos()));
        }
    }
}

