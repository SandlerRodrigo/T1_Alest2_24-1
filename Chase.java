public class Chase {
    private static int direction = 0;
    private static long value = 0;
    private static String number = "";

    // Verifica em qual linha está o início da perseguição
    public static int findStart(char[][] map) {
        int linhaStart = 0;
        char atual = map[linhaStart][0];
        while (atual != '-') {
            linhaStart++;
            atual = map[linhaStart][0];
        }
        return linhaStart;
    }

    // Verifica se o caracter seguinte ao atual será um número
    public static boolean isNumber(char next) {
        if (Character.getNumericValue(next) != (-1)) {
            return true;
        }
        return false;
    }

    // Verifica se o caracter anterior ao atual foi um número
    public static boolean wasNumber(char prev) {
        if (Character.getNumericValue(prev) != (-1)) {
            return true;
        }
        return false;
    }

    // Este método faz a perseguição aos bandidos e conta o dinheiro recuperado
    public static long moneyCounter(char[][] map, int linha, int coluna) {

        // Enquanto não chegar ao fim da perseguição
        while (map[linha][coluna] != '#') {
            // Trabalha com o mapa de acordo com a direção atual
            switch (direction) {

                // esq -> dir
                case 0:
                    // Deve-se continuar andando na direção atual
                    if (map[linha][coluna] == '-' || map[linha][coluna] == '|') {
                        coluna++;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '\\') {
                        linha++;
                        direction = 2;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '/') {
                        linha--;
                        direction = 3;
                        break;
                    }
                    // Foi encontrado um número
                    if (Character.getNumericValue(map[linha][coluna]) != (-1)) {
                        // Enquanto o próximo char ainda for número, entra aqui e vai concatenando
                        if (isNumber(map[linha][coluna + 1])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            coluna++;
                            break;
                        }
                        // Entra aqui quando terminou de concatenar todo o valor e contabiliza
                        if (wasNumber(map[linha][coluna - 1])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            value += Long.parseLong(number);
                            number = "";
                            coluna++;
                            break;
                        }
                        // Quando for um valor de 1 casa só, apenas contabiliza ele
                        value += Character.getNumericValue(map[linha][coluna]);
                        coluna++;
                        break;
                    }

                    // dir -> esq
                case 1:
                    // Deve-se continuar andando na direção atual
                    if (map[linha][coluna] == '-' || map[linha][coluna] == '|') {
                        coluna--;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '\\') {
                        linha--;
                        direction = 3;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '/') {
                        linha++;
                        direction = 2;
                        break;
                    }
                    // Foi encontrado um número
                    if (Character.getNumericValue(map[linha][coluna]) != (-1)) {
                        // Enquanto o próximo char ainda for número, entra aqui e vai concatenando
                        if (isNumber(map[linha][coluna - 1])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            coluna--;
                            break;
                        }
                        // Entra aqui quando terminou de concatenar todo o valor e contabiliza
                        if (wasNumber(map[linha][coluna + 1])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            value += Long.parseLong(number);
                            number = "";
                            coluna--;
                            break;
                        }
                        value += Character.getNumericValue(map[linha][coluna]);
                        coluna--;
                        break;
                    }

                    // cima -> baixo
                case 2:
                    // Deve-se continuar andando na direção atual
                    if (map[linha][coluna] == '-' || map[linha][coluna] == '|') {
                        linha++;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '\\') {
                        coluna++;
                        direction = 0;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '/') {
                        coluna--;
                        direction = 1;
                        break;
                    }
                    // Foi encontrado um número
                    if (Character.getNumericValue(map[linha][coluna]) != (-1)) {
                        // Enquanto o próximo char ainda for número, entra aqui e vai concatenando
                        if (isNumber(map[linha + 1][coluna])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            linha++;
                            break;
                        }
                        // Entra aqui quando terminou de concatenar todo o valor e contabiliza
                        if (wasNumber(map[linha - 1][coluna])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            value += Long.parseLong(number);
                            number = "";
                            linha++;
                            break;
                        }
                        value += Character.getNumericValue(map[linha][coluna]);
                        linha++;
                        break;
                    }

                    // baixo -> cima
                case 3:
                    // Deve-se continuar andando na direção atual
                    if (map[linha][coluna] == '-' || map[linha][coluna] == '|') {
                        linha--;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '\\') {
                        coluna--;
                        direction = 1;
                        break;
                    }
                    // Deve-se mudar de direção de acordo com a direção atual
                    if (map[linha][coluna] == '/') {
                        coluna++;
                        direction = 0;
                        break;
                    }
                    // Foi encontrado um número
                    if (Character.getNumericValue(map[linha][coluna]) != (-1)) {
                        // Enquanto o próximo char ainda for número, entra aqui e vai concatenando
                        if (isNumber(map[linha - 1][coluna])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            linha--;
                            break;
                        }
                        // Entra aqui quando terminou de concatenar todo o valor e contabiliza
                        if (wasNumber(map[linha + 1][coluna])) {
                            String aux = "";
                            aux = Character.toString(map[linha][coluna]);
                            number = number.concat(aux);
                            value += Long.parseLong(number);
                            number = "";
                            linha--;
                            break;
                        }
                        value += Character.getNumericValue(map[linha][coluna]);
                        linha--;
                        break;
                    }
            }
        }
        return value;
    }
}