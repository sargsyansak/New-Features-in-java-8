package NewFeaturesInJava8.stream.streamfiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilesMain {

    public static void main(String[] args) {
//        List<String> lines = new ArrayList<>();
//        Path path = Paths.get("file.txt");
//        try (BufferedReader reader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = reader.readLine()) != null)
//                lines.add(line);
//        } catch (IOException ignored) {
//        }
//        System.out.println(lines);

        List<String> lines = new ArrayList<>();
        Path path = Paths.get("file.txt");

//        try (Scanner scanner = new Scanner(path)) {
//            while (scanner.hasNext())
//                lines.add(scanner.nextLine());
//        } catch (IOException ignored) {
//        }
//        System.out.println(lines);

//        try (Stream<String> lineStream = Files.lines(path)){
//            lines = lineStream.collect(Collectors.toList());
//        }catch (IOException ignored){ }
//        System.out.println(lines);

        try (Stream<String> lineStream = Files.newBufferedReader(path).lines()){
            lines = lineStream.collect(Collectors.toList());
        }catch (IOException ignored){ }
        System.out.println(lines);


    }
}
