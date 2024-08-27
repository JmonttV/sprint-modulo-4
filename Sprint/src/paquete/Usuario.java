package paquete;

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
     */
    public Usuario() {
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
     * Lista los usuarios con el RUN especificado.
     *
     * @param run RUN del usuario a listar.
     */
    @Override
    public void listarUsuarios(int run) {
        if (this.RUN == run) {
            System.out.println(this);
        }
    }

    /**
     * Muestra la edad del usuario.
     */
    public void mostrarEdad() {
        System.out.println("El usuario tiene X años");
    }

    @Override
    public void eliminarCliente(int run) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarProfesional(int run) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarAdministrativo(int run) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarCapacitacion(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarAccidente(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarVisitaEnTerreno(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void eliminarRevision(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarUsuarios() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarClientes() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarProfesionales() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarAdministrativos() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarCapacitaciones() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarAccidentes() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarVisitasEnTerreno() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarRevisiones() {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarClientes(int run) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarProfesionales(int run) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarAdministrativos(int run) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarCapacitaciones(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarAccidentes(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarVisitasEnTerreno(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarRevisiones(int identificador) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarUsuariosPorTipo(Class<?> tipo) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listarClientesPorTipo(Class<?> tipo) {
        // TODO Auto-generated method stub

    }

}
