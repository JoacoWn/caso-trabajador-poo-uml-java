package launcher;

import gui.InterfazCLI;

public class Main {
    public static void main(String[] args) {
        InterfazCLI interfaz = new InterfazCLI();
        interfaz.mostrarTrabaajador(interfaz.leerTrabajador());
    }
}
