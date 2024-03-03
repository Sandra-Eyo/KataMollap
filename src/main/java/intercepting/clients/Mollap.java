package intercepting.clients;

import intercepting.administrador.ProgramadorTareas;

public class Mollap implements Client {

        private ProgramadorTareas programadorTareas;

        public Mollap() {
        }

        @Override
        public void setProgramadorTareas(ProgramadorTareas programadorTareas) {
            this.programadorTareas = programadorTareas;
        }

        @Override
        public void enviarPeticion(String peticion) {
            this.programadorTareas.ejecutarTareas(peticion);
        }

        public static void main(String[] args) { }

}