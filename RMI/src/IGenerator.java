
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGenerator extends Remote{
    public ICalculator ownServer() throws RemoteException;
}