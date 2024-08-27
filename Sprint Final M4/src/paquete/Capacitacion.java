package paquete;

/**
 * La clase Capacitacion representa una capacitación con sus detalles.
 */
public class Capacitacion {

    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;
    private String nombre;

    /**
     * Constructor por defecto.
     */
    public Capacitacion() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param identificador el identificador de la capacitación
     * @param rutCliente el RUT del cliente
     * @param dia el día de la capacitación
     * @param hora la hora de la capacitación
     * @param lugar el lugar de la capacitación
     * @param duracion la duración de la capacitación
     * @param cantidadAsistentes la cantidad de asistentes a la capacitación
     */
    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    // Getters
    /**
     * Obtiene el identificador de la capacitación.
     *
     * @return el identificador de la capacitación
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Obtiene el RUT del cliente.
     *
     * @return el RUT del cliente
     */
    public String getRutCliente() {
        return rutCliente;
    }

    /**
     * Obtiene el día de la capacitación.
     *
     * @return el día de la capacitación
     */
    public String getDia() {
        return dia;
    }

    /**
     * Obtiene la hora de la capacitación.
     *
     * @return la hora de la capacitación
     */
    public String getHora() {
        return hora;
    }

    /**
     * Obtiene el lugar de la capacitación.
     *
     * @return el lugar de la capacitación
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Obtiene la duración de la capacitación.
     *
     * @return la duración de la capacitación
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Obtiene la cantidad de asistentes a la capacitación.
     *
     * @return la cantidad de asistentes a la capacitación
     */
    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    /**
     * Obtiene el nombre de la capacitación.
     *
     * @return el nombre de la capacitación
     */
    public String getNombre() {
        return nombre;
    }

    // Setters
    /**
     * Establece el identificador de la capacitación.
     *
     * @param identificador el identificador de la capacitación
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * Establece el RUT del cliente.
     *
     * @param rutCliente el RUT del cliente
     */
    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Establece el día de la capacitación.
     *
     * @param dia el día de la capacitación
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Establece la hora de la capacitación.
     *
     * @param hora la hora de la capacitación
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Establece el lugar de la capacitación.
     *
     * @param lugar el lugar de la capacitación
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Establece la duración de la capacitación.
     *
     * @param duracion la duración de la capacitación
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * Establece la cantidad de asistentes a la capacitación.
     *
     * @param cantidadAsistentes la cantidad de asistentes a la capacitación
     */
    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Establece el nombre de la capacitación.
     *
     * @param nombre el nombre de la capacitación
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos adicionales
    /**
     * Devuelve una representación en cadena de la capacitación.
     *
     * @return una cadena que representa la capacitación
     */
    @Override
    public String toString() {
        return new StringBuilder("Capacitación{")
                .append("identificador=").append(identificador)
                .append(", rutCliente=").append(rutCliente)
                .append(", dia='").append(dia).append('\'')
                .append(", hora='").append(hora).append('\'')
                .append(", lugar='").append(lugar).append('\'')
                .append(", duracion='").append(duracion).append('\'')
                .append(", cantidadAsistentes=").append(cantidadAsistentes)
                .append('}').toString();
    }
}
