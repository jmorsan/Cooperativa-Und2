package ies.jms.tr28.EventUtils;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectWriter;
import ies.jms.tr28.Solucion.Goleador;
import ies.jms.tr28.Solucion.Resultado;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EventFilter
{
    private List<Event>listaEventos;

    private Resultado resultado;

    public EventFilter(List<Event> listaEventos)
    {
        this.listaEventos = listaEventos;
        this.resultado = new Resultado();
    }

    public void filter()
    {
        for(Event event:this.listaEventos){
            if(event.getShot()!=null)
            {
                if(event.getShot().getOutcome().getName().equals("Goal"))
                {
                    Goleador goleador = new Goleador();
                    goleador.setEquipo(event.getTeam().getName());
                    goleador.setNombre(event.getPlayer().getName());
                    goleador.setMinuto(event.getMinute());
                    goleador.setSegundo(event.getSecond());

                    this.resultado.getGoleador().add(goleador);
                }
            }
        }
        System.out.println(resultado.toString());
        crearJson(resultado);
    }

    public void crearJson(Resultado resultado){

        ObjectWriter writer = Json.mapper().writer(new DefaultPrettyPrinter());
        try
        {
            writer.writeValue(new File("src/main/resources/event_out.json"),resultado);
        } catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }

}
