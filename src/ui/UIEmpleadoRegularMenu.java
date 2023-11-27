package ui;

import javax.swing.*;

public class UIEmpleadoRegularMenu {

    public static void logged(){
        int response = 0;
        do{
            System.out.println();
            JOptionPane.showInputDialog(null, "Empleado Regular \n"+ "Bienvenido de nuevo" + UIMenu.empleadoRegularLogged.getNombre() +"\n" +"1. Consultar el detalle de nomina \n" +"2. salir");
            response = Integer.parseInt(JOptionPane.showInputDialog(null, "opcion: "));

            switch (response){
                case 1:
                    showMenuEmpleadoMenu();
                case 2:
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void showMenuEmpleadoMenu(){

    }
}
