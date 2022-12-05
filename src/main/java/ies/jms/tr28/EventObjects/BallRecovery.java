package ies.jms.tr28.EventObjects;

public class BallRecovery
{
    private boolean offensive;
    private boolean recovery_failure;

    public boolean isOffensive()
    {
        return offensive;
    }

    public void setOffensive(boolean offensive)
    {
        this.offensive = offensive;
    }

    public boolean isRecovery_failure()
    {
        return recovery_failure;
    }

    public void setRecovery_failure(boolean recovery_failure)
    {
        this.recovery_failure = recovery_failure;
    }

    @Override
    public String toString()
    {
        return "BallRecovery{" +
                "offensive=" + offensive +
                ", recovery_failure=" + recovery_failure +
                '}';
    }
}
