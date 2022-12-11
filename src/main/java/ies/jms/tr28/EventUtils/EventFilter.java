package ies.jms.tr28.EventUtils;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectWriter;
import ies.jms.tr28.Solucion.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventFilter
{
    private List<Event>listaEventos;

    private Resultado resultado;


    public EventFilter(List<Event> listaEventos)
    {
        this.listaEventos = listaEventos;
        this.resultado = new Resultado();

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
                        listaPasesItalia.put(this.listaEventos.get(i).getPass().getRecipient().getName(), listaPasesItalia.get(this.listaEventos.get(i).getPass().getRecipient().getName()) +1);
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


    }

    public void filterLuchador()
    {
        Map<String,Integer> listaDuelosSpain = new HashMap<>();
        Map<String,Integer> listaDuelosItaly = new HashMap<>();

        for (Event event : listaEventos)
        {
            if (event.getDuel() != null)
            {
                if (event.getDuel().getOutcome() != null)
                {
                    if (event.getTeam().getName().equals("Spain") && event.getDuel().getOutcome().getName().equals("Won"))
                    {

                        if (listaDuelosSpain.containsKey(event.getPlayer().getName()))
                        {
                            listaDuelosSpain.put(event.getPlayer().getName(), listaDuelosSpain.get(event.getPlayer().getName()) +1);
                        } else
                        {
                            listaDuelosSpain.put(event.getPlayer().getName(), 1);
                        }
                    }
                    else if (event.getTeam().getName().equals("Italy") && event.getDuel().getOutcome().getName().equals("Won"))
                    {
                        if (listaDuelosItaly.containsKey(event.getPlayer().getName()))
                        {
                            listaDuelosItaly.put(event.getPlayer().getName(), listaDuelosItaly.get(event.getPlayer().getName()) +1);
                        } else
                        {
                            listaDuelosItaly.put(event.getPlayer().getName(), 1);
                        }
                    }
                }
            }

        }


        int mayorDuelosGanadosSpain = 0;
        String jugadorSpainDuelos ="";
        for(Map.Entry<String,Integer> recipient : listaDuelosSpain.entrySet())
        {

            if(recipient.getValue() > mayorDuelosGanadosSpain)
            {
                mayorDuelosGanadosSpain = recipient.getValue();
                jugadorSpainDuelos=recipient.getKey();
            }
        }


        Luchador luchadorSpain = new Luchador();
        luchadorSpain.setEquipo("Spain");
        luchadorSpain.setNombre(jugadorSpainDuelos);
        luchadorSpain.setDuelos_ganados(mayorDuelosGanadosSpain);

        this.resultado.getLuchador().add(luchadorSpain);

        int mayorDuelosGanadosItaly = 0;
        String jugadorItalyDuelos ="";
        for(Map.Entry<String,Integer> recipient : listaDuelosItaly.entrySet())
        {
            if(recipient.getValue() > mayorDuelosGanadosItaly)
            {
                mayorDuelosGanadosItaly = recipient.getValue();
                jugadorItalyDuelos = recipient.getKey();
            }
        }

        Luchador luchadorItaly = new Luchador();
        luchadorItaly.setEquipo("Italy");
        luchadorItaly.setNombre(jugadorItalyDuelos);
        luchadorItaly.setDuelos_ganados(mayorDuelosGanadosItaly);

        this.resultado.getLuchador().add(luchadorItaly);

    }

    public void filterPosesion()
    {
        double primerTiempoSpain = 0.0;
        double segundoTiempoSpain = 0.0;
        double primerTiempoItaly = 0.0;
        double segundoTiempoItaly = 0.0;
        for(Event event:listaEventos)
        {
            if(event.getTeam().getName().equals("Spain"))
            {
                if(event.getPeriod() == 1)
                {
                    primerTiempoSpain += event.getDuration();

                }
                else if(event.getPeriod() == 2)
                {
                    segundoTiempoSpain += event.getDuration();
                }
            }
            else
            {
                if(event.getPeriod() == 1)
                {
                    primerTiempoItaly += event.getDuration();

                }
                else if(event.getPeriod() == 2)
                {
                    segundoTiempoItaly += event.getDuration();
                }
            }
            PrimerTiempo primerTiempo = new PrimerTiempo();
            primerTiempo.setEspana(100 / ((primerTiempoSpain + primerTiempoItaly) / primerTiempoSpain));
            primerTiempo.setItalia(100 / ((primerTiempoSpain + primerTiempoItaly) / primerTiempoItaly));

            this.resultado.getPorcentajesPosesion().setPrimer_tiempo(primerTiempo);

            SegundoTiempo segundoTiempo = new SegundoTiempo();
            segundoTiempo.setEspana(100 / ((segundoTiempoSpain + segundoTiempoItaly) / segundoTiempoSpain));
            segundoTiempo.setItalia(100 / ((segundoTiempoSpain + segundoTiempoItaly) / segundoTiempoItaly));

            this.resultado.getPorcentajesPosesion().setSegundo_tiempo(segundoTiempo);

            PartidoCompleto partidoCompleto = new PartidoCompleto();
            partidoCompleto.setEspana((primerTiempo.getEspana()+segundoTiempo.getEspana())/2);
            partidoCompleto.setItalia((primerTiempo.getItalia()+segundoTiempo.getItalia())/2);

            this.resultado.getPorcentajesPosesion().setPartido_completo(partidoCompleto);

            crearJson(resultado);
        }
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
