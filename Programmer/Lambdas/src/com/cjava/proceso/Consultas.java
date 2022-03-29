package com.cjava.proceso;
import com.cjava.entidad.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consultas {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Pez", true, false));
        animals.add(new Animal("Agila", false, false));
        animals.add(new Animal("Perro", true, true));
        animals.add(new Animal("Tortuga", true, false));
        animals.add(new Animal("Pato", true, false));

        List<String> result = animals.stream().
                filter(Animal::puedeNadar).
                filter(Predicate.not(Animal::puedeSaltar)).limit(2).
                map(Animal::getNombre).sorted().
                collect(Collectors.toList());
        System.out.println(result);

        // Listar los animales que no inician con P
        animals.removeIf(s -> s.getNombre().charAt(0) != 'P');
        // Listando
        animals.forEach(s -> System.out.println(s.getNombre())); // Listando

    }
}