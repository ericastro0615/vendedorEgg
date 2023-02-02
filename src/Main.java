public class Main {
    public static void main(String[] args) {
        //instaciar DE OBJETO tipo servicio
        VendedorService vs = new VendedorService();
        //instaciacion donde se aloja el retorno de la clase servcio, vinculacion y retorno del objeto de las clases
        Vendedor v1 = vs.altaVendedor();
        //llamada de metodos. NO SE PEUDE VINCULAR!!
        vs.vacaciones(v1);
        //vs.sueldoMensual();
    }
    }
