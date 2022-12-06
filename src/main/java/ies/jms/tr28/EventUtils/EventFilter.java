package ies.jms.tr28.EventUtils;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectWriter;
import ies.jms.tr28.Solucion.Goleador;
import ies.jms.tr28.Solucion.PorteroJugador;
import ies.jms.tr28.Solucion.Referencia;
import ies.jms.tr28.Solucion.Resultado;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventFilter
{
    private List<Event>listaEventos;

    private Resultado resultado;
    private Referencia referencia;

    public EventFilter(List<Event> listaEventos)
    {
        this.listaEventos = listaEventos;
        this.resultado = new Resultado();
        this.referencia = new Referencia();
    }

    public void filterGoleador()
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
        //System.out.println(resultado.toString());
        //crearJson(resultado);
    }

    public void filterReferencia()
    {
        Map<String,Integer> listaPasesSpain = new HashMap<>();
        Map<String,Integer> listaPasesItalia = new HashMap<>();

        for(int i = 0; i < this.listaEventos.size(); i++){


            if(this.listaEventos.get(i).getPass()!=null && this.listaEventos.get(i).getPass().getRecipient()!=null){

                if(this.listaEventos.get(i).getTeam().getName().equals("Spain"))
                {

                    if(listaPasesSpain.containsKey(this.listaEventos.get(i).getPass().getRecipient().getName()))
                    {
                        listaPasesSpain.put(this.listaEventos.get(i).getPass().getRecipient().getName(), listaPasesSpain.get(this.listaEventos.get(i).getPass().getRecipient().getName())+1);
                    }
                    else
                    {
                        listaPasesSpain.put(this.listaEventos.get(i).getPass().getRecipient().getName(),1);
                    }
                }
                else
                {
                    if (listaPasesItalia.containsKey(this.listaEventos.get(i).getPass().getRecipient().getName()))
                    {
                        listaPasesItalia.put(this.listaEventos.get(i).getPass().getRecipient().getName(), listaPasesItalia.get(this.listaEventos.get(i).getPass().getRecipient().getName()) + 1);
                    } else
                    {
                        listaPasesItalia.put(this.listaEventos.get(i).getPass().getRecipient().getName(), 1);
                    }
                }
            }
        }
        int mayorNumeroPasesSpain = 0;
        String jugadorSpainPases ="";
        for(Map.Entry<String,Integer> recipient : listaPasesSpain.entrySet())
        {
            if(recipient.getValue() > mayorNumeroPasesSpain)
            {
                mayorNumeroPasesSpain = recipient.getValue();
                jugadorSpainPases=recipient.getKey();
            }
        }

        Referencia referenciaSpain = new Referencia();
        referenciaSpain.setEquipo("España");
        referenciaSpain.setNombre(jugadorSpainPases);
        referenciaSpain.setPases(mayorNumeroPasesSpain);

        this.resultado.getReferencia().add(referenciaSpain);

        int mayorNumeroPasesItalia = 0;
        String jugadorItalyPases ="";
        for(Map.Entry<String,Integer> recipient : listaPasesItalia.entrySet())
        {
            if(recipient.getValue() > mayorNumeroPasesItalia)
            {
                mayorNumeroPasesItalia = recipient.getValue();
                jugadorItalyPases=recipient.getKey();
            }
        }

        Referencia referenciaItaly = new Referencia();
        referenciaItaly.setEquipo("Italia");
        referenciaItaly.setNombre(jugadorItalyPases);
        referenciaItaly.setPases(mayorNumeroPasesItalia);



        this.resultado.getReferencia().add(referenciaItaly);
        //System.out.println(resultado.toString());
        //crearJson(resultado);
    }

    public void filterPorteroJugador()
    {
        int numeroPasesSpain = 0;
        int numeroPasesItaly = 0;
        String nombrePorteroSpain = "";
        String nombrePorteroItaly = "";

        for(Event event:this.listaEventos)
        {
            if(event.getPosition()!=null)
            {
                if(event.getPosition().getName().equals("Goalkeeper") && event.getPass()!=null)
                {
                    if(event.getTeam().getName().equals("Spain"))
                    {
                        numeroPasesSpain++;
                        nombrePorteroSpain = event.getPlayer().getName();

                    }
                    else
                    {
                        numeroPasesItaly++;
                        nombrePorteroItaly = event.getPlayer().getName();
                    }
                }
            }
        }

        PorteroJugador porteroJugador = new PorteroJugador();

        if(numeroPasesSpain>numeroPasesItaly)
        {
            porteroJugador.setEquipo("España");
            porteroJugador.setPases(numeroPasesSpain);
            porteroJugador.setNombre(nombrePorteroSpain);

        }
        else
        {
            porteroJugador.setEquipo("Italia");
            porteroJugador.setPases(numeroPasesItaly);
            porteroJugador.setNombre(nombrePorteroItaly);

        }

        this.resultado.setPortero_jugador(porteroJugador);
        System.out.println(resultado.toString());
        //crearJson(resultado);

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
