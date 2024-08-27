package paquete;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contenedor de asesorías y capacitaciones. Esta clase
 * permite almacenar y gestionar diferentes tipos de asesorías, capacitaciones,
 * accidentes, visitas en terreno y revisiones.
 */
public class Contenedor {

    private final List<Asesoria> asesorías;
    private final List<Capacitacion> capacitaciones;
    private final List<Accidente> accidentes;
    private final List<VisitaEnTerreno> visitasEnTerreno;
    private final List<Revision> revisiones;

    /**
     * Constructor que inicializa las listas de asesorías, capacitaciones,
     * accidentes, visitas en terreno y revisiones.
     */
    public Contenedor() {
        this.asesorías = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
        this.accidentes = new ArrayList<>();
        this.visitasEnTerreno = new ArrayList<>();
        this.revisiones = new ArrayList<>();
    }

    /**
     * Almacena un usuario en la lista de asesorías.
     *
     * @param usuario El usuario a almacenar.
     */
    public void almacenarUsuario(Usuario usuario) {
        asesorías.add(usuario);
    }

    /**
     * Almacena un cliente en la lista de asesorías.
     *
     * @param cliente El cliente a almacenar.
     */
    public void almacenarCliente(Cliente cliente) {
        asesorías.add(cliente);
    }

    /**
     * Almacena un profesional en la lista de asesorías.
     *
     * @param profesional El profesional a almacenar.
     */
    public void almacenarProfesional(Profesional profesional) {
        asesorías.add(profesional);
    }

    /**
     * Almacena un administrativo en la lista de asesorías.
     *
     * @param administrativo El administrativo a almacenar.
     */
    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorías.add(administrativo);
    }

    /**
     * Almacena una capacitación en la lista de capacitaciones.
     *
     * @param capacitación La capacitación a almacenar.
     */
    public void almacenarCapacitacion(Capacitacion capacitación) {
        capacitaciones.add(capacitación);
    }

    /**
     * Almacena un accidente en la lista de accidentes.
     *
     * @param accidente El accidente a almacenar.
     */
    public void almacenarAccidente(Accidente accidente) {
        accidentes.add(accidente);
        System.out.println("Accidente almacenado: " + accidente);
    }

    /**
     * Almacena una visita en terreno en la lista de visitas en terreno.
     *
     * @param visita La visita en terreno a almacenar.
     */
    public void almacenarVisitaEnTerreno(VisitaEnTerreno visita) {
        visitasEnTerreno.add(visita);
        System.out.println("Visita en terreno almacenada: " + visita);
    }

    /**
     * Almacena una revisión en la lista de revisiones.
     *
     * @param revision La revisión a almacenar.
     */
    public void almacenarRevision(Revision revision) {
        revisiones.add(revision);
        System.out.println("Revisión almacenada: " + revision);
    }

    /**
     * Elimina un usuario de la lista de asesorías.
     *
     * @param run El RUN del usuario a eliminar.
     */
    public void eliminarUsuario(int run) {
        asesorías.removeIf(asesoria -> {
            if (asesoria instanceof Usuario usuario) {
                return usuario.getRUN() == run;
            }
            return false;
        });
    }

    /**
     * Lista los usuarios almacenados en la lista de asesorías.
     */
    public void listarUsuarios() {
        for (Asesoria asesoria : asesorías) {
            if (asesoria instanceof Usuario) {
                System.out.println(asesoria);
            }
        }
    }

    /**
     * Lista los usuarios almacenados en la lista de asesorías que sean del tipo
     * especificado.
     *
     * @param tipo El tipo de usuario a listar.
     */
    public void listarUsuariosPorTipo(Class<?> tipo) {
        for (Asesoria asesoria : asesorías) {
            if (tipo.isInstance(asesoria)) {
                System.out.println(asesoria);
            }
        }
    }

    /**
     * Lista los clientes almacenados en la lista de asesorías.
     */
    public void listarCapacitaciones() {
        for (Capacitacion capacitación : capacitaciones) {
            System.out.println(capacitación);
        }
    }
}
