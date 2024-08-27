package paquete;

/**
 * Clase que representa un usuario profesional.
 */
public class Profesional extends Usuario {

    private String titulo;
    private String fechaIngreso;

    /**
     * Constructor por defecto.
     */
    public Profesional() {
        super("", "", 0); // Invoke the Usuario class constructor with empty values
    }

    /**
     * Constructor con parámetros.
     *
     * @param usuario El usuario base.
     * @param titulo El título del profesional.
     * @param fechaIngreso La fecha de ingreso del profesional.
     */
    public Profesional(Usuario usuario, String titulo, String fechaIngreso) {
        super(usuario.getNombre(), usuario.getFechaNacimiento(), usuario.getRUN());
        setTitulo(titulo);
        validateAndSetFechaIngreso(fechaIngreso);
    }

    /**
     * Valida y establece la fecha de ingreso del profesional.
     *
     * @param fechaIngreso La fecha de ingreso del profesional.
     */
    private void validateAndSetFechaIngreso(String fechaIngreso) {
        if (fechaIngreso != null && fechaIngreso.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.fechaIngreso = fechaIngreso;
        } else {
            throw new IllegalArgumentException("La fecha de ingreso debe estar en el formato DD/MM/AAAA");
        }
    }

    // Getters y Setters
    /**
     * Obtiene el título del profesional.
     *
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del profesional.
     *
     * @param titulo del usuario profesional
     */
    public final void setTitulo(String titulo) {
        if (titulo != null && titulo.length() >= 10 && titulo.length() <= 50) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("El título debe tener entre 10 y 50 caracteres");
        }
    }

    /**
     * Obtiene la fecha de ingreso del profesional.
     *
     * @return fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Establece la fecha de ingreso del profesional.
     *
     * @param fechaIngreso del usuario profesional
     */
    public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso != null && fechaIngreso.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.fechaIngreso = fechaIngreso;
        } else {
            throw new IllegalArgumentException("La fecha de ingreso debe estar en el formato DD/MM/AAAA");
        }
    }

    // Métodos
    /**
     * Método que imprime el título y la fecha de ingreso del profesional. Se
     * sobreescribe el método analizarUsuario() de la clase padre.
     *
     * @see Usuario#analizarUsuario()
     */
    @Override
    public void analizarUsuario() {
        // Llamada al método analizarUsuario() de la clase padre
        super.analizarUsuario();
        // Imprimir el título y la fecha de ingreso del profesional
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
    }

    /**
     * Método que imprime el título y la fecha de ingreso del profesional. Se
     * sobreescribe el método toString() de la clase padre.
     *
     * @see Usuario#toString()
     */
    @Override
    public String toString() {
        return " Profesional{"
                + " Titulo='" + titulo + '\''
                + ", Fecha de Ingreso='" + fechaIngreso + '\''
                + '}';
    }
}
