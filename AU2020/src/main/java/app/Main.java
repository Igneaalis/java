package app;

// For annotations in IDE
import org.jetbrains.annotations.NotNull;

public class Main {
    // Wrapper (Decorator)
    public static <T> void start(@NotNull Class<T> currentClass) {
        System.out.println("\n----- " + currentClass.getSimpleName() + " class has been executed! -----");
        try {
            currentClass.getDeclaredMethod("main").invoke(currentClass.getDeclaredConstructor().newInstance());
        } catch (Throwable e) {
            System.err.println("\nThrowable in " + currentClass.getSimpleName() + ": " + e);
        }
        System.out.println("\n----- " + currentClass.getSimpleName() + " class has been successfully ended! -----" +
                "\n\n###########################################################");
    }

    // Entry point
    public static void main(String[] args) {
        System.out.println("##### Main class has been executed! #####");
        start(Hello_World.class);
        start(Bubble_Sort.class);
        start(Prime.class);
        start(Number_Occurrences.class);
        System.out.println("\n##### Main class has been successfully ended! #####");
    }
}
