import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import static spark.Spark.*;

/*
*  Responsibility: To build the a server
*
*  "Materials":
*   1) ServerSocket
*   2) a Socket
*
*  The Job of a ServerSocket
*   1) The client socket will be sending a request to connect
*      to the ServerSocket
*
*   2) When the ServerSocket recieves the request, it will accept
*       the request
*
*   3) After the acceptance, the ServerSocket will then create a new
*       Socket on the server side
*
*   4) Once new socket has been created, the two sockets can establish
*       a connection
*
* */

public class Main {

    public static void main(String[] args) {
        final int PORT = 1997; // going to running on port 1997
        boolean portOpen = true;
        ServerSocket ss; // SocketServer Object
        Socket socketB = null; // This will be our socket that is created once acceptance
        try {
            ss = new ServerSocket(PORT); // ServerSocket has been created
            System.out.println("Opened Socket: " + PORT); // log
            while(portOpen){ // while the port is open, which is gonna be always, while server is runnin
                // now the ServerSocket, must accept a request, therefore creating a Socket
                try {
                    socketB = ss.accept();
                    System.out.println("Socket Accepted!");
                } catch (IOException e){
                    System.out.println("ERROR: Socket did not get accepted!");
                }

                InputStream dataStream = socketB.getInputStream(); // bringing all the associated data from socketB in a stream, (reading the data)
                BufferedReader in = new BufferedReader(new InputStreamReader(dataStream)); // translating the passed data




            }

        } catch (IOException e){
            System.out.println("ERROR: Socket did not successfully open!");
        }
    }
}
