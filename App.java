public class App {
    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        
        // Descomentar APENAS o bloco desejado para teste!
        
        System.out.println();

        // String Path50 = "50";
        // char[][] map50 = MapMaker.readsMap("casoD" + Path50 + ".txt");
        // long value50 = Chase.moneyCounter(map50, Chase.findStart(map50), 0);
        // System.out.println("valor caso D50 = " + value50);

        // String Path100 = "100";
        // char[][] map100 = MapMaker.readsMap("casoD" + Path100 + ".txt");
        // long value100 = Chase.moneyCounter(map100, Chase.findStart(map100), 0);
        // System.out.println("valor caso D100 = " + value100);

        // String Path200 = "200";
        // char[][] map200 = MapMaker.readsMap("casoD" + Path200 + ".txt");
        // long value200 = Chase.moneyCounter(map200, Chase.findStart(map200), 0);
        // System.out.println("valor caso D200 = " + value200);

        // String Path500 = "500";
        // char[][] map500 = MapMaker.readsMap("casoD" + Path500 + ".txt");
        // long value500 = Chase.moneyCounter(map500, Chase.findStart(map500), 0);
        // System.out.println("valor caso D500 = " + value500);

        // String Path750 = "750";
        // char[][] map750 = MapMaker.readsMap("casoD" + Path750 + ".txt");
        // long value750 = Chase.moneyCounter(map750, Chase.findStart(map750), 0);
        // System.out.println("valor caso D750 = " + value750);

        // String Path1000 = "1000";
        // char[][] map1000 = MapMaker.readsMap("casoD" + Path1000 + ".txt");
        // long value1000 = Chase.moneyCounter(map1000, Chase.findStart(map1000), 0);
        // System.out.println("valor caso D1000 = " + value1000);

        // String Path1500 = "1500";
        // char[][] map1500 = MapMaker.readsMap("casoD" + Path1500 + ".txt");
        // long value1500 = Chase.moneyCounter(map1500, Chase.findStart(map1500), 0);
        // System.out.println("valor caso D1500 = " + value1500);

        // String Path2000 = "2000";
        // char[][] map2000 = MapMaker.readsMap("casoD" + Path2000 + ".txt");
        // long value2000 = Chase.moneyCounter(map2000, Chase.findStart(map2000), 0);
        // System.out.println("valor caso D2000 = " + value2000);

        // Pode-se criar um mapa personalizado aqui:
        // String Path = "map.txt";
        // char[][] map = MapMaker.readsMap(Path);
        // long value = Chase.moneyCounter(map, Chase.findStart(map), 0);
        // System.out.println("valor = " + value);

        System.out.println();
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime) / 1_000_000;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
        System.out.println();
    }
}