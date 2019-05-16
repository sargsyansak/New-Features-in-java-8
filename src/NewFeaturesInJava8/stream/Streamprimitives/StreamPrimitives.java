package NewFeaturesInJava8.stream.Streamprimitives;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamPrimitives {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4);
        LongStream longStream = LongStream.of(5, 6, 7, 8);
        DoubleStream doubleStream = DoubleStream.of(9, 10, 11, 12);

    }
}
