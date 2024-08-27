package paquete;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Clase base que representa a un usuario en el sistema.
 */
public class Usuario implements Asesoria {

    //Atributos
    private String nombre;
    private String fechaNacimiento; // DD/MM/AAAA
    private int RUN; // Número menor a 99.999.999

    /**
     * Constructor por defecto.
     *
     * @param string
     * @param i
     */
    public Usuario(int i, String string) {
    }

    /**
     * Constructor que inicializa los atributos del usuario.
     *
     * @param nombre Nombre del usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     * @param RUN RUN del usuario.
     */
    public Usuario(String nombre, String fechaNacimiento, int RUN) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.RUN = RUN;
    }

    //Getters
    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     *
     * @return Fecha de nacimiento del usuario.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene el RUN del usuario.
     *
     * @return RUN del usuario.
     */
    public int getRUN() {
        return RUN;
    }

    //Setters
    /**
     * Establece el nombre del usuario.
     *
     * @param nombre Nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     *
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Establece el RUN del usuario.
     *
     * @param RUN RUN del usuario.
     */
    public void setRUN(int RUN) {
        this.RUN = RUN;
    }

    //Métodos
    /**
     * Convierte la fecha de nacimiento de String a LocalDate.
     *
     * @return LocalDate de la fecha de nacimiento.
     */
    private LocalDate convertirFechaNacimiento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(fechaNacimiento, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Fecha de nacimiento inválida: " + fechaNacimiento);
        }
    }

    /**
     * Calcula la edad del usuario basado en la fecha de nacimiento.
     *
     * @return Edad del usuario.
     */
    public int calcularEdad() {
        LocalDate fechaNac = convertirFechaNacimiento();
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }

    /**
     * Analiza al usuario.
     */
    @Override
    public void analizarUsuario() {
        System.out.println(" Análisis del Usuario:");
        System.out.println("---------------------");
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println(" RUN: " + RUN);

        // Validaciones
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Advertencia: El nombre del usuario no está definido.");
        }
        if (fechaNacimiento == null || fechaNacimiento.isEmpty()) {
            System.out.println("Advertencia: La fecha de nacimiento no está definida.");
        } else {
            // Validar formato de fecha (DD/MM/AAAA)
            if (!fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("Advertencia: La fecha de nacimiento no tiene el formato correcto (DD/MM/AAAA).");
            }
        }
        if (RUN <= 0 || RUN >= 99999999) {
            System.out.println("Advertencia: El RUN no es válido.");
        }
    }

    /**
     * Muestra los datos del usuario.
     */
    @Override
    public String toString() {
        return " Usuario: " + nombre + ", RUN: " + RUN + ", Fecha de nacimiento: " + fechaNacimiento;
    }

    /**
     * Muestra la edad del usuario.
     */
    public void mostrarEdad() {
        System.out.println("El usuario tiene X años");
    }

}
