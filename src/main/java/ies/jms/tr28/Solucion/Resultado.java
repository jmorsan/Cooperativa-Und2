package ies.jms.tr28.Solucion;

import java.util.ArrayList;
import java.util.List;

public class Resultado
{
    private List<Goleador> goleador;
    private List<Referencia>referencia;
    private PorteroJugador portero_jugador;

    private List<Luchador>luchador;
    private PorcentajesPosesion porcentajesPosesion;

    public Resultado()
    {
        this.goleador = new ArrayList<>();
        this.referencia = new ArrayList<>();
        this.portero_jugador = new PorteroJugador();
        this.luchador = new ArrayList<>();
        this.porcentajesPosesion = new PorcentajesPosesion();
    }

    public List<Goleador> getGoleador()
    {
        return goleador;
    }

    public void setGoleador(List<Goleador> goleador)
    {
        this.goleador = goleador;
    }

    public List<Referencia> getReferencia()
    {
        return referencia;
    }

    public void setReferencia(List<Referencia> referencia)
    {
        this.referencia = referencia;
    }

    public PorteroJugador getPortero_jugador()
    {
        return portero_jugador;
    }

    public void setPortero_jugador(PorteroJugador portero_jugador)
    {
        this.portero_jugador = portero_jugador;
    }

    public List<Luchador> getLuchador()
    {
        return luchador;
    }

    public void setLuchador(List<Luchador> luchador)
    {
        this.luchador = luchador;
    }

    public PorcentajesPosesion getPorcentajesPosesion()
    {
        return porcentajesPosesion;
    }

    public void setPorcentajesPosesion(PorcentajesPosesion porcentajesPosesion)
    {
        this.porcentajesPosesion = porcentajesPosesion;
    }

    @Override
    public String toString()
    {
        return "Resultado{" +
                "goleador=" + goleador +
                ", referencia=" + referencia +
                ", portero_jugador=" + portero_jugador +
                ", luchador=" + luchador +
                ", porcentajesPosesion=" + porcentajesPosesion +
                '}';
    }
}
