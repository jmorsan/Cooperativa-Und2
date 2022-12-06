package ies.jms.tr28;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ies.jms.tr28.EventUtils.Event;
import ies.jms.tr28.EventUtils.EventFilter;
import ies.jms.tr28.EventUtils.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JsonParser
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args)
    {
        ObjectMapper mapper = Json.mapper();

        try
        {

            //Convert a JSON string to a Event
            List<Event> eventList = mapper.readValue(Paths.get("src/main/resources/3795220.json").toFile(), new TypeReference<List<Event>>() {});
            

            EventFilter eventFilter = new EventFilter(eventList);
            //eventFilter.filterGoleador();
            //eventFilter.filterReferencia();
            eventFilter.filterPorteroJugador();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
            LOGGER.error("Error al parsear json ");
        }
    }
}
