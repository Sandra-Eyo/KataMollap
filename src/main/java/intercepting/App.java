package intercepting;

import intercepting.administrador.ProgramadorTareas;
import intercepting.clients.Mollap;
import intercepting.filtres.Autorizacion;
import intercepting.targets.Vehicle;
import intercepting.filtres.Autenticacion;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuracion del programador de tareas
         * del sistema con el tipo de target elegido:
         * desde vehiculos a cualquier cosa que admita
         * la recepcion de un mensaje.
         */
        ProgramadorTareas programadorTasques = new ProgramadorTareas(new Vehicle());

        /**
         * Añadir al sistema las tareas que queremos que el sistema
         * ejecute al recibir la peticion del cliente.
         */
        programadorTasques.setTarea(new Autenticacion());
        programadorTasques.setTarea(new Autorizacion());

        /**
         * Configuracion de la app cliente para que
         * ejecute las tareas programades y
         * envie el mensaje al sistema.
         */
        Mollap mollap = new Mollap();
        mollap.setProgramadorTareas(programadorTasques);
        mollap.enviarPeticion("Francesc");
    }
}
