import java.util.LinkedList;
import java.util.List;

public class Nodes {
    Nodes source;
    String cityName;
    List<Edge> edges;
    boolean visited;
    int hursitic;


    public Nodes(String cityName) {
        this.cityName = cityName;
        edges = new LinkedList<>();
    }

    @Override
    public String toString() {
        return cityName;
    }
}
