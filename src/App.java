public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a cine");

        Cliente clienteUno.setCedula("11101545");
        clienteUno.setNombre("Maria");
        clienteUno.setId(1);
        
        float precio = clienteUno.calcularPrecio(8000);
        System.out.println("Cédula: " + clienteUno.getCedula()
                            + "\nNombre: " + clienteUno.getNombre()
                            + "\nID: " + clienteUno.getId()
                            + "Precio entrada: " + precio);
    }
    }
}
