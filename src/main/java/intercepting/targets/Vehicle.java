package intercepting.targets;

public class Vehicle implements Target {

    public Vehicle() { };

    @Override
    public void ejecucion(String resultado) {
        System.out.println("Puerta abierta " + resultado + "!");
    }

}
