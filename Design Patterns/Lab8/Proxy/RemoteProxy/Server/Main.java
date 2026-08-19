import Lab8.RemoteService;
import Lab8.RemoteServiceImpl;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


void main() throws RemoteException, NotBoundException {
     try{
            RemoteService service = new RemoteServiceImpl();
            Registry registry = LocateRegistry.createRegistry(7070);
            registry.rebind("RemoteService", service);
            System.out.println("RemoteService bound successfully");


    }catch(RemoteException e){
         System.out.println(e.getMessage());
     }
}
