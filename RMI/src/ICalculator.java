
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
        
        public double ad(double x) throws RemoteException;
        public double sc(double x) throws RemoteException;
        public double in(double x) throws RemoteException;
        public double im(double x) throws RemoteException;
        public double pow(double x) throws RemoteException;
        public double sqrt(double x) throws RemoteException;
        public double fact(double x) throws RemoteException;
        public double rev(double x) throws RemoteException;
        public void setVal(double x) throws RemoteException;
        public void adm(double x) throws RemoteException;
        public void scm(double x) throws RemoteException;
        public void clm() throws RemoteException;
        public double rdm() throws RemoteException;
    }
