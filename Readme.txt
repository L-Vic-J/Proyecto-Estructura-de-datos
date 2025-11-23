Avance 2:

Integrantes participantes: Victor Leiton Jimenez, Joseph Cardoza Valdelomar, David Carmona Solórzano, Emmanuell Siles Loaiza, Emanuel Silva Sánchez.

Requerimientos implementados: 

El sistema contara con un módulo de creación de tiquetes.
El sistema contara con un módulo de atención de tiquetes.
El sistema contara con un módulo de llenado de colas.

Requerimientos pendientes:

El sistema contara con un módulo de búsqueda en grafos.
El sistema contara con un módulo de tipo de cambio con el BCR.

Detalles de configuración:

El código fue desarrollado en el IDE de Apache NetBeans. No se necesita credenciales o características extras para correr el proyecto.

Documentación de las clases y métodos:

Modulo 1.1:

Clase Tiquete:

Esta clase define la estructura del objeto tiquete, con sus atributos y métodos.
Métodos:

public Tiquetes (): Constructor del objeto para inicializar sus atributos.
public Tiquetes getSiguiente(): Retorna el tiquete siguiente en la cola.
public void setSiguiente(Tiquetes siguiente): Establece como siguiente algún tiquete.
public String getNombre(): Retorna el nombre del cliente que lo compró .
public void setNombre(String nombre):Establece el nombre del cliente que lo compró.
public int getId(): Retorna el ID del tiquete, esto se incrementa con una variable de la clase cada vez que alguien compra algún tiquete.
public String getTerminal() : Retorna el nombre de la terminal.
public String getPrioridad(): Retorna la prioridad.
public double getPrecio():Retorna el precio del tiquete.
 public void setId(int id): Establece el ID del tiquete.
public int getEdad() : Retorna la edad del cliente que lo compró.
public void setEdad(int edad): Establece la edad del cliente que lo compró. 
public String getHoraCompra():Retorna la hora de compra.
public void setHoraCompra(String horaCompra): Establece la hora de compra.
public void setPrioridad(String prioridad): Establece la prioridad ya sea preferencial, directo o alta. 
public void setPrecio(double precio):Establece el precio del tiquete después de la conversión a dólares.
public void setEstado(String estado) : Establece el estado del tiquete, ya sea atendido o pendiente.
public String getHoraAbordaje(): Retorna la hora de abordaje.
public void setHoraAbordaje(String horaAbordaje): Establece la hora de abordaje.
public String getServicio(): Retorna el tipo de servicio.
public void setServicio(String servicio): Establece el servicio:
public void setTerminal(String terminalpublic): Establece la terminal.
String getTipoBus() : Retorna el tipo de bus.
public void setTipoBus(String tipoBus): Establece el tipo de bus.





Clase cola de prioridades:

Esta clase define la estructura y el comportamiento de la cola de tiquetes.

 public ColaPrioridades (): Constructor para inicializar los atributos de la cola.
 public void Encolar (Tiquetes nuevo): Este método recibe como parámetro un tiquete nuevo y      recorre la cola para ponerlo en su posición correspondiente dependiendo de su prioridad.
 public void Desencolar (): Saca el primero de la cola.
public String Mostrar(): Muestra el contenido de la cola.


Clase serialización cola:

Esta clase sirve para serializar en un archivo JSON la cola de tiquetes actual.
public void serializarPila(ColaPrioridades tiqueteAlmacenados, String archivo): Recibe como parametros la cola y el nombre del archivo a serializar.
public GestorDeCompras desseralizarPila(String archivo): Deserializa la cola de tiquetes pendiente de atender y lo retorna como un objeto de GestorDeCompras.

Clase GestorDeCompras:

Esta clase hace la función de administrar todo el proceso de atención, desde la acción de encolar un tiquete a la cola hasta enviarlo a la cola de atención para abordar e incluso serializar.

Métodos:

public GestorDeCompras(GestorDeAtencion gestorAtencion): Constructor de la clase, usa como parámetro el GestorDeAtencion que se inicializa de manera única en el menú para que compartan una misma intancia.
public GestorDeCompras(ColaPrioridades colaTiquetes): Constructor que inicializa la instancia con una cola de prioridades.
public void agregarTiquete (Tiquetes tiquete): Este método recibe como parámetro un tiquete y lo encola en la cola de tiquetes.
public void Serializar (): Este método serializa la cola de tiquetes que se inicializo usando el método de serializar de la clase Serializar.
public void enviarTiquete (Tiquetes tiquete): Este método se encarga de que cada vez que se compre un tiquete este se envié la cola vacía para abordar el bus haciendo uso el método encolarEnBus del objeto gestorAtencion.

Interfaz de compra de tiquetes:

Esta interfaz grafica facilita el proceso de la compra de tiquetes, permitiéndole al cliente ingresar su nombre, servicio, el tipo de bus, la terminal, la edad, y la carga de su equipaje.

Métodos:
public InterfazCompraTiquetes(Menu menu, GestorDeAtencion gestorAtencion): El constructor de la clase, la cual tiene como parámetros la interfaz menú para poder volver al mismo y el gestorAtencion, que como se menciono previamente, es una sola instancia que se comparte a través del proceso. En el también se crea una nueva instancia de gestorDeCompras con el gestorAtencion como parámetro para poder usar su método de enviar tiquete a la cola del bus seleccionado. Por otra parte, se crea un objeto de tipo Configuracion que almacena la deserialización del archivo JSON de configuración, una lista estática almacenara la pila de terminales del objeto tipo Configuracion, esta lista se usara para que, por medio de un for, se recorra y se pueda sacar los nombres de las terminales y ponerlas en el combo box de terminales de la interfaz.

public void comprarTiquete():  Este método se encarga de crear el nuevo tiquete comprado desde la interfaz. Por medio de variables se almacena los datos de los inputs de la interfaz y también validarlos. Al final, por medio de la instancia gestorDeCompras, se usa el método enviarTiquete para encolarlo al bus y agregarTiquete para encolarlo a la cola de prioridades de tiquetes.

public void CalcularMonto (String servicio, String tipoBus): Este método calcula el monto en dólares dependiendo del servicio y la carga que lleve el cliente.
public void limpiar(): Este método limpia las entradas cuando se compra el tiquete dejándolas listas para otra compra.
Modulo 1.2:

Clase GestorDeAtencion:
Esta clase es la administradora del proceso de atención de clientes. Sus atributos principales son un objeto de tipo Configuracion y una pila de tipo Terminal.
public GestorDeAtencion (): Es el constructor, se carga el objeto de tipo Configuracion con el objeto de tipo Configuracion que retorna el método deserializar. Por otro lado, la pila de terminales se le carga la pila de terminales del objeto Configuracion. Esto permite traer desde el JSON la estructura ya almacenada y cargarla en memoria para su manipulación.

Métodos:
public void encolarEnBus(Tiquetes tiquete):  Este método recibe como parámetro un tiquete recién comprado, le extrae sus atributos de nombre de la terminal y el tipo de bus, seguido a eso, se crea un nodo genérico de tipo Terminal que apuntara al nodo que retorna el método de buscarDato propio de la pila. Para finalizar, se crea un objeto ColaBus que apuntara a la cola de buses de la terminal y un objeto de tipo Bus, este apunta al bus en específico de esa terminal según y se le encola el tiquete.
public Bus[] cargarBuses(String nombreTerminal): Este método se encarga de retornar una lista estática de los buses de la terminal seleccionada en la interfazSeleccion, esta lista se usa solo para cargar dichos buses como opciones en el combo box para poder elegir a que bus se le atenderá los tiquetes de su cola.

Clase SerializacionAtendidos:

public void serializarTiquete(Tiquetes tiquete, String archivo): Este método es en el encargado de serializar cada tiquete atendido.

InterfazSeleccion: 

Esta interfaz permite al usuario elegir una terminal en específico a la que le quiere atender las colas de sus buses.
Métodos:
public InterfazSeleccion (Menu menu, GestorDeAtencion gestorDeAtencion): El constructor usa como parámetros un objeto Menu para poder volver al mismo y el gestorDeAtencion compartido. También, en el, se deserializa el archivo de configuración para almacenar el nombre de las terminales en una lista estática, la cual se recorrerá con un for para cargar el nombre de las terminales en el combo box que permitirá al usuario elegir la terminal deseada.
 private void buttonAtenderActionPerformed(java.awt.event.ActionEvent evt): La acción del boton guarda el nombre de la terminal en un String, abre la InterfazAtencion, la cual sus parámetros son un objeto de tipo Menu, la variable con el nombre de la terminal, y el gestorAtencion compartido. Par finalizar oculta la interfaz y hace visible InterfazAtencion.

InterfazAtencion:
Una vez elegida la terminal en InterfazSeleccion, esta interfaz compuesta por un combo box para elegir el bus y una tabla, permite al usuario gestionar la cola cada bus de esa terminal.

public InterfazAtencion(Menu menu, String nombreTerminal, GestorDeAtencion gestorDeAtencion): El constructor de la clase, en el se apunta a la terminales de gestorDeAtencion por medio de una variable de tipo pila terminal. También, se crea el modelo de la tabla. 

public void cargarBuses(String nombre): Este método por medio de una lista estática almacena los buses para colocarlos en el combo box como opciones.

public DefaultTableModel cargarTiquetes(): Este método carga los tiquetes del bus elegido en el combox a la tabla, estos se cargan en el orden en que se compraron.

public void Abordar (): Este método se hace cargo de buscar el tiquete especifico por medio de su ID, desencolarlo de la cola y además de serializarlo en el JSON de atendidos. En este proceso al tiquete se le pone la hora de abordaje.

private void tablaTiquetesMousePressed(java.awt.event.MouseEvent evt): Este evento permite que podamos elegir el tiquete al hacerle click en la tabla y establecerlo en un label que esta oculto, el contenido ese label que es el ID del tiquete es el ID que se usa Abordar.

Modulo 1.3:

Clase ColaParaListadeBuses

La clase ColaParaListadeBuses implementa una estructura de datos tipo cola para gestionar tiquetes asignados a buses dentro de una terminal. Utiliza nodos genéricos (NodoGenerico) que encapsulan objetos de tipo Tiquetes, permitiendo una gestión ordenada

public ColaParaListadeBuses() : Constructor que inicializa la cola vacía, con frente y fin en null, y cantidad en 0.

public void encolar (Tiquetes t): Agrega un nuevo tiquete al final de la cola. Si la cola está vacía, el nuevo nodo se convierte en el frente y el fin. Si no, se enlaza al final.

public int getCantidad(): Retorna la cantidad actual de tiquetes en la cola.

public void setCantidad(int cantidad): Permite establecer manualmente la cantidad de elementos (uso interno o en pruebas).

public NodoGenerico getFrente(): Retorna el nodo que está al frente de la cola.

public void setFrente(NodoGenerico frente): Establece el nodo que estará al frente de la cola.

public NodoGenerico getFin(): Retorna el nodo que está al final de la cola.

public void setFin(NodoGenerico fin): Establece el nodo que estará al final de la cola.

Clase ListaDeBuses

La clase ListaDeBuses implementa una lista enlazada simple de objetos tipo Bus, encapsulados en nodos de tipo Nodobus. Su propósito principal es organizar y recorrer los buses disponibles en una terminal, permitiendo además identificar el bus con menor carga de tiquetes en su cola.

public ListaDeBuses(): Constructor que inicializa la lista vacía, estableciendo inicio en null.

public void agregarBus(Bus b) : Agrega un nuevo bus al final de la lista. Si la lista está vacía, el nuevo nodo se convierte en el inicio. Si no, se recorre hasta el último nodo y se enlaza el nuevo bus.

public Bus buscarBusConMenorFila(): Busca el bus de tipo "NORMAL" con la menor cantidad de tiquetes en su cola (colaParaListadeBuses). Recorre la lista y compara las cantidades para retornar el más liviano.

public void setInicio(Nodobus inicio) :Permite establecer manualmente el nodo inicial de la lista.

Nodobus: Nodo que encapsula un objeto Bus y referencia al siguiente nodo.

Bus: Clase que representa un bus, incluyendo su tipo y su cola de tiquetes (colaParaListadeBuses).

