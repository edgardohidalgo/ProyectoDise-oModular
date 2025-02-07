public class ordenar {
    public static void ordenar(boolean ascendente) {
        int n = main.precio.length;  // n es 4 si hay 4 elementos
        for (int i = 0; i < n; i++) {  // recorrerá de i = 0 hasta i = n
            for (int j = 0; j < n - i - 1; j++) {  // bucle para hacer comparaciones
                if ((ascendente && main.precio[j] > main.precio[j + 1]) ||
                        (!ascendente && main.precio[j] < main.precio[j + 1])) {

                    double tempPrecio = main.precio[j];
                    main.precio[j] = main.precio[j + 1];
                    main.precio[j + 1] = tempPrecio;

                    String tempHierba = main.hierba[j];
                    main.hierba[j] = main.hierba[j + 1];
                    main.hierba[j + 1] = tempHierba;

                    String tempOrigen = main.origen[j];
                    main.origen[j] = main.origen[j + 1];
                    main.origen[j + 1] = tempOrigen;
                }
            }
        }
        if (ascendente) {
            System.out.println("Productos ordenados por precio ascendente:");
        } else {
            System.out.println("Productos ordenados por precio descendente:");
        }

        for (int i = 0; i < n; i++) {
            System.out.println(main.hierba[i] + " - " + main.origen[i] + " - $" + main.precio[i]);
        }
    }

}
