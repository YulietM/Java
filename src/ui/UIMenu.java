package ui;

import gestion_empleados.Empleado;
import gestion_empleados.EmpleadoRegular;
import gestion_empleados.EmpleadoTiempoParcial;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;

public class UIMenu {

    public static EmpleadoTiempoParcial empleadoTiempoParcialLogged;
    public static EmpleadoRegular empleadoRegularLogged;
    public static void showMenu(){
        int respuesta = 0;
        JOptionPane.showInputDialog(null, "Bienvenido a su detalle de Nomina \n"+ "Por favor seleccione tu tipo de contarto:\n \n"+
                "1. Empleado Regular \n"+ "2. Empleado Tiempo Parcial \n"+ "0. Salir");
        respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "opcion: "));


        switch (respuesta){
            case 1:
                respuesta = 0;
                authUser(1);
        }while (respuesta != 0);

    }

    private static void authUser(int userType){
        ArrayList<Empleado> empleadosRegulares = new ArrayList<>();
        empleadosRegulares.add(new Empleado(20,"yuliet", "yuliet@gmail.com"));
        empleadosRegulares.add(new Empleado(22,"anahi", "anahi@gmail.com"));
        empleadosRegulares.add(new Empleado(34,"rocio", "rociot@gmail.com"));

        ArrayList<Empleado> empleadosParcial = new ArrayList<>();
        empleadosParcial.add(new Empleado(20,"yuliet", "yuliet@gmail.com"));
        empleadosParcial.add(new Empleado(22,"anahi", "anahi@gmail.com"));
        empleadosParcial.add(new Empleado(34,"rocio", "rociot@gmail.com"));

        boolean emailCorrect = false;
        do{
            String email = JOptionPane.showInputDialog("Inserte su correo corporativo: ");

            if(userType == 1){
                for(Empleado r: empleadosRegulares){
                    if(r.getCorreo(). equals(email)){
                        emailCorrect = true;
                        empleadoRegularLogged = r;
                        UIEmpleadoRegularMenu.logged();
                    }
                }
            }
            if(userType == 2){
                for(Empleado p: empleadosParcial){
                    if(p.getCorreo().equals(email)){
                        emailCorrect = true;
                        empleadoTiempoParcialLogged = p;
                    }
                }
            }
        }while(!emailCorrect);
    }

}
