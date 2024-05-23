import java.util.ArrayList;

public class SistemaReservacion {
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Reservacion> reservaciones;

    public SistemaReservacion() {
        this.vuelos = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public Vuelo buscarVuelo(String numeroVuelo) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getNumeroVuelo().equals(numeroVuelo)) {
                return vuelo;
            }
        }
        return null;
    }

    public boolean reservarVuelo(String numeroVuelo, Pasajero pasajero) {
        Vuelo vuelo = buscarVuelo(numeroVuelo);
        if (vuelo != null && vuelo.reservarAsiento()) {
            Reservacion reservacion = new Reservacion(vuelo, pasajero);
            reservaciones.add(reservacion);
            return true;
        }
        return false;
    }

    public void cancelarReservacion(Reservacion reservacion) {
        reservacion.cancelarReservacion();
        reservaciones.remove(reservacion);
    }

    public void mostrarReservaciones() {
        for (Reservacion reservacion : reservaciones) {
            System.out.println("Vuelo: " + reservacion.getVuelo().getNumeroVuelo() +
                               " Pasajero: " + reservacion.getPasajero().getNombre() +
                               " " + reservacion.getPasajero().getApellido());
        }
    }
}