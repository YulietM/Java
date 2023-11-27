package gestion_empleados;

public class EmpleadoRegular extends Empleado{
    private double salarioMensual;

    EmpleadoRegular(int id, String nombre, String correo){
        super(id, nombre, correo);
        this.salarioMensual = salarioMensual;
    }
}
