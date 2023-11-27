package gestion_empleados;

public class EmpleadoTiempoParcial {

    private double salarioPorHoras;
    private int horasTrabajadas;

    EmpleadoTiempoParcial(double salarioPorHoras, int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHoras = salarioPorHoras;
    }

    public double getSalarioPorHoras() {
        return salarioPorHoras;
    }

    public void setSalarioPorHoras(double salarioPorHoras) {
        this.salarioPorHoras = salarioPorHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
