package paquete;

/**
 * La clase VisitaEnTerreno representa una visita en terreno con un
 * identificador, un RUT de cliente, un día, una hora, un lugar y comentarios.
 */
public final class VisitaEnTerreno {

    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    /**
     * Constructor por defecto.
     */
    public VisitaEnTerreno() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param identificador El identificador de la visita en terreno.
     * @param rutCliente El RUT del cliente.
     * @param dia El día de la visita.
     * @param hora La hora de la visita.
     * @param lugar El lugar de la visita.
     * @param comentarios Los comentarios de la visita.
     */
    public VisitaEnTerreno(int identificador, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setComentarios(comentarios);
    }

    // Getters y Setters
    /**
     * Obtiene el identificador de la visita en terreno.
     *
     * @return El identificador de la visita en terreno.
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Establece el identificador de la visita en terreno.
     *
     * @param identificador El identificador de la visita en terreno.
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * Obtiene el RUT del cliente.
     *
     * @return El RUT del cliente.
     */
    public int getRutCliente() {
        return rutCliente;
    }

    /**
     * Establece el RUT del cliente.
     *
     * @param rutCliente El RUT del cliente.
     */
    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Obtiene el día de la visita.
     *
     * @return El día de la visita.
     */
    public String getDia() {
        return dia;
    }

    /**
     * Establece el día de la visita. Valida que la fecha esté en formato
     * DD/MM/AAAA.
     *
     * @param dia El día de la visita.
     */
    public void setDia(String dia) {
        if (isValidDate(dia)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("El día debe estar en formato DD/MM/AAAA");
        }
    }

    /**
     * Obtiene la hora de la visita.
     *
     * @return La hora de la visita.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la hora de la visita. Valida que la hora esté en formato HH:MM.
     *
     * @param hora La hora de la visita.
     */
    public void setHora(String hora) {
        if (isValidTime(hora)) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar en formato HH:MM");
        }
    }

    /**
     * Obtiene el lugar de la visita.
     *
     * @return El lugar de la visita.
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Establece el lugar de la visita. Valida que el lugar tenga entre 10 y 50
     * caracteres.
     *
     * @param lugar El lugar de la visita.
     */
    public void setLugar(String lugar) {
        if (isValidLugar(lugar)) {
            this.lugar = lugar;
        } else {
            throw new IllegalArgumentException("El lugar debe tener entre 10 y 50 caracteres");
        }
    }

    /**
     * Obtiene los comentarios de la visita.
     *
     * @return Los comentarios de la visita.
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Establece los comentarios de la visita. Valida que los comentarios no
     * superen los 100 caracteres.
     *
     * @param comentarios Los comentarios de la visita.
     */
    public void setComentarios(String comentarios) {
        if (isValidComentarios(comentarios)) {
            this.comentarios = comentarios;
        } else {
            throw new IllegalArgumentException("Los comentarios no pueden exceder los 100 caracteres");
        }
    }

    // Validaciónes
    /**
     * Valida que la fecha esté en formato DD/MM/AAAA.
     *
     * @param date
     * @return
     */
    private boolean isValidDate(String date) {
        return date != null && date.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    /**
     *
     * @param time
     * @return
     */
    private boolean isValidTime(String time) {
        return time != null && time.matches("([01]\\d|2[0-3]):[0-5]\\d");
    }

    /**
     * Valida que el lugar tenga entre 10 y 50 caracteres.
     *
     * @param lugar
     * @return
     */
    private boolean isValidLugar(String lugar) {
        return lugar != null && lugar.length() >= 10 && lugar.length() <= 50;
    }

    /**
     * Valida que los comentarios no superen los 100 caracteres.
     *
     * @param comentarios
     * @return
     */
    private boolean isValidComentarios(String comentarios) {
        return comentarios != null && comentarios.length() <= 100;
    }

    /**
     * Devuelve una representación en cadena de la visita en terreno.
     *
     * @return Una cadena que representa la visita en terreno.
     */
    @Override
    public String toString() {
        return " VisitaEnTerreno{"
                + " Identificador=" + identificador
                + ", RUT Cliente=" + rutCliente
                + ", Dia='" + dia + '\''
                + ", Hora='" + hora + '\''
                + ", Lugar='" + lugar + '\''
                + ", Comentarios='" + comentarios + '\''
                + '}';
    }
}
