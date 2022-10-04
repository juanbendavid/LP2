package VentasTotales;

public class mainVentas {

    public static void VentasVendedor(Nota arreglo[][], int totalVendedor[], int totalProducto[]) {
        System.out.printf("%34s %15s %15s %15s %15s", "Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4 ", "Total\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%15s %d", "Producto", i+1);
            for (int j = 0; j < 4; j++) {
                Nota nota;
                nota = arreglo[i][j];
                System.out.printf("%15d",nota.total);
                
            }
            System.out.printf("%18d", totalProducto[i]);
            System.out.println("");
        }
        System.out.printf("%15s", "Total");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%16d", totalVendedor[i]);

        }
        System.out.println("");

    }

    public static void main(String[] args) {
        // Procesamiento de ventas del mes anterior
        
        Nota arreglo[][] = new Nota[5][4];
        int [] totalProducto = new int [5];
        int [] totalVendedor = new int [4];

        int vendedor = 1;

        for (int i = 0; i<4; i++){
            int idProducto = 1;
            for (int j = 0; j < 5; j++) {
                int total = (int)(Math.random()*10+1); // generamos una  suma de venta total para el dia
                // agregamos la nota del dia al arreglo
                arreglo[j][i] = new Nota(1, 1,total);

                totalVendedor[i]+=total;
                totalProducto[j]+=total;

                idProducto++;
            }
            vendedor++;
        }

        VentasVendedor(arreglo, totalVendedor, totalProducto);
    }
}
