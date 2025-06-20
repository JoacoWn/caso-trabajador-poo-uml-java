package gui;

import data.Trabajador;

import java.util.Scanner;

public class InterfazCLI {
    private final Scanner sc = new Scanner(System.in);
    private Trabajador trabajador;

    public InterfazCLI() {
        this.trabajador = leerTrabajador();
        menu();

    }

    public Trabajador leerTrabajador() {
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese rut:");
        String rut = sc.nextLine();
        System.out.println("Ingrese isapre:");
        String isapre = sc.nextLine();
        System.out.println("Ingrese afp:");
        String afp = sc.nextLine();

        return new Trabajador(nombre, apellido, rut, isapre, afp);
    }
    public void mostrarTrabajador(Trabajador trabajador) {
        System.out.println("Datos del trabajador: ");
        System.out.println(trabajador);
    }
    public void menu() {
        String opcion;
        do {
            mostrarOpciones();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (!opcion.equals("5"));
    }
    public void mostrarOpciones() {
        System.out.println("\n=============================");
        System.out.println("            Editar Trabajador             ");
        System.out.println("      Opciones      ");
        System.out.println("============================= ");
        System.out.println("    [0] Ver datos trabajador ");
        System.out.println("    [1] Editar nombre   ");
        System.out.println("    [2] Editar apellido   ");
        System.out.println("    [3] Editar isapre      ");
        System.out.println("    [4] Editar afp  ");
        System.out.println("    [5] Salir         ");
        System.out.println("============================= ");
        System.out.print("      Opcion: ");
    }
    public String leerOpcion() {
        return sc.nextLine();
    }
    public void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "0" -> mostrarTrabajador(trabajador);
            case "1" -> trabajador.setNombre(nuevoNombre());
            case "2" -> trabajador.setApellido(nuevaApellido());
            case "3" -> trabajador.setIsapre(nuevaIsapre());
            case "4" -> trabajador.setAfp(nuevaAfp());
            case "5" -> System.out.println("Saliendo...");
            default -> System.out.println("Opción inválida...");
        }
    }
    private String nuevoNombre(){
        System.out.println("Ingrese nuevo nombre: ");
        return sc.nextLine();
    }
    private String nuevaApellido(){
        System.out.println("Ingrese nuevo apellido");
        return sc.nextLine();
    }
    private String nuevaIsapre(){
        System.out.println("Ingrese nuevo isapre");
        return sc.nextLine();
    }
    private String nuevaAfp(){
        System.out.println("Ingrese nuevo afp");
        return sc.nextLine();
    }


}
