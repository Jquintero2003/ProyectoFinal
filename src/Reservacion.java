public class Reservacion {
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Reservacion(Vuelo vuelo, Pasajero pasajero) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    // Getters y Setters
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public boolean confirmarReservacion() {
        return vuelo.reservarAsiento();
    }

    public void cancelarReservacion() {
        vuelo.cancelarReservacion();
    }
}

