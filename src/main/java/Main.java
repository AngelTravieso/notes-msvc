import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.ws.rs.ApplicationPath;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        System.out.println("Running application....");
        Quarkus.run(args);
    }
}
