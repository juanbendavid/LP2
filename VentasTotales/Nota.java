package VentasTotales;

public class Nota {
    int idVendedor; // numero de del vendedor
    int idProducto; // numero del producto
    int total; // valor total de ese producto vendido en el día

    // constructor
    public Nota(int idVendedor, int idProducto, int total){
        this.idVendedor = idVendedor;
        this.idProducto = idProducto;
        this.total = total;
    }

    

}
