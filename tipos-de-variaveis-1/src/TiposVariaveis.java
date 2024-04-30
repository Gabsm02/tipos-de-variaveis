// https://glysns.gitbook.io/java-basico/sintaxe/variaveis

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salario = 2500;  //para representar dois mil e quinhentos reais

        double salarioDecimal = 2.500; //para representar dois ponto cinco zero zero

        byte numeros = 123; //para representar número muito curto
        short ano = 2024; // para representar um número um pouco maior que o byte
        int cep = 12345678; // para representar um número maior que o short (se o número comecar com 0, usar String)
        long cpf = 12345678901L; // para representar um número muito grande (se o número comecar com 0, usar String) e no final obrigatoriamente colocar o L
        float altura = 1.75f; // para representar um número decimal e no final obrigatoriamente colocar o f
        double salarioMensal = 2500.00; // para representar um número decimal maior que o float

        //java é fortemente tipado, ou seja, não é possível atribuir um valor de um tipo a uma variável de outro tipo. exemplo:

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; Essa última linha daria erro, pois não é possível atribuir um valor de um tipo maior a um tipo menor
    }
}

