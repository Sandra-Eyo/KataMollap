package intercepting.administrador;

import intercepting.targets.Target;
import intercepting.filtres.Filtre;

public class ProgramadorTareas {

    private Tareas tareas = null;

    public ProgramadorTareas() {};

    public ProgramadorTareas(Target target) {
        this.tareas = new Tareas();
        this.tareas.setTarget(target);
    }

    public Tareas getTareas() {
        return this.tareas;
    }

    public void setTarea(Filtre filtre) {
        this.tareas.anadirTarea(filtre);
    }

    public void ejecutarTareas(String resultado) {
    }

}
