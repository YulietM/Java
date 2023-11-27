#  Sistema de Gestión de Empleados

Descripción:
Desarrolla un sistema de gestión de empleados que incluya empleados regulares y empleados a tiempo parcial. 
Cada empleado tiene un nombre, un ID único y un salario. Los empleados a tiempo parcial reciben un salario por hora, 
mientras que los empleados regulares reciben un salario fijo mensual.


+------------------+
|     Empleado     |
+------------------+
| -id: int          |
| -nombre: String   |
| -salario: double  |
+------------------+
| +calcularSalario(): double |
+------------------+
         ^
         |
 +-------+-------+
 |               |
 |               |
 v               v
+----------------------+
|  EmpleadoRegular     |
+----------------------+
| -salarioMensual: double |
+----------------------+

+----------------------+
|  EmpleadoTiempoParcial|
+----------------------+
| -salarioPorHora: double|
| -horasTrabajadas: int |
+----------------------+