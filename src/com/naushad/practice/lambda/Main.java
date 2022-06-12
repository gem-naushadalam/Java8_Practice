package com.naushad.practice.lambda;

public class Main {
    public static void main(String[] args){

        double[] array = new double[]{10.5, 28.3, 58.9,
                6.5, -7.9, -21.76, 2.8,10.5};

        System.out.println("Maximum value: " + StatisticsSummary.arrayProcessorMax.apply(array));
        System.out.println("Minimum value: " + StatisticsSummary.arrayProcessorMin.apply(array));
        System.out.println("Sum: " + StatisticsSummary.arrayProcessorSum.apply(array));
        System.out.println("Average: " + StatisticsSummary.arrayProcessorAvg.apply(array));
        ArrayProcessor arrayProcessorCounter = StatisticsSummary.counter(10.5);
        System.out.println("Count: " + arrayProcessorCounter.apply(array));

    }


}
