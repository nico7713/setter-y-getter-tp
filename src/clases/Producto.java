package clases;

public class Producto {

    String nombre;
    double precio;
    int cantidad;
    
    public Producto(String nombre, double precio, int cantidad){
       this.nombre = nombre;
       this.precio = precio;
       this.cantidad = cantidad;
    }
    
    // Metodos setter y getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.out.println("El nombre no debe estar vacío.");
        } else {
            this.nombre = nombre;
        }
        
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("El precio no puede ser menor a cero.");
        } else {
            this.precio = precio;
        }
        
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 1){
            System.out.println("La cantidad tiene que ser de al menos 1.");
        } else {
            this.cantidad = cantidad;
        }
        
    }
       
}
