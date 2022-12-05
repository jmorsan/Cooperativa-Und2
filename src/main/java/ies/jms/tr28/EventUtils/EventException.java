package ies.jms.tr28.EventUtils;

public class EventException extends Exception
{
    public EventException()
    {
        super();
    }

    public EventException(String message)
    {
        super(message);
    }

    public EventException(String message, Throwable exception)
    {
        super(message,exception);
    }
}
