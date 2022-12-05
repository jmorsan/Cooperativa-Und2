package ies.jms.tr28.Solucion;

public class Goleador
{
    private String equipo;
    private String nombre;
    private int minuto;
    private int segundo;

    public String getEquipo()
    {
        return equipo;
    }

    public void setEquipo(String equipo)
    {
        this.equipo = equipo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getMinuto()
    {
        return minuto;
    }

    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    public int getSegundo()
    {
        return segundo;
    }

    public void setSegundo(int segundo)
    {
        this.segundo = segundo;
    }

    @Override
    public String toString()
    {
        return "Goleador{" +
                "equipo='" + equipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }
}
