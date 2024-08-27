package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa.
 */
public class Principal {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;

            do {
                mostrarMenu();
                opcion = obtenerOpcion(scanner);

                switch (opcion) {
                    case 1 ->
                        almacenarUsuario(contenedor, scanner);
                    case 2 ->
                        almacenarCapacitacion(contenedor, scanner);
                    case 3 ->
                        listarUsuarios(contenedor, scanner);
                    case 4 ->
                        contenedor.listarCapacitaciones();
                    case 5 ->
                        almacenarAccidente(contenedor, scanner);
                    case 6 ->
                        visitasATerreno(contenedor, scanner);
                    case 7 ->
                        almacenarRevision(contenedor, scanner);
                    case 8 ->
                        eliminarUsuario(contenedor, scanner);
                    case 9 ->
                        System.out.println(" Saliendo del programa...");
                    default ->
                        System.out.println(" Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 9);
        } catch (InputMismatchException e) {
            System.out.println(" Error: Entrada inválida. Por favor, ingrese un número.");
        }
    }

    /**
     * Muestra el menú principal de opciones al usuario.
     */
    static void mostrarMenu() {
        System.out.println(" ");
        System.out.println(" Menú Principal:");
        System.out.println("1. Almacenar Usuario");
        System.out.println("2. Almacenar Capacitación");
        System.out.println("3. Listar Usuario");
        System.out.println("4. Listar Capacitación");
        System.out.println("5. Almacenar Accidente");
        System.out.println("6. Visitas a Terreno");
        System.out.println("7. Almacenar Revisión");
        System.out.println("8. Eliminar Usuario");
        System.out.println("9. Salir");
        System.out.println(" ");
        System.out.print(" Seleccione una opción: ");
    }

    /**
     * Obtiene la opción seleccionada por el usuario.
     *
     * @param scanner Objeto Scanner para la entrada de datos.
     * @return La opción seleccionada.
     */
    private static int obtenerOpcion(Scanner scanner) {
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    /**
     * Almacena un nuevo usuario en el contenedor.
     *
     * @param contenedor Objeto Contenedor donde se almacenará el usuario.
     * @param scanner Objeto Scanner para la entrada de datos.
     */
    private static void almacenarUsuario(Contenedor contenedor, Scanner scanner) {
        System.out.print(" Ingrese el RUN del usuario: ");
        int run = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        System.out.print(" Ingrese el nombre del usuario (nickname profesional): ");
        String nombre = scanner.nextLine();

        System.out.print(" Ingrese la fecha de nacimiento del usuario (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, fechaNacimiento, run);
        contenedor.almacenarUsuario(usuario);
        System.out.println(" ");
        System.out.println(" Seleccione el tipo de usuario:");
        System.out.println(" ");
        System.out.println(" 1. Cliente");
        System.out.println(" 2. Profesional");
        System.out.println(" 3. Administrativo");
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine();

        switch (tipoUsuario) {
            case 1 -> {
                Cliente cliente = new Cliente(usuario);
                System.out.print("Ingrese el RUT del cliente: ");
                cliente.setRut(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Ingrese los nombres del cliente: ");
                cliente.setNombres(scanner.nextLine());
                System.out.print("Ingrese los apellidos del cliente: ");
                cliente.setApellidos(scanner.nextLine());
                System.out.println("Ingrese el número de teléfono: ");
                cliente.setTelefono(scanner.nextLine());
                System.out.print("Ingrese la AFP del cliente: ");
                cliente.setAfp(scanner.nextLine());
                System.out.print("Ingrese el sistema de salud del cliente (1: Fonasa, 2: Isapre): ");
                cliente.setSistemaSalud(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Ingrese la dirección del cliente: ");
                cliente.setDireccion(scanner.nextLine());
                System.out.print("Ingrese la comuna del cliente: ");
                cliente.setComuna(scanner.nextLine());
                System.out.print("Ingrese la edad del cliente: ");
                cliente.setEdad(scanner.nextInt());
                contenedor.almacenarCliente(cliente);
            }
            case 2 -> {
                System.out.print("Ingrese el título del profesional: ");
                String titulo = scanner.nextLine();
                System.out.print("Ingrese la fecha de ingreso del profesional (DD/MM/AAAA) : ");
                String fechaIngreso = scanner.nextLine();
                Profesional profesional = new Profesional(usuario, titulo, fechaIngreso);
                contenedor.almacenarProfesional(profesional);
            }
            case 3 -> {
                System.out.print("Ingrese el área del administrativo: ");
                String area = scanner.nextLine();
                System.out.print("Ingrese la experiencia previa del administrativo: ");
                String experienciaPrevia = scanner.nextLine();
                Administrativo administrativo = new Administrativo(usuario, area, experienciaPrevia);
                contenedor.almacenarAdministrativo(administrativo);
            }
            default ->
                System.out.println("Opción no válida.");
        }
    }

    /**
     * Método que permite almacenar una capacitación en el contenedor.
     *
     * @param contenedor
     * @param scanner
     */
    private static void almacenarCapacitacion(Contenedor contenedor, Scanner scanner) {
        Capacitacion capacitacion = new Capacitacion();
        System.out.print("Ingrese el ID de la capacitación: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        capacitacion.setIdentificador(scanner.nextInt());
        scanner.nextLine();  // Consumir el salto de línea restante

        System.out.print("Ingrese el nombre de la capacitación: ");
        capacitacion.setNombre(scanner.nextLine());

        System.out.print("Ingrese el Rut del Cliente: ");
        capacitacion.setRutCliente(scanner.nextLine());

        System.out.print("Ingrese el día de la capacitación (DD/MM/AAAA): ");
        capacitacion.setDia(scanner.nextLine());

        System.out.print("Ingrese la hora de la capacitación: ");
        capacitacion.setHora(scanner.nextLine());

        System.out.print("Ingrese la duración de la capacitación: ");
        capacitacion.setDuracion(scanner.nextLine());

        System.out.print("Ingrese el lugar de la capacitación: ");
        capacitacion.setLugar(scanner.nextLine());

        System.out.print("Ingrese la cantidad de asistentes: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        capacitacion.setCantidadAsistentes(scanner.nextInt());
        scanner.nextLine();  // Consumir el salto de línea restante

        contenedor.almacenarCapacitacion(capacitacion);
    }

    /**
     * Método que permite listar los usuarios almacenados en el contenedor.
     *
     * @param contenedor
     * @param scanner
     */
    private static void listarUsuarios(Contenedor contenedor, Scanner scanner) {
        System.out.println("1. Listar todos los usuarios");
        System.out.println("2. Listar usuarios por tipo");
        System.out.print("Seleccione una opción: ");
        int opcion = obtenerOpcion(scanner);

        switch (opcion) {
            case 1 ->
                contenedor.listarUsuarios();
            case 2 ->
                listarUsuariosPorTipo(contenedor, scanner);
            default ->
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    /**
     * Método que permite listar los usuarios almacenados en el contenedor por
     * tipo.
     *
     * @param contenedor
     * @param scanner
     */
    private static void listarUsuariosPorTipo(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese el tipo de usuario (Cliente, Profesional, Administrativo): ");
        String tipo = scanner.nextLine();
        if (tipo.equalsIgnoreCase("Cliente")) {
            contenedor.listarUsuariosPorTipo(Cliente.class);
        } else if (tipo.equalsIgnoreCase("Profesional")) {
            contenedor.listarUsuariosPorTipo(Profesional.class);
        } else if (tipo.equalsIgnoreCase("Administrativo")) {
            contenedor.listarUsuariosPorTipo(Administrativo.class);
        } else {
            System.out.println("Tipo de usuario no válido.");
        }
    }

    /**
     * Método que permite almacenar un accidente en el contenedor.
     *
     * @param contenedor
     * @param scanner
     */
    private static void almacenarAccidente(Contenedor contenedor, Scanner scanner) {
        System.out.println("Ingrese los datos del accidente:");
        System.out.print("ID del accidente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("RUN del cliente: ");
        int runCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Fecha (dd/MM/yyyy): ");
        String fecha = scanner.nextLine();
        System.out.print("Hora (HH:mm): ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Origen: ");
        String origen = scanner.nextLine();
        System.out.print("Consecuencias: ");
        String consecuencias = scanner.nextLine();

        Accidente accidente = new Accidente(id, runCliente, fecha, hora, lugar, origen, consecuencias);
        contenedor.almacenarAccidente(accidente);
        System.out.println("Accidente almacenado exitosamente.");
    }

    /**
     * Método que permite almacenar una visita en terreno en el contenedor.
     *
     * @param contenedor
     * @param scanner
     */
    private static void visitasATerreno(Contenedor contenedor, Scanner scanner) {
        System.out.println("Ingrese los datos de la visita en terreno:");
        System.out.print("ID de la visita: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("RUN del cliente: ");
        int runCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Fecha (dd/MM/yyyy): ");
        String fecha = scanner.nextLine();
        System.out.print("Hora (HH:mm): ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Comentarios: ");
        String comentarios = scanner.nextLine();

        VisitaEnTerreno visita = new VisitaEnTerreno(id, runCliente, fecha, hora, lugar, comentarios);
        contenedor.almacenarVisitaEnTerreno(visita);
        System.out.println("Visita en terreno almacenada exitosamente.");
    }

    /**
     * Método que permite almacenar una revisión en el contenedor.
     *
     * @param contenedor
     * @param scanner
     */
    private static void almacenarRevision(Contenedor contenedor, Scanner scanner) {
        System.out.println("Ingrese los datos de la revisión:");
        System.out.print("ID de la revisión: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("ID de la visita en terreno: ");
        int idVisita = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Nombre del revisor: ");
        String nombreRevisor = scanner.nextLine();
        System.out.print("Detalle: ");
        String detalle = scanner.nextLine();
        System.out.print("Estado (1: Aprobado, 2: No Aprobado, 3: Sin Observaciones): ");
        int estado = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Revision revision = new Revision(id, idVisita, nombreRevisor, detalle, estado);
        contenedor.almacenarRevision(revision);
        System.out.println("Revisión almacenada exitosamente.");
    }

    /**
     * Método que permite eliminar un usuario del contenedor.
     *
     * @param contenedor
     * @param scanner
     */
    private static void eliminarUsuario(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese el RUN del usuario a eliminar: ");
        int run = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        contenedor.eliminarUsuario(run);
    }
}
