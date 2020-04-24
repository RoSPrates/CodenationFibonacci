package challenge;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCodenation {

    public List<Integer> fibonacci(int ultimo){
        int ant = 0, atual = 1, prox;
        List<Integer> listaFibonacci = new ArrayList<Integer>();
        listaFibonacci.add(ant);
        listaFibonacci.add(atual);
        while(ant + atual <= ultimo){
            prox = ant + atual;
            listaFibonacci.add(prox);
            ant = atual;
            atual = prox;
        }
        return listaFibonacci;
    }

    public Boolean isFibonacci(Integer numero){
        return fibonacci(350).contains(numero);
    }
}
