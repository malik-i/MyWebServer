# WebServer Part 1

Part 1 of the Web Server project was to build a single-threaded Web Server
GET HEAD
## The job of a Server Socket
1. The client socket will be sending a request to connect to the ServerSocket
2. When the ServerSocket receives the request, it will accept the request
3. After the acceptance, the ServerSocket will then create a new Socket on the server-side
4. Once a new socket has been created, the two sockets can establish a connection

## Materials used in Code
- ServerSocket = ss
- socketB = the new socket which is created from the ServerSocket
- PORT: 1997

## Program should be ran in IntelliJ

No dependencies used for this assignment, only Java libraries (ServerSocket, Socket, IO), just click the run!
## Usage
### Java IO

```java
import java.io.*;

socketB.getInputStream(); // packages all the associated data with the socket
```

### ServerSocket
```java
import java.net.ServerSocket;

ss.accept(); //returns a new socket from a ServerSocket
```

### Socket
```java
import java.net.Socket;
```