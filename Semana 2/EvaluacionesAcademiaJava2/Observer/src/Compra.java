import java.util.ArrayList;
import java.util.List;

//Creamos la clase Compra (Subject) que interpreta como el objeto observado
class Compra {

    //Creamos un arrayList, para ir creando la lista de observadores
    private List<Observer> observers = new ArrayList<>();

    // Creamos el metodo para agregar observadores
    public void agregarObservador(Observer observer) { observers.add(observer);  }

    // Creamos el metodo para eliminar observadores
    public void eliminarObservador(Observer observer) { System.out.println("Se desactivaron la notificaciones: ");
        observers.remove(observer);
    }

    // Creamos el metodo para notificar las compras a los observadores
    public void norificarObservador(String productoNombre, double precio) {
        for (Observer observer : observers) {
            observer.actualizar(productoNombre, precio);
        }
    }

    // Creamos un metodo, para simular una compra realizada
    public void compraRealizada(String productoNombre, double precio) {
        // En este metodo, se hace la  notificacion con la logica que se implementa
        norificarObservador(productoNombre, precio);
    }
}