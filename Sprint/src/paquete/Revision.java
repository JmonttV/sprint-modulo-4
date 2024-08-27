package paquete;

/**
 * La clase Revisión representa una revisión con un identificador, un
 * identificador de visita, un nombre, un detalle y un estado.
 */
public final class Revision {

    private int identificador;
    private int identificadorVisita;
    private String nombre;
    private String detalle;
    private int estado;

    /**
     * Constructor por defecto.
     */
    public Revision() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param identificador El identificador de la revisión.
     * @param identificadorVisita El identificador de la visita asociada.
     * @param nombre El nombre de la revisión.
     * @param detalle El detalle de la revisión.
     * @param estado El estado de la revisión.
     */
    public Revision(int identificador, int identificadorVisita, String nombre, String detalle, int estado) {
        this.identificador = identificador;
        this.identificadorVisita = identificadorVisita;
        setNombre(nombre);
        setDetalle(detalle);
        setEstado(estado);
    }

    // Getters y Setters
    /**
     * Obtiene el identificador de la revisión.
     *
     * @return El identificador de la revisión.
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Establece el identificador de la revisión.
     *
     * @param identificador El identificador de la revisión.
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * Obtiene el identificador de la visita asociada.
     *
     * @return El identificador de la visita asociada.
     */
    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    /**
     * Establece el identificador de la visita asociada.
     *
     * @param identificadorVisita El identificador de la visita asociada.
     */
    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    /**
     * Obtiene el nombre de la revisión.
     *
     * @return El nombre de la revisión.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la revisión.
     *
     * @param nombre El nombre de la revisión.
     */
    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 10 && nombre.length() <= 50) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres");
        }
    }

    /**
     * Obtiene el detalle de la revisión.
     *
     * @return El detalle de la revisión.
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Establece el detalle de la revisión.
     *
     * @param detalle El detalle de la revisión.
     */
    public void setDetalle(String detalle) {
        if (detalle != null && detalle.length() <= 100) {
            this.detalle = detalle;
        } else {
            throw new IllegalArgumentException("El detalle no puede exceder los 100 caracteres");
        }
    }

    /**
     * Obtiene el estado de la revisión.
     *
     * @return El estado de la revisión.
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la revisión.
     *
     * @param estado El estado de la revisión.
     */
    public void setEstado(int estado) {
        if (estado == 1 || estado == 2 || estado == 3) {
            this.estado = estado;
        } else {
            throw new IllegalArgumentException("El estado debe ser 1 (sin problemas), 2 (con observaciones), o 3 (no aprueba)");
        }
    }

    /**
     * Devuelve una representación en cadena de la revisión.
     *
     * @return Una cadena que representa la revisión.
     */
    @Override
    public String toString() {
        return " Revisión{"
                + " Identificador=" + identificador
                + ", IdentificadorVisita=" + identificadorVisita
                + ", Nombre='" + nombre + '\''
                + ", Detalle='" + detalle + '\''
                + ", Estado=" + estado
                + '}';
    }
}
