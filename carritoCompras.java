public class carritoCompras {
    public static String[] productos = new String[10];
    public static double [] cantidades = new double[10];
    public static int contador = 0 ;
    public static void agregarCarro(String producto, double cantidad){
        if (contador < productos.length) {
            productos[contador] = producto;
            cantidades[contador] = cantidad;
            contador++;
        }
    }
    public static void  borrarCarrito (String producto , double cantidad){

    }
}
