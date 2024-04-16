import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapMaker {

    public static char[][] readsMap(String Path) {
        try {
            FileReader fileReader = new FileReader(Path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Cria uma matriz de char com o tamanho informado
            String linha;
            linha = bufferedReader.readLine();
            int numLinhas = Integer.parseInt(linha.split(" ")[0].trim());
            int numColunas = Integer.parseInt(linha.split(" ")[1].trim());

            char[][] map = new char[numLinhas][numColunas];

            // Alimenta a matriz com o conteúdo do mapa
            int linhaAtual = 0;
            while ((linha = bufferedReader.readLine()) != null) {
                char[] caracteres = linha.toCharArray();
                for (int coluna = 0; coluna < caracteres.length; coluna++) {
                    map[linhaAtual][coluna] = caracteres[coluna];
                }
                linhaAtual++;
            }
            bufferedReader.close();
            fileReader.close();

            return map;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Método usado para testes no início do trabalho
    public static void printMap(char[][] map) {
        for (int linha = 0; linha < map.length; linha++) {
            for (int coluna = 0; coluna < map[linha].length; coluna++) {
                System.out.print(map[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}