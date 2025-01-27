package personas;

import java.util.Vector;

public class ListaPersonas {
    Vector listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector();
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    public void borrarLista() {
        listaPersonas.removeAllElements();
    }

    public boolean existePersona(String nombre, String apellidos) {
        for (Object obj : listaPersonas) {
            Persona p = (Persona) obj;
            if (p.nombre.equals(nombre) && p.apellidos.equals(apellidos)) {
                return true;
            }
        }
        return false;
    }

    public Persona obtenerPersona(int indice) {
        return (Persona) listaPersonas.get(indice);
    }
}
