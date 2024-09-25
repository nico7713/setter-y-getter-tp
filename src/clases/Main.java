package clases;

public class Main {
    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Xbox", 900000.0, 1);
        
        System.out.println("Producto original: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Cantidad: " + producto1.getCantidad());
        
        producto1.setNombre("Playstation");
        producto1.setPrecio(1100000.0); 
        producto1.setCantidad(2); 
        
        System.out.println("Nuevo producto: " + producto1.getNombre());
        System.out.println("Precio: " + producto1.getPrecio());
        System.out.println("Cantidad: " + producto1.getCantidad());
        
    }

}
