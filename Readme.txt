Grupo 7

Integrantes participantes: Victor Leiton Jimenez


Requerimientos implementados: 

El sistema contara con un modulo de configuración para configurar terminales y usuarios.


Detalles de configuración:

El código fue desarrollado en el Ide de Apache NetBeans. No se necesita credenciales o características extras para correr el proyecto.


Documentación de las clases y métodos:

Modulo 1:

Estado: Desarrollado en su totalidad
Desarrollador: Victor Leiton Jimenez

Paquete Estructuras:

Clase ColaBus: Esta clase define la estructura utilizada para generar las colas de buses que tendrá cada terminal. Métodos: 


Encolar (Bus bus): Recibe como parámetro un bus y lo enlista en la cola, si es el primero que se encola, se establece como final y inicial.
Bus Desencolar (): Desencola el primer elemento de la cola y pone al frente el siguiente bus.
String Mostrar (): Muestra el contenido de la cola.


Clase NodoGenerico: Esta clase define la lógica y estructura de los nodos genéricos con los que contara la pilaConfiguración. Métodos:

setDato(): Establece el objeto que tendrá el nodo
setSiguiente (): Establece el nodo de siguiente en la pila de un nodo especifico
getDato(): Obtiene el objeto que tendrá el nodo
getSiguiente (): Obtiene el nodo de siguiente en la pila de un nodo especifico


Clase PilaConfiguracion: Esta clase define la lógica y estructura de las pilas genéricas que almacenaran terminales y usuarios. Métodos:

push (T newDato): Recibe un objeto y lo agrega a la pila dentro de un nodo.
T peek (): Obtiene el primer nodo de la pila y saca su información.
T pop (): Elimina el primer nodo de la pila.
Mostrar (): Muestra el contenido de los nodos de la pila.

Paquete Interfaces:

JFrame Form InterfazConfiguracion= Esta interfaz nos permite tener una vista grafica al querer agregar una terminal o usuario a sus respectivas pilas, igualmente, si queremos serializarlas en JSON. Métodos:

crearUsuario (): Obtiene los datos de los inputs del registro de usuario como nombre y contraseña. Con esos datos crea un objeto de tipo Usuario y realiza el push a la pila usuarios. Dicha información se envia a clase Configuración.

crearTerminal (): Obtiene los datos de los inputs del registro de terminal como nombre y cantidad de buses. Con esos datos crea un objeto de tipo Terminal y realiza el push a la pila terminal. Dicha información se envia a clase Configuración.

almacenarPilas (): Realiza la serialización de las pilas que están en memoria en formato JSON. Dicha información se envia a clase Configuración.


Paquete Serialización:

Clase Serilización:

serializarPila(PilaConfiguracion pilaTerminal,PilaConfiguracion pilaUsuarios, String archivo): Recibe como parámetros dos pilas y el nombre del archivo, crea un objeto de tipo de configuración que tiene estas dos pilas como atributos y lo serializa.

Configuracion desseralizarPila(String archivo): Retorna un objeto de tipo Configuración con sus atributos pilas, que nos permite acceder a la información de ambas.


Paquete Clases:

Clase Bus: Esta clase define la estructura de los buses y su comportamiento en las colas. Metodos:

setTipo(String tipo): Establece el tipo de bus.
String getTipo(): Obtiene el tipo del bus.
setSiguiente(Bus bus):Establece el bus siguiente de un bus en especifico.
getSiguiente():Obtiene el bus siguiente de un bus en especifico.


Clase configuración: Esta clase define los métodos para obtener las entradas de la interfaz de configuración para aplicar los métodos de las pilas y serializarlas. Métodos:

agregarNodoTerminal (Terminal nodo): Recibe un objeto terminal y hace push en la pila de tipo Terminal.

agregarNodoUsuario (Usuario nodo): Recibe un objeto usuario y hace push en la pila de tipo Usuario.


Serializar (): Convierte las pilas en memoria en archivo JSON

deserializar (): Un objeto de tipo configuración almacena el retorno del método de deserailzar de la clase serializar, después, con los getters se obtiene de ese objeto sus pilas.

 PilaConfiguracion<Terminal> getPilaTerminal(): Obtiene la pila de tipo Terminal de un objeto Configuración.

 PilaConfiguracion<Usuario> getPilaTerminal(): Obtiene la pila de tipo Usuario de un objeto Configuración.

Clase terminal: Esta clase define la estructura de las terminales. Metodos:


Terminal(String nombre,int cantidad):Este constructor, recibe como parámetros el nombre y la cantidad de buses. Crea una cola de buses ya que cada terminal tiene sus propias colas de buses. Encola los dos primeros buses como directo y preferencial y los démas por medio de un for hasta llegar a la cantidad son normales y se encolan.


String toString(): Muestra la información de la terminal y su cola, haciendo uso del método Mostrar de las colas.

Clase Usuario: Esta clase define la estructura de un usuario. Métodos:

getUsuario(): Se obtiene su nombre de usuario.
getPassword():Se obtiene su contraseña.
setUsuario(): Se establece su nombre de usuario.
setPassword():Se establece su contraseña.
String toString(): Muestra información del usuario.


