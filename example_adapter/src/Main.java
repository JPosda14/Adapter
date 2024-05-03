// Interfaz existente que queremos utilizar
interface Target {
    void request();
}

// Clase concreta que implementa la interfaz Target
class ConcreteTarget implements Target {
    public void request() {
        System.out.println("Método request de ConcreteTarget");
    }
}

// Interfaz objetivo que queremos adaptar
interface Adaptee {
    void specificRequest();
}

// Clase concreta que implementa la interfaz Adaptee
class ConcreteAdaptee implements Adaptee {
    public void specificRequest() {
        System.out.println("Método specificRequest de ConcreteAdaptee");
    }
}

// Adaptador que implementa la interfaz Target y utiliza la interfaz Adaptee
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase que implementa Adaptee
        Adaptee adaptee = new ConcreteAdaptee();

        // Creamos un objeto Adapter pasándole el objeto de Adaptee
        Target adapter = new Adapter(adaptee);

        // Llamamos al método request de Target (a través del Adapter)
        adapter.request();
    }
}

