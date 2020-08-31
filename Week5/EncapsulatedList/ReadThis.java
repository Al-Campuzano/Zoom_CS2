public class ReadThis
{
    private String url;
    private int currentPoints;

    public ReadThis(String newUrl)
    {
        url = newUrl;
        currentPoints = 0;
    }

    public String toString()
    {
        return url + " (" + currentPoints + ")";
    }
}
