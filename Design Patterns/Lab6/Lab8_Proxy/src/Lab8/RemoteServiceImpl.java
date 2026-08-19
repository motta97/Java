package Lab8;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {
public RemoteServiceImpl() throws RemoteException{
    super();
}
public String sayAnything() throws RemoteException{
    return "Hello world";
}

}



