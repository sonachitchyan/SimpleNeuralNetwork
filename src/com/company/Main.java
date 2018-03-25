package com.company;

public class Main {

    public static void main(String[] args) {
        NeuralNetwork neuralNetwork = new NeuralNetwork();
        double traininInput [][] ={{0,0,1},{1,1,1},{1,0,1},{0,1,1}};
        double trainingOutput[] = {0,1,1,0};
        neuralNetwork.train(neuralNetwork, traininInput, trainingOutput, 10000000);
        for(double i: neuralNetwork.simpleweights){
            System.out.print(i + " ");
        }
        System.out.println("");
        double a[] = {1,0,0};
        System.out.println(neuralNetwork.think(a, neuralNetwork));
    }
}
