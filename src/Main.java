import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        final int PORT = 3333;
        port(PORT);
        System.out.println("Server has started! \n Port: " + PORT);


        get("/malik", (req, res) -> "hi malik");
    }
}
