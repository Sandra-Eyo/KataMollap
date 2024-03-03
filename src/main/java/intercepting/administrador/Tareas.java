package intercepting.administrador;

import intercepting.filtres.Filtre;
import intercepting.targets.Target;
import java.util.ArrayList;


public class Tareas {

    private Target target = null;
    private ArrayList<Filtre> filtres = new ArrayList<>();

    public Tareas() {};

    ArrayList<Filtre> getTareas() {
        return this.filtres;
    }

    Target getTarget() {
        return this.target;
    }

    public  void anadirTarea(Filtre filtre) {
        this.filtres.add(filtre);
    }

    public void ejecucion(String resultado) {
        this.filtres.forEach(e -> e.ejecucion(resultado));
    }

    public void setTarget(Target target) {
        this.target = target;
    }

}
