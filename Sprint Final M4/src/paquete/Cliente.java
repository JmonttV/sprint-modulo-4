package paquete;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un usuario cliente.
 */
public class Cliente extends Usuario {

    // Atributos
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;
    private final List<VisitaEnTerreno> visitasEnTerreno = new ArrayList<>();

    /**
     * Constructor vacío para la clase Cliente.
     */
    public Cliente() {
        super("", "", 0);
    }

    /**
     * Constructor que acepta un objeto Usuario.
     *
     * @param usuario El objeto Usuario del cual se inicializarán los atributos
     * del Cliente.
     */
    public Cliente(Usuario usuario) {
        super(usuario.getNombre(), usuario.getFechaNacimiento(), usuario.getRUN());
        // Inicializar otros atributos específicos de Cliente si es necesario
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre El nombre del usuario.
     * @param fechaNacimiento La fecha de nacimiento del usuario.
     * @param RUN El RUN (Rol Único Nacional) del usuario.
     * @param rut El RUT (Rol Único Tributario) del usuario.
     * @param nombres Los nombres del usuario.
     * @param apellidos Los apellidos del usuario.
     * @param telefono El número de teléfono del usuario.
     * @param afp La AFP (Administradora de Fondos de Pensiones) del usuario.
     * @param sistemaSalud El sistema de salud del usuario (1: Fonasa, 2:
     * Isapre).
     * @param direccion La dirección del usuario.
     * @param comuna La comuna de residencia del usuario.
     * @param edad La edad del usuario.
     */
    public Cliente(String nombre, String fechaNacimiento, int RUN, int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, RUN);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    // Getters 
    /**
     * Obtiene el RUT del cliente.
     *
     * @return El RUT del cliente.
     */
    public int getRut() {
        return rut;
    }

    /**
     * Método que retorna los nombres del cliente.
     *
     * @return Los nombres del cliente.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Método que retorna los apellidos del cliente.
     *
     * @return Los apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método que retorna el teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que retorna la AFP del cliente.
     *
     * @return La AFP del cliente.
     */
    public String getAfp() {
        return afp;
    }

    /**
     * Método que retorna el sistema de salud del cliente.
     *
     * @return El sistema de salud del cliente.
     */
    public int getSistemaSalud() {
        return sistemaSalud;
    }

    /**
     * Método que retorna la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que retorna la comuna del cliente.
     *
     * @return La comuna del cliente.
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Método que retorna la edad del cliente.
     *
     * @return La edad del cliente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que retorna las visitas en terreno del cliente.
     *
     * @return Las visitas en terreno del cliente.
     */
    public List<VisitaEnTerreno> getVisitasEnTerreno() {
        return visitasEnTerreno;
    }

    // Setters
    /**
     * Establece el RUT del cliente.
     *
     * @param rut El RUT del cliente.
     * @throws IllegalArgumentException Si el RUT no es válido.
     */
    public void setRut(int rut) {
        if (rut > 0 && rut < 100000000) {
            this.rut = rut;
        } else {
            throw new IllegalArgumentException("El RUT debe ser un número menor a 99.999.999");
        }
    }

    /**
     * Establece los nombres del cliente.
     *
     * @param nombres Los nombres del cliente.
     * @throws IllegalArgumentException Si los nombres no son válidos.
     */
    public void setNombres(String nombres) {
        if (nombres != null && nombres.length() >= 5 && nombres.length() <= 30) {
            this.nombres = nombres;
        } else {
            throw new IllegalArgumentException("Los nombres deben tener entre 5 y 30 caracteres");
        }
    }

    /**
     * Establece los apellidos del cliente.
     *
     * @param apellidos Los apellidos del cliente.
     * @throws IllegalArgumentException Si los apellidos no son válidos.
     */
    public void setApellidos(String apellidos) {
        if (apellidos != null && apellidos.length() >= 5 && apellidos.length() <= 30) {
            this.apellidos = apellidos;
        } else {
            throw new IllegalArgumentException("Los apellidos deben tener entre 5 y 30 caracteres");
        }
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El número de teléfono del cliente.
     * @throws IllegalArgumentException Si el teléfono no es válido.
     */
    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono es obligatorio");
        }
    }

    /**
     * Establece la AFP del cliente.
     *
     * @param afp La AFP del cliente.
     * @throws IllegalArgumentException Si la AFP no es válida.
     */
    public void setAfp(String afp) {
        if (afp != null && afp.length() >= 4 && afp.length() <= 30) {
            this.afp = afp;
        } else {
            throw new IllegalArgumentException("La AFP debe tener entre 4 y 30 caracteres");
        }
    }

    /**
     * Establece el sistema de salud del cliente.
     *
     * @param sistemaSalud El sistema de salud del cliente (1: Fonasa, 2:
     * Isapre).
     * @throws IllegalArgumentException Si el sistema de salud no es válido.
     */
    public void setSistemaSalud(int sistemaSalud) {
        if (sistemaSalud == 1 || sistemaSalud == 2) {
            this.sistemaSalud = sistemaSalud;
        } else {
            throw new IllegalArgumentException("El sistema de salud debe ser 1 (Fonasa) o 2 (Isapre)");
        }
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     * @throws IllegalArgumentException Si la dirección no es válida.
     */
    public void setDireccion(String direccion) {
        if (direccion == null || direccion.length() <= 70) {
            this.direccion = direccion;
        } else {
            throw new IllegalArgumentException("La dirección no puede exceder los 70 caracteres");
        }
    }

    /**
     * Establece la comuna del cliente.
     *
     * @param comuna La comuna del cliente.
     * @throws IllegalArgumentException Si la comuna no es válida.
     */
    public void setComuna(String comuna) {
        if (comuna == null || comuna.length() <= 50) {
            this.comuna = comuna;
        } else {
            throw new IllegalArgumentException("La comuna no puede exceder los 50 caracteres");
        }
    }

    /**
     * Establece la edad del cliente.
     *
     * @param edad La edad del cliente.
     * @throws IllegalArgumentException Si la edad no es válida.
     */
    public void setEdad(int edad) {
        if (edad >= 0 && edad < 150) {
            this.edad = calcularEdad();
        } else {
            throw new IllegalArgumentException("La edad debe ser un número entre 0 y 149");
        }
    }

    // Otros métodos
    public void agregarVisitaEnTerreno(VisitaEnTerreno visita) {
        visitasEnTerreno.add(visita);
    }

    /**
     * Calcula la edad del cliente en base a la fecha de nacimiento.
     *
     * @return La edad del cliente.
     */
    @Override
    public int calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(getFechaNacimiento(), formatter);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    /**
     * Método que retorna la representación en String de un objeto Cliente.
     *
     * @return La representación en String de un objeto Cliente.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(" Cliente  :");
        sb.append(" RUT=").append(rut);
        sb.append(", Nombres='").append(nombres).append('\'');
        sb.append(", Apellidos='").append(apellidos).append('\'');
        sb.append(", Teléfono='").append(telefono).append('\'');
        sb.append(", AFP='").append(afp).append('\'');
        sb.append(", Sistema de Salud=").append(sistemaSalud);
        sb.append(", Dirección='").append(direccion).append('\'');
        sb.append(", Comuna='").append(comuna).append('\'');
        sb.append(", Edad=").append(edad);
        sb.append(' ');
        return sb.toString();
    }

    /**
     * Método que imprime los datos de un cliente.
     */
    @Override
    public void analizarUsuario() {
        System.out.println(super.toString());
        System.out.println(" Dirección: " + direccion);
        System.out.println(" Comuna: " + comuna);
    }
}
