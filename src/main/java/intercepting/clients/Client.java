package intercepting.clients;

import intercepting.administrador.ProgramadorTareas;

public interface Client {

    public void setProgramadorTareas(ProgramadorTareas programadorTarefas);

    public void enviarPeticion(String peticion);

}
