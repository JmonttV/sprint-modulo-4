package paquete;

/**
 * Interfaz para gestionar operaciones de eliminación y listado de diferentes
 * entidades. Estas no estaban en el requerimiento del ejercicio, pero se
 * agregaron para cumplir con el principio de segregación de interfaces.
 */
public interface Optativos {

    void listarUsuariosPorTipo(Class<?> tipo, int run);

    void listarClientesPorTipo(Class<?> tipo, int run);

    void listarProfesionalesPorTipo(Class<?> tipo, int run);

    void listarAdministrativosPorTipo(Class<?> tipo, int run);

    void listarCapacitacionesPorTipo(Class<?> tipo, int identificador);

    void listarAccidentesPorTipo(Class<?> tipo, int identificador);

    void listarVisitasEnTerrenoPorTipo(Class<?> tipo, int identificador);

    void listarRevisionesPorTipo(Class<?> tipo, int identificador);

    void eliminarUsuario(int run);

    void eliminarCliente(int run);

    void eliminarProfesional(int run);

    void eliminarAdministrativo(int run);

    void eliminarCapacitacion(int identificador);

    void eliminarAccidente(int identificador);

    void eliminarVisitaEnTerreno(int identificador);

    void eliminarRevision(int identificador);

    void listarUsuarios();

    void listarClientes();

    void listarProfesionales();
}
