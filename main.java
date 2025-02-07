public class main {
    public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
    public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
    public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };
    // Variables publicas extra que considereis
    public static void main(String[] args) {
        String nombre, lugar;
        double cantidad;
        System.out.println("Buenos dias! Que quieres hacer hoy?");
        System.out.println();
        System.out.println("Usuario selecciona buscar por nombre");

        nombre = "Juana";
        buscar.buscarNombre(nombre);
        System.out.println();

        // Codigo para buscar por nombre
        System.out.println();
        System.out.println("Usuario selecciona buscar por origen");
        lugar = "Andorra";
        buscar.buscarOrigen(lugar);
        System.out.println();

        System.out.println("Ordenando productos por precio de menor a mayor:");
        ordenar.ordenar(true);

        System.out.println("Ordenando productos por precio de mayor a menor:");
        System.out.println();

        ordenar.ordenar(false);
        // Codigo para ordenar de mayor a menor precio
        System.out.println("Usuario selecciona varios productos para comprar");
        nombre = "Hierba de los bosques";
        cantidad = 3;
        carritoCompras.agregarCarro(nombre , cantidad);
        System.out.println();

        // Codigo para seleccionar segundo producto
        nombre = "El oro verde";
        cantidad = 1;
        carritoCompras.agregarCarro(nombre , cantidad);
        System.out.println();

       // Codigo para seleccionar tercer producto
        nombre = "La seta feliz";
        cantidad = 2.5;
        carritoCompras.agregarCarro(nombre , cantidad);
        System.out.println();

        System.out.println("Usuario elimina el segundo elemento de su carrito");
        // Codigo para eliminar elemento del carrito

        System.out.println();

        carritoCompras.borrarCarrito("EL ORO VERDE");
        System.out.println("Usuario finaliza la compra");
        carritoCompras.finalizarCompra();
       // Codigo para finalizar la compra y que salga el total de la compra
    }
}//Funciones extra que considereis necesarias