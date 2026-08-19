import Lab8.RemoteService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

void main() throws RemoteException, NotBoundException {

    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 7070);
    RemoteService service = (RemoteService) registry.lookup("RemoteService");
    System.out.printf(service.sayAnything());

}
