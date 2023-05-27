public class PrecioIva {
    public static double CalcularPrecioConIva(double precio){
        double iva = 0.19; //19% de IVA en Colombia
        double PrecioConIva = precio*(1+iva);
        return PrecioConIva;

    }
    public static void main(String[] args) {
    double precio = 100000;
    double PrecioConIva = CalcularPrecioConIva(precio);
    System.out.println("El precio con IVA es: " + PrecioConIva);
    }
}
