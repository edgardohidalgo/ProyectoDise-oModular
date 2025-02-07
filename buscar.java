public class buscar {
    public static void buscarNombre(String nombre) {
        System.out.println("Resultados de búsqueda por nombre");
        nombre = nombre.toLowerCase();

        for (int i = 0; i < main.hierba.length; i++) {
            if (main.hierba[i].toLowerCase().contains(nombre)) {
                System.out.println("El precio es " + main.precio[i] + "   El origen es " + main.origen[i] + "   La hierba es " + main.hierba[i]);
            }
        }
    }

    public static void  buscarOrigen(String lugar){
        for(int i = 0 ; i < main.origen.length ; i++){
            if (main.origen[i].equalsIgnoreCase(lugar)){
                System.out.println("El precio es  " + main.precio[i] + "    El origen es " +   main.origen[i] + " La hierba es "+ main.hierba[i]);

            }

        }

    }

}
