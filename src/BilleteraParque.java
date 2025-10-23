public class BilleteraParque{

    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque(int tickets) {
        this.tickets = tickets;
    }

    public BilleteraParque() {
        this.tickets = 0;
    }

    public int getTickets() {
        return tickets;
    }

    public static boolean getFestivo() {
        return festivo;
    }

    public static void setFestivo() {
        festivo = !festivo;
    }
    public void setTickets(int cantidad) {
        if (cantidad > 0) {
            tickets = cantidad;
        }
    }

    public void agregarTickets(int cantidad) {
        if (cantidad > 0) {
            tickets += cantidad;
        }
    }

    public boolean removerTickets(int cantidad) {
        if (cantidad > 0 && tickets >= cantidad) {
            tickets -= cantidad;
            return true;
        }
        return false;
    }
}
