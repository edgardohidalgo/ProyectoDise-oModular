public class carritoCompras {
    public static String[] productosCarro= new String[10];
    public static double [] cantidades = new double[10];
    public static int contador = 0 ;
    public static void agregarCarro(String producto, double cantidad){
        if (contador < productosCarro.length) {
            productosCarro[contador] = producto;
            cantidades[contador] = cantidad;
            contador++;
        }
    }
    public static void  borrarCarrito(String producto){
        for (int i = 0; i < contador; i++){
            if (productosCarro[i].equalsIgnoreCase(producto)) {
                for (int j = 0; j< contador-1; j++) {
                         productosCarro[j] = productosCarro [j + 1];
                         cantidades [j] = cantidades[j + 1];
                }
                productosCarro[contador - 1] = null  ;
                cantidades[contador - 1]= 0 ;
                contador--;
                break ;
            }
        }
    }
    public static void finalizarCompra() {
        double total = 0;
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < contador; i++) {
            double precioUnitario = obtenerPrecio(productosCarro[i]);
            double subtotal = precioUnitario * cantidades[i];
            total += subtotal;
            System.out.println(productosCarro[i] + " x " + cantidades[i] + " = $" + subtotal);
        }
        System.out.println("Total a pagar: $" + total);
    }

    private static double obtenerPrecio(String producto) {
        for (int i = 0; i < main.hierba.length; i++) {
            if (main.hierba[i].equalsIgnoreCase(producto)) {
                return main.precio[i];
            }
        }
        return 0;
    }


}
