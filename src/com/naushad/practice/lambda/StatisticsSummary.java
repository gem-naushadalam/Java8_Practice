package com.naushad.practice.lambda;

import java.util.stream.DoubleStream;

public class StatisticsSummary {
    /* Finding the maximum value from the given array */
    public static final ArrayProcessor arrayProcessorMax = array ->  DoubleStream.of(array).max().getAsDouble();

    /* Finding the minimum value from the given array */
    public static final ArrayProcessor arrayProcessorMin = array -> DoubleStream.of(array).min().getAsDouble();

    /* Finding the sum of the given array */
    public static final ArrayProcessor arrayProcessorSum = array -> DoubleStream.of(array).sum();

    /* Finding the average of the given array */
    public static final ArrayProcessor arrayProcessorAvg = array -> DoubleStream.of(array).average().getAsDouble();

    /* Find the total count of a given value from the array */
    public static ArrayProcessor counter( double value ) {
        return (array) -> DoubleStream.of(array).filter(v -> v == value).count();
    }
}
