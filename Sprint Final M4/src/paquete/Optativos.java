package paquete;

public interface Optativos {

	  /**
     * Elimina un cliente basado en su RUN.
     *
     * @param run El RUN del cliente a eliminar.
     */
    void eliminarCliente(int run);

    /**
     * Elimina un profesional basado en su RUN.
     *
     * @param run El RUN del profesional a eliminar.
     */
    void eliminarProfesional(int run);

    /**
     * Elimina un administrativo basado en su RUN.
     *
     * @param run El RUN del administrativo a eliminar.
     */
    void eliminarAdministrativo(int run);

    /**
     * Elimina una capacitación basada en su identificador.
     *
     * @param identificador El identificador de la capacitación a eliminar.
     */
    void eliminarCapacitacion(int identificador);

    /**
     * Elimina un accidente basado en su identificador.
     *
     * @param identificador El identificador del accidente a eliminar.
     */
    void eliminarAccidente(int identificador);

    /**
     * Elimina una visita en terreno basada en su identificador.
     *
     * @param identificador El identificador de la visita en terreno a eliminar.
     */
    void eliminarVisitaEnTerreno(int identificador);

    /**
     * Elimina una revisión basada en su identificador.
     *
     * @param identificador El identificador de la revisión a eliminar.
     */
    void eliminarRevision(int identificador);

    /**
     * Lista todos los usuarios.
     */
    void listarUsuarios();

    /**
     * Lista todos los clientes.
     */
    void listarClientes();

    /**
     * Lista todos los profesionales.
     */
    void listarProfesionales();

    /**
     * Lista todos los administrativos.
     */
    void listarAdministrativos();

    /**
     * Lista todas las capacitaciones.
     */
    void listarCapacitaciones();

    /**
     * Lista todos los accidentes.
     */
    void listarAccidentes();

    /**
     * Lista todas las visitas en terreno.
     */
    void listarVisitasEnTerreno();

    /**
     * Lista todas las revisiones.
     */
    void listarRevisiones();

    /**
     * Lista los usuarios basados en su RUN.
     *
     * @param run El RUN del usuario a listar.
     */
    void listarUsuarios(int run);

    /**
     * Lista los clientes basados en su RUN.
     *
     * @param run El RUN del cliente a listar.
     */
    void listarClientes(int run);

    /**
     * Lista los profesionales basados en su RUN.
     *
     * @param run El RUN del profesional a listar.
     */
    void listarProfesionales(int run);

    /**
     * Lista los administrativos basados en su RUN.
     *
     * @param run El RUN del administrativo a listar.
     */
    void listarAdministrativos(int run);

    /**
     * Lista las capacitaciones basadas en su identificador.
     *
     * @param identificador El identificador de la capacitación a listar.
     */
    void listarCapacitaciones(int identificador);

    /**
     * Lista los accidentes basados en su identificador.
     *
     * @param identificador El identificador del accidente a listar.
     */
    void listarAccidentes(int identificador);

    /**
     * Lista las visitas en terreno basadas en su identificador.
     *
     * @param identificador El identificador de la visita en terreno a listar.
     */
    void listarVisitasEnTerreno(int identificador);

    /**
     * Lista las revisiones basadas en su identificador.
     *
     * @param identificador El identificador de la revisión a listar.
     */
    void listarRevisiones(int identificador);

    /**
     * Lista los usuarios basados en su tipo.
     *
     * @param tipo El tipo de usuario a listar.
     */
    void listarUsuariosPorTipo(Class<?> tipo);

    /**
     * Lista los clientes basados en su tipo.
     *
     * @param tipo El tipo de cliente a listar.
     */
    void listarClientesPorTipo(Class<?> tipo);
}
