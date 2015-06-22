package com.clouway.inputOutput.task6;

import java.io.*;

/**
 * Created by clouway on 15-6-17.
 */
public class DataClass {
    public void saveObject(OutputStream out, Object o){
        OutputStream outIn=out;
        try {
            ObjectOutputStream outputObject = new ObjectOutputStream(outIn);
            outputObject.writeObject(o);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public Object getObject(InputStream in){
        InputStream input=in;
        Object object=null;
        try
        {
            ObjectInputStream inputObject = new ObjectInputStream(input);
            object= inputObject.readObject();
            in.close();
        }catch(IOException i)
        {
            i.printStackTrace();
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        return object;
    }
}
