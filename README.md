# sprint-modulo-4

#CONTEXTO
En la última década, los índices de accidentabilidad en sectores como la industria, minería y construcción han aumentado, a pesar de las leyes que obligan a las empresas a proteger la salud de los trabajadores. Esto ha llevado a que muchas empresas deban contratar asesoría profesional para cumplir con las normativas, lo que implica altos costos. Las empresas que no invierten en estas medidas se enfrentan a multas, pérdidas de productividad y otros gastos asociados. En respuesta, un grupo de profesionales ha fundado una compañía de asesoría en prevención de riesgos laborales que busca ofrecer soluciones tecnológicas para gestionar la seguridad en el trabajo, garantizando el cumplimiento de la normativa, mejorando la productividad y reduciendo costos.

#PROBLEMA
La empresa enfrenta varios problemas debido a la falta de un sistema de información adecuado. No pueden administrar la gran cantidad de información generada ni controlar las actividades y el recurso humano de manera eficiente. La planificación de visitas es deficiente porque los profesionales suelen estar en terreno y no se les informa sobre sus actividades futuras. No hay un registro de la actividad de cada profesional ni se sabe dónde están en un momento dado
la falta de coordinación en las visitas a terreno ocasiona que a veces los trabajadores incorrectos asistan a las charlas o que no se coordine adecuadamente la capacitación, lo que lleva a multas. No se lleva un control adecuado de los clientes que pagan y los que no, lo que provoca que la empresa asuma costos, generando desbalances financieros. La documentación en carpetas físicas complica el seguimiento de las asesorías y la elaboración de resúmenes de resultados por empresa. Además, ciertas actividades de control de implementación de soluciones no se cumplen, lo que resulta en multas y una reducción en la calidad del servicio. Tampoco hay un registro completo de las actividades preventivas realizadas, lo que impide un seguimiento claro de los avances.

#SOLUCIÓN
Se propone desarrollar una solución tecnológica que mejore la gestión, control, seguridad y disponibilidad de información para la empresa y sus clientes. El sistema deberá permitir la planificación y control de actividades, gestión de clientes, y coordinación efectiva entre la empresa, los profesionales y los clientes para responder rápidamente a incidentes de seguridad. Además, deberá generar reportes y estadísticas que faciliten la toma de decisiones y optimicen el rendimiento de la empresa, considerando la carga laboral y la demanda de clientes. También será esencial mantener la comunicación con los profesionales, incluso en terreno y sin conectividad a internet, para que puedan realizar sus actividades sin interrupciones.


Este código Java define una clase Principal que ejecuta un programa interactivo de consola para gestionar usuarios, capacitaciones, accidentes, visitas en terreno, y revisiones. Aqui menciono su funcionamiento.

#Paquete y Librerías:

Importa InputMismatchException para manejar excepciones de entrada y Scanner para leer datos de la consola.

#Clase Principal:
La clase Principal contiene el método main, que es el punto de entrada del programa.
Método main:

Crea un objeto Contenedor que almacena usuarios, capacitaciones, etc.

Usa un Scanner para leer la entrada del usuario y maneja posibles excepciones de tipo de dato.

Muestra un menú con opciones, como almacenar usuarios, capacitaciones, listar datos, etc.

Ejecuta diferentes acciones basadas en la opción elegida por el usuario, usando un bucle do-while hasta que el usuario decide salir (opción 9).

#Métodos Auxiliares:

mostrarMenu: Muestra las opciones del menú al usuario.

obtenerOpcion: Lee y retorna la opción seleccionada por el usuario.

almacenarUsuario: Permite ingresar los datos de un usuario y almacenarlo en el contenedor. Dependiendo del tipo de usuario, se crean instancias de Cliente, Profesional o Administrativo.

almacenarCapacitacion: Recopila y almacena los datos de una capacitación.

listarUsuarios: Permite listar todos los usuarios o filtrarlos por tipo.

listarUsuariosPorTipo: Filtra y lista usuarios según el tipo (Cliente, Profesional, Administrativo).

almacenarAccidente: Permite registrar un accidente asociado a un cliente.

visitasATerreno: Registra una visita en terreno.

almacenarRevision: Almacena una revisión relacionada con una visita en terreno.

eliminarUsuario: Elimina un usuario del contenedor según su RUN.

Este código gestiona un sistema básico de almacenamiento y visualización de datos relacionados con usuarios, capacitaciones, accidentes, visitas en terreno y revisiones mediante una interfaz de consola.

#Plataforma Usada
El proyecto fue desarrollado utilizando Eclipse IDE
Los test fueron realizados on Junit 5

#Resumen del Sprint
Durante el sprint, nos enfocamos en implementar las funcionalidades principales del sistema que incluyen la planificación y control de actividades, la gestión de clientes, y la generación de reportes. Además, se trabajó en la integración de una solución para mantener la comunicación continua con los profesionales, incluso en zonas sin conectividad. El sprint también incluyó la revisión de seguridad y la optimización del sistema para asegurar que sea robusto y escalable.

El sistema fue testeado extensivamente para garantizar que cumple con los requerimientos del negocio, mejorando la eficiencia operativa y la capacidad de respuesta de la empresa ante incidentes de seguridad. El equipo colaboró estrechamente para asegurar que todas las metas del sprint fueran alcanzadas de manera efectiva, entregando un producto que está alineado con los objetivos estratégicos de la empresa.


Participantes: Claudio Anranguiz, Joshua Montt, Joeshep López, Lorena Suárez.

