package paquete;

/**
 * Clase que representa un usuario administrativo.
 */
public class Administrativo extends Usuario {

    private String area;
    private String experienciaPrevia;

    // Constructor vacío
    /**
     * Constructor vacío para la clase Administrativo.
     */
    public Administrativo() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param usuario El usuario base del cual se heredan los atributos.
     * @param area El área de trabajo del administrativo.
     * @param experienciaPrevia La experiencia previa del administrativo.
     */
    public Administrativo(Usuario usuario, String area, String experienciaPrevia) {
        super(usuario.getNombre(), usuario.getFechaNacimiento(), usuario.getRUN());
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    // Getters 
    /**
     * Método que retorna el área del administrativo.
     *
     * @return El área de trabajo del administrativo.
     */
    public String getArea() {
        return area;
    }

    /**
     * Método que retorna la experiencia previa del administrativo.
     *
     * @return La experiencia previa del administrativo.
     */
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    // Setters
    /**
     * Método que asigna el área del administrativo.
     *
     * @param area El área de trabajo del administrativo.
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Método que asigna la experiencia previa del administrativo.
     *
     * @param experienciaPrevia La experiencia previa del administrativo.
     */
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    // Métodos adicionales
    /**
     * Método que imprime los datos del usuario administrativo. Se sobreescribe
     * el método analizarUsuario de la clase Usuario.
     */
    @Override
    public void analizarUsuario() {
        System.out.println(super.toString());
        System.out.println(" Área: " + area);
        System.out.println(" Experiencia previa: " + experienciaPrevia);
    }

    /**
     * Método que retorna los datos del usuario administrativo.
     *
     * @return La información del administrativo.
     */
    @Override
    public String toString() {
        return " Administrativo{"
                + " Area='" + area + '\''
                + ", ExperienciaPrevia='" + experienciaPrevia + '\''
                + '}';
    }
}
