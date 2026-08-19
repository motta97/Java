package Lab8;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteService extends Remote {
    public String sayAnything() throws RemoteException;
}
