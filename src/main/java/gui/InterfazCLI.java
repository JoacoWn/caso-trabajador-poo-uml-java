package gui;

import data.Trabajador;

import java.util.Scanner;

public class InterfazCLI {
    private Scanner sc = new Scanner(System.in);

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
    public void mostrarTrabaajador(Trabajador trabajador) {
        System.out.println("Datos del trabajador: ");
        System.out.println(trabajador);
    }
}
