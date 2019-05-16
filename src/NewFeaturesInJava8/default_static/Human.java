package NewFeaturesInJava8.default_static;

public interface Human {
    default void walk() {
        System.out.println("Ну, я пошел...");
    }

    static void wal() {
        System.out.println("Ну ну..");
    }
}

//interface Walkable {
//    default void walk() {
//        System.out.println("Ходьба");
//    }
//}
