public class Launcher {
    public static void  main(String Args[]){
        inicializar();

    }
    public static void inicializar(){
        Cliente cliente1 = new Cliente("Jose", "Mardonez","prueba@correo.cl",911223344,"soltero","Temuco");
        Notebook pc1 = new Notebook("HP",4,128,"intel","G240",2020,450000,20,"1220x870","algo",2500);
        Tienda tienda = new Tienda("Temuco 0280");
        tienda.agregarCliente(cliente1);
        tienda.agregarDispositivo(pc1);
        tienda.obtenerInformacionDispositivo(pc1);
    }

}
