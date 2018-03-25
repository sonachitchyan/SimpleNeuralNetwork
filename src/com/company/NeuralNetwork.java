package com.company;

public class NeuralNetwork {
    double [] simpleweights = new double[3];
    public NeuralNetwork() {
        for(double i: this.simpleweights){
            i =2 * Math.random() - 1;
        }
    }
    public double sigmoid(double x){
        return 1/(1 + Math.exp(-x));
    }
    public double sigmoidDerivative(double x){
        return x * (1-x);
    }
    public void train(NeuralNetwork neuralNetwork, double[][] trainingInput, double[] trainingOutput, int numerOfIterations){
        for(int i=0; i<numerOfIterations; i++) {
            for(int j=0; j<trainingInput.length; j++){
                double output = neuralNetwork.think(trainingInput[j], neuralNetwork);
                double error = trainingOutput[j]-output;
                for (int k=0; k<simpleweights.length; k++){
                    simpleweights[k]+=error * trainingInput[j][k] * sigmoidDerivative(output);
                }
            }
        }
    }

    public double think(double[] input, NeuralNetwork neuralNetwork) {
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i] * simpleweights[i];
        }
        return sigmoid(sum);
    }

}
