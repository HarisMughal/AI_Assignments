import javax.xml.soap.Node;
import java.util.*;

public class Main {
//    public  int BFS(Nodes city,String destination){
//        if(city == null){
//            return 0;
//        }else if(city.cityName.equals(destination)){
//            return 1;
//        }else{
//            city.visited = true;
//            for (Edge i : city.edges ){
//                if(i.destination.visited == false) {
////                    i.setSource(current);
//                    i.destination.visited = true;
//                    System.out.println(i.destination + " " + i.weight);
//                    BFS(i.destination,destination);
//                }
//            }
//
//
//        }
//
//
//
//    }

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













        Queue<Nodes> queue = new LinkedList<>();

        queue.add(city1);


        while(!queue.isEmpty()){
            Nodes current = queue.remove();
            current.visited = true;
            for (Edge i : current.edges ){
                if(i.destination.visited == false) {
                    i.destination.source = (current);
                    i.destination.distance = i.weight;
                    i.destination.visited = true;
                    System.out.println(i.destination + " " + i.weight);
                    if(i.destination.cityName.equals(destination)){

//                        printPath(i);
                        System.out.println("Path taken-------------------\n");
                        Nodes path = i.destination;
                        int cost = 0;
                        while (path != null){
                            System.out.println(path);
                            cost += path.distance;
                            path = path.source;

//                            int index = 0;
//                            for(Edge in : i.source.edges){
//                                if(in.destination.equals(i.destination)) {
//                                    i = i.source.edges.get(index);
//                                }
//
//
//                            }
                        }
                        System.out.println("paths cost is "+cost+"\nNow resuming bfs -------------------\n");
//                      break;
                    }
                    queue.add(i.destination);
                }
            }

        }

        Nodes dfsCity1 = new Nodes("arad");
        Nodes dfsCity2 = new Nodes("zerind");
        Nodes dfsCity3 = new Nodes("sibiu");
        Nodes dfsCity4 = new Nodes("timisoara");
        Nodes dfsCity5 = new Nodes("oradea");
        Nodes dfsCity6 = new Nodes("lugoj");
        Nodes dfsCity7 = new Nodes("mehadia");
        Nodes dfsCity8= new Nodes("dobreta");
        Nodes dfsCity9= new Nodes("craiova");
        Nodes dfsCity10= new Nodes("rimnicu vilcea");
        Nodes dfsCity11= new Nodes("fagaras");
        Nodes dfsCity12= new Nodes("pitesti");
        Nodes dfsCity13= new Nodes("bucharest");
        Nodes dfsCity14= new Nodes("giurgiu");
        Nodes dfsCity15= new Nodes("urziceni");
        Nodes dfsCity16= new Nodes("vaslui");
        Nodes dfsCity17= new Nodes("lasi");
        Nodes dfsCity18= new Nodes("naemt");
        Nodes dfsCity19= new Nodes("hirsiva");
        Nodes dfsCity20= new Nodes("eforie");




        dfsCity1.edges.add(new Edge (dfsCity2,75));
        dfsCity1.edges.add(new Edge(dfsCity3,140));
        dfsCity1.edges.add(new Edge(dfsCity4,118));

        dfsCity2.edges.add(new Edge(dfsCity1,75));
        dfsCity2.edges.add(new Edge(dfsCity5,71));

        dfsCity3.edges.add(new Edge(dfsCity1,140));
        dfsCity3.edges.add(new Edge(dfsCity5,151));
        dfsCity3.edges.add(new Edge(dfsCity11,99));
        dfsCity3.edges.add(new Edge(dfsCity10,90));

        dfsCity4.edges.add(new Edge(dfsCity1,118));
        dfsCity4.edges.add(new Edge(dfsCity6,111));

        dfsCity5.edges.add(new Edge(dfsCity2,71));
        dfsCity5.edges.add(new Edge(dfsCity3,151));

        dfsCity6.edges.add(new Edge(dfsCity4,111));
        dfsCity6.edges.add(new Edge(dfsCity7,70));


        dfsCity7.edges.add(new Edge(dfsCity6,70));
        dfsCity7.edges.add(new Edge(dfsCity8,75));

        dfsCity8.edges.add(new Edge(dfsCity7,75));
        dfsCity8.edges.add(new Edge(dfsCity9,120));

        dfsCity9.edges.add(new Edge(dfsCity8,120));
        dfsCity9.edges.add(new Edge(dfsCity10,146));
        dfsCity9.edges.add(new Edge(dfsCity12,138));

        dfsCity10.edges.add(new Edge(dfsCity9,146));
        dfsCity10.edges.add(new Edge(dfsCity3,80));
        dfsCity10.edges.add(new Edge(dfsCity12,97));

        dfsCity11.edges.add(new Edge(dfsCity3,99));
        dfsCity11.edges.add(new Edge(dfsCity13,211));

        dfsCity12.edges.add(new Edge(dfsCity10,97));
        dfsCity12.edges.add(new Edge(dfsCity13,101));
        dfsCity12.edges.add(new Edge(dfsCity9,138));

        dfsCity13.edges.add(new Edge(dfsCity12,101));
        dfsCity13.edges.add(new Edge(dfsCity11,211));
        dfsCity13.edges.add(new Edge(dfsCity13,90));
        dfsCity13.edges.add(new Edge(dfsCity15,85));

        dfsCity14.edges.add(new Edge(dfsCity13,90));

        dfsCity15.edges.add(new Edge(dfsCity13,85));
        dfsCity15.edges.add(new Edge(dfsCity16,142));
        dfsCity15.edges.add(new Edge(dfsCity19,98));

        dfsCity16.edges.add(new Edge(dfsCity15,142));
        dfsCity16.edges.add(new Edge(dfsCity17,92));

        dfsCity17.edges.add(new Edge(dfsCity16,92));
        dfsCity17.edges.add(new Edge(dfsCity18,87));

        dfsCity18.edges.add(new Edge(dfsCity17,87));

        dfsCity19.edges.add(new Edge(dfsCity15,98));
        dfsCity19.edges.add(new Edge(dfsCity20,86));

        dfsCity20.edges.add(new Edge(dfsCity19,86));

        System.out.println("DFS-------------------\n");

        Stack<Nodes> stack = new Stack<Nodes>();
        stack.push(dfsCity1);
        dfsCity1.visited = true;
        boolean pop = true;
        boolean end = false;
        while(!stack.isEmpty()){

            Nodes node = stack.peek();
            for(Edge i : node.edges){
                if(i.destination.visited == true){
                    continue;
                }else{
                    System.out.println(i.destination + " " + i.weight);
                    i.destination.distance = i.weight;
                    stack.push(i.destination);

                    i.destination.visited = true;
                    pop = false;
                    if(i.destination.cityName.equals(destination)){
                        end = true;
                    }
                    break;
                }
            }
            if(pop){
                stack.pop();
            }
            pop = true;
            if(end){
                    System.out.println("Path taken --------------\n");
                    int cost = 0;
                while(!stack.isEmpty()){
                    cost += stack.peek().distance;
                    System.out.println(stack.pop());
                }
                System.out.println("path cost is "+cost);
                break;
            }

        }



    }

//    static void printPath(Edge path){
//        Nodes node = path.destination;
//        while(path.source!= null) {
//            System.out.println(node);
//            node = path.source;
//            path = node.edges;
//        }
//    }
}
