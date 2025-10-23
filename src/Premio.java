public class Premio {
    private String nombre;
    private int costoTickets;

    public Premio(String nombre, int costoTickets) {
        this.nombre = nombre;
        this.costoTickets = costoTickets;
    }

    public int getCostoTickets( boolean festivo ) {
        if (festivo) {
            return costoTickets/2;
        }
        return costoTickets;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(boolean festivo) {
        return nombre + " (" + getCostoTickets(festivo) + " tickets)";
    }
}
