package gestion_empleados;

public class Empleado {
    private int id;
    private String nombre;
    private Double salario;
    private  String correo;

    public Empleado(int id, String nombre, String correo){
        this.id = id++;
        this.nombre = nombre;
        this.correo = correo;
        this.salario = salario;
    }
    public double calcularSalario(){
        return calcularSalario();
    }

    public String getNombre() {
        return "nombre: "+nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String  getSalario() {
        return salario + "Pesos";
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
