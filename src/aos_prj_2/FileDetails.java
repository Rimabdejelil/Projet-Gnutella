package aos_prj_2;


import java.io.Serializable;
import java.util.ArrayList;

public class FileDetails implements Serializable
{

        String peerId;
	    String FileName;
        String portNumber;
        String SourceDirectoryName;
        String messageID;
        Integer timeToLive;
        ArrayList<String>files= new ArrayList<String>();

}

