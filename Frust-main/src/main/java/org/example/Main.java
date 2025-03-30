package org.example;

import AnimalSom.Animal;
import AnimalSom.Cachorro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do animal");
        String nome = sc.nextLine();
        animal.setNome(nome);
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();




    }
}