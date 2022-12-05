
package aos_prj_2;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * 
 */
public interface HelloClient extends Remote{
 public byte[] downloadFile(String fileName) throws
   RemoteException;
}
