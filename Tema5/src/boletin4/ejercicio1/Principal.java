package boletin4.ejercicio1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        Integer[] numeros = new Integer[20];
        Random rand = new Random();
        
        // Crear un comparador clásico usando una clase anónima
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;  // Orden descendente
            }
        };
        
        // Rellenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(1, 101);
        }

        System.out.println(Arrays.toString(numeros));
        
        // Ordenar en orden ascendente (por defecto)
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
        // Ordenar en orden descendente usando el comparador anterior
        Arrays.sort(numeros, comp);
        System.out.println(Arrays.toString(numeros));
        
        // Buscar el valor 5 en el array ordenado utilizando el comparador
        System.out.println(Arrays.binarySearch(numeros, 5, comp));
    }
}

