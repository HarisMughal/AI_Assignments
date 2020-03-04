import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        String destination = "bucharest";
        Nodes city1 = new Nodes("arad");
        Nodes city2 = new Nodes("zerind");
        Nodes city3 = new Nodes("sibiu");
        Nodes city4 = new Nodes("timisoara");
        Nodes city5 = new Nodes("oradea");
        Nodes city6 = new Nodes("lugoj");
        Nodes city7 = new Nodes("mehadia");
        Nodes city8= new Nodes("dobreta");
        Nodes city9= new Nodes("craiova");
        Nodes city10= new Nodes("rimnicu vilcea");
        Nodes city11= new Nodes("fagaras");
        Nodes city12= new Nodes("pitesti");
        Nodes city13= new Nodes("bucharest");
        Nodes city14= new Nodes("giurgiu");
        Nodes city15= new Nodes("urziceni");
        Nodes city16= new Nodes("vaslui");
        Nodes city17= new Nodes("lasi");
        Nodes city18= new Nodes("naemt");
        Nodes city19= new Nodes("hirsiva");
        Nodes city20= new Nodes("eforie");

        city1.hursitic = 366;
        city13.hursitic = 0 ;
        city9.hursitic = 160;
        city8.hursitic =242;
        city20.hursitic =161;
        city11.hursitic =176;
        city14.hursitic =77;
        city19.hursitic =151;
        city17.hursitic = 226;
        city6.hursitic =244;
        city7.hursitic =241;
        city18.hursitic =234;
        city5.hursitic =380;
        city12.hursitic =100;
        city10.hursitic =193;
        city3.hursitic =253;
        city4.hursitic =329;
        city15.hursitic =80;
        city16.hursitic =199;
        city2.hursitic =374;

        city1.edges.add(new Edge (city2,75));
        city1.edges.add(new Edge(city3,140));
        city1.edges.add(new Edge(city4,118));

        city2.edges.add(new Edge(city1,75));
        city2.edges.add(new Edge(city5,71));

        city3.edges.add(new Edge(city1,140));
        city3.edges.add(new Edge(city5,151));
        city3.edges.add(new Edge(city11,99));
        city3.edges.add(new Edge(city10,90));

        city4.edges.add(new Edge(city1,118));
        city4.edges.add(new Edge(city6,111));

        city5.edges.add(new Edge(city2,71));
        city5.edges.add(new Edge(city3,151));

        city6.edges.add(new Edge(city4,111));
        city6.edges.add(new Edge(city7,70));


        city7.edges.add(new Edge(city6,70));
        city7.edges.add(new Edge(city8,75));

        city8.edges.add(new Edge(city7,75));
        city8.edges.add(new Edge(city9,120));

        city9.edges.add(new Edge(city8,120));
        city9.edges.add(new Edge(city10,146));
        city9.edges.add(new Edge(city12,138));

        city10.edges.add(new Edge(city9,146));
        city10.edges.add(new Edge(city3,80));
        city10.edges.add(new Edge(city12,97));

        city11.edges.add(new Edge(city3,99));
        city11.edges.add(new Edge(city13,211));

        city12.edges.add(new Edge(city10,97));
        city12.edges.add(new Edge(city13,101));
        city12.edges.add(new Edge(city9,138));

        city13.edges.add(new Edge(city12,101));
        city13.edges.add(new Edge(city11,211));
        city13.edges.add(new Edge(city13,90));
        city13.edges.add(new Edge(city15,85));

        city14.edges.add(new Edge(city13,90));

        city15.edges.add(new Edge(city13,85));
        city15.edges.add(new Edge(city16,142));
        city15.edges.add(new Edge(city19,98));

        city16.edges.add(new Edge(city15,142));
        city16.edges.add(new Edge(city17,92));

        city17.edges.add(new Edge(city16,92));
        city17.edges.add(new Edge(city18,87));

        city18.edges.add(new Edge(city17,87));

        city19.edges.add(new Edge(city15,98));
        city19.edges.add(new Edge(city20,86));

        city20.edges.add(new Edge(city19,86));

        PriorityQueue<Nodes> queue = new PriorityQueue<>();
        queue.add(city1);

        while(!queue.isEmpty()){

            
        }
    }
}
