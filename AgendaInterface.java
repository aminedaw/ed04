public interface AgendaInterface {
        void addContacto(Persona persona);
        void removeContacto(Persona persona);
        Persona buscarContacto(String nombre);
        void mostrarContactos();
}
