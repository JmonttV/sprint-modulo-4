package paquete;

/**
 * Clase que representa un accidente.
 */
public class Accidente {

    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    /**
     * Constructor vacío para la clase Accidente.
     */
    public Accidente() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param identificador El identificador del accidente.
     * @param rutCliente El RUT del cliente asociado al accidente.
     * @param dia El día del accidente, en formato DD/MM/AAAA.
     * @param hora La hora del accidente, en formato HH:MM.
     * @param lugar El lugar del accidente.
     * @param origen El origen del accidente.
     * @param consecuencias Las consecuencias del accidente.
     */
    public Accidente(int identificador, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        setDia(dia);
        setHora(hora);
        setLugar(lugar);
        setOrigen(origen);
        setConsecuencias(consecuencias);
    }

    // Setters
    /**
     * Establece el día del accidente.
     *
     * @param dia del accidente
     */
    public final void setDia(String dia) {
        if (isValidDate(dia)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("El día debe estar en el formato DD/MM/AAAA");
        }
    }

    /**
     * Establece la hora del accidente.
     *
     * @param hora del accidente
     */
    public final void setHora(String hora) {
        if (isValidTime(hora)) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("La hora debe estar en el formato HH:MM");
        }
    }

    /**
     * Establece el lugar del accidente.
     *
     * @param lugar del accidente
     */
    public final void setLugar(String lugar) {
        if (isValidLugar(lugar)) {
            this.lugar = lugar;
        } else {
            throw new IllegalArgumentException("El lugar debe tener entre 10 y 50 caracteres");
        }
    }

    /**
     * Establece el origen del accidente.
     *
     * @param origen del accidente
     */
    public final void setOrigen(String origen) {
        if (isValidOrigen(origen)) {
            this.origen = origen;
        } else {
            throw new IllegalArgumentException("El origen no puede exceder los 100 caracteres");
        }
    }

    /**
     * Establece las consecuencias del accidente.
     *
     * @param consecuencias del accidente
     */
    public final void setConsecuencias(String consecuencias) {
        if (isValidConsecuencias(consecuencias)) {
            this.consecuencias = consecuencias;
        } else {
            throw new IllegalArgumentException("Las consecuencias no pueden exceder los 100 caracteres");
        }
    }

    // Validaciones
    /**
     * Valida si la fecha es válida.
     *
     * @param date o fecha del accidente
     * @return date
     */
    private boolean isValidDate(String date) {
        return date != null && date.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    /**
     * Valida si la hora es válida.
     *
     * @param time o horario del accidente
     * @return time
     */
    private boolean isValidTime(String time) {
        return time != null && time.matches("([01]\\d|2[0-3]):[0-5]\\d");
    }

    /**
     * Valida si el lugar es válido.
     *
     * @param lugar del accidente
     * @return lugar
     */
    private boolean isValidLugar(String lugar) {
        return lugar != null && lugar.length() >= 10 && lugar.length() <= 50;
    }

    /**
     * Valida si el origen es válido.
     *
     * @param origen del accidente
     * @return origen
     */
    private boolean isValidOrigen(String origen) {
        return origen != null && origen.length() <= 100;
    }

    /**
     * Valida si las consecuencias son válidas.
     *
     * @param consecuencias del accidente
     * @return concecuencias
     */
    private boolean isValidConsecuencias(String consecuencias) {
        return consecuencias != null && consecuencias.length() <= 100;
    }

    // Getters
    /**
     * Obtiene el identificador del accidente.
     *
     * @return identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Obtiene el RUT del cliente asociado al accidente.
     *
     * @return rutCliente
     */
    public int getRutCliente() {
        return rutCliente;
    }

    /**
     * Obtiene el día del accidente.
     *
     * @return dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * Obtiene la hora del accidente.
     *
     * @return hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Obtiene el lugar del accidente.
     *
     * @return lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Obtiene el origen del accidente.
     *
     * @return origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Obtiene las consecuencias del accidente.
     *
     * @return consecuencias
     */
    public String getConsecuencias() {
        return consecuencias;
    }

    // Métodos adicionales
    /**
     * Muestra la información del accidente.
     *
     * @return La informacion del Accidente
     */
    public String mostrarAccidente() {
        return "Accidente{"
                + "identificador=" + identificador
                + ", rutCliente=" + rutCliente
                + ", dia='" + dia + '\''
                + ", hora='" + hora + '\''
                + ", lugar='" + lugar + '\''
                + ", origen='" + origen + '\''
                + ", consecuencias='" + consecuencias + '\''
                + '}';
    }
}
