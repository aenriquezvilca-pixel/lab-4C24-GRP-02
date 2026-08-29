/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentReport;

/**
 *
 * @author usuario
 */
public class StudentReport {

    public void mostrarReporte() {
        System.out.println("Reporte de estudiantes");
    }

    public void mostrarReporteDetallado(String nombreEstudiante, double promedio) {
        System.out.println("--- Reporte Detallado ---");
        System.out.println("Estudiante: " + nombreEstudiante);
        System.out.println("Promedio: " + promedio);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 13) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Desaprobado");
        }
    }
}