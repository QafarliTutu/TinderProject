import jdk.javadoc.internal.doclets.toolkit.taglets.UserTaglet;
import org.eclipse.jetty.server.Server;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(HerokuEnv.port());

        server.start();
        server.join();
    }
}
