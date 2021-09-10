package List;

// Exercício comentado

import java.util.*;
import java.util.LinkedList;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
        // =>  Generics (<Double>) e Diamond Operator (não colocar o Double entre <>)
        // Não é indicado porque o certo é programar voltado para a interface (LIST) e não
        // para a implementação (ARRAYLIST)

//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        // Forma limitada porque eu não posso adicionar mais elementos dentro da lista e também
        // não posso retirar
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/

        // Torna a minha lista imutável. Nem adicionar nem retirar
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        // Poderia passar as notas também deste modo: (Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0); // Modo convencional
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        // Lembrando que as posições começam de 0
        // notas.indexOf(Objeto)
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        // Aqui vocẽ passa a posição e o elemento
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // o indexOf(5d) traz a posição
        System.out.println(notas);

        // colocou dentro do () porque o método retorna um boolean
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        // Para ficar diferente, vai imprimir um abaixo do outro => for each
        for (Double nota : notas) System.out.println(nota);

        // Você passa o indice e ele retorna o valor
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // List não tem nenhum método para min ou max, mas Collection tem.
        // A classe Double implementa a interface Comparable, e as notas são do tipo Double.
        // Outros que implementam essa interface: integer, string e a classe TreeSet
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Não existe aqui o sum
        // O método Iterator vai percorrer a lista para fazer a soma
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){ // hasNext indica se tem próximo elemento
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/
        System.out.println("Crie uma lista chamada notas2 e coloque " +
                "todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<Double>();
        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);
    }
}
