public class main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setNombre("Fransisco");
        cliente.setEdad(29);
        cliente.setTelefono("+1888546482");
        cliente.setCredito(5200.2547);
        System.out.println("Nombre:"+ cliente.getNombre()+ "\nEdad:"+ cliente.getEdad() +
                            "\nTelefono:"+ cliente.getTelefono() + "\nCredito: $" +
                            cliente.getCredito()+"\n");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Virgilio");
        trabajador.setEdad(34);
        trabajador.setTelefono("+18882525466");
        trabajador.setSueldo(20.33);
        System.out.println("Nombre:"+ trabajador.getNombre()+ "\nEdad:"+ trabajador.getEdad() +
                            "\nTelefono:"+ trabajador.getTelefono() + "\nSueldo: $" +
                            trabajador.getSueldo());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private  String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    private double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
