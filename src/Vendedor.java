import java.util.Date;

public class Vendedor {
    private String nombre;
    private int dni;
    private Double sueldoBasico;
    private Double sueldoMensual;
    private Date fechaInicio;
    private Double comisiones;

    public Vendedor() {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
        this.comisiones = comisiones;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }



}
