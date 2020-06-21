package challenge;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCodenation {

    public List<Integer> fibonacci(int ultimo) {
        int cont = 1;
        List<Integer> listaFibonacci = new ArrayList<Integer>();
        listaFibonacci.add(0);
        listaFibonacci.add(1);
        while (listaFibonacci.get(cont) <= ultimo) {
            listaFibonacci.add(Integer.sum(listaFibonacci.get(cont), listaFibonacci.get(cont - 1)));
            cont++;
        }
        return listaFibonacci;
    }

    public Boolean isFibonacci(Integer numero) {
        return fibonacci(350).contains(numero);
    }
}
