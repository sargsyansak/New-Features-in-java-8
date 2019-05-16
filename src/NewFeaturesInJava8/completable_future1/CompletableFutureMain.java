package NewFeaturesInJava8.completable_future1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                    }
//                    return "Hi";
//                });
//        System.out.println(future.get());

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10)
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 2))
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 5));
        System.out.println(future.get());

    }
}
