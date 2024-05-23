public class Main {
    public static void main(String[] args) {
        //// Crear el sistema de reservación
        SistemaReservacion sistema = new SistemaReservacion();
        
        // Crear algunos vuelos y agregarlos al sistema
        Vuelo vuelo1 = new Vuelo("AB123", "Madrid", "Barcelona", "2024-06-01", 10);
        Vuelo vuelo2 = new Vuelo("CD456", "Paris", "Londres", "2024-06-02", 5);
        Vuelo vuelo3 = new Vuelo("EF789", "Nueva York", "Los Angeles", "2024-06-03", 2);
        
        sistema.agregarVuelo(vuelo1);
        sistema.agregarVuelo(vuelo2);
        sistema.agregarVuelo(vuelo3);
        
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Juan", "Pérez", "A12345678");
        
        // Intentar reservar un vuelo para el pasajero
        String numeroVuelo = "CD456";
        boolean exito = sistema.reservarVuelo(numeroVuelo, pasajero);
        
        if (exito) {
            System.out.println("Reservación exitosa para el vuelo " + numeroVuelo + " para el pasajero " + pasajero.getNombre() + " " + pasajero.getApellido());
        } else {
            System.out.println("No se pudo completar la reservación para el vuelo " + numeroVuelo);
        }
        
        // Mostrar todas las reservaciones
        System.out.println("\nListado de Reservaciones:");
        sistema.mostrarReservaciones();
    }
}
