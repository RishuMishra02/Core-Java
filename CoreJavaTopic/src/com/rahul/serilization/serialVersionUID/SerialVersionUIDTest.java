package com.rahul.serilization.serialVersionUID;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialVersionUIDTest implements Externalizable {
	  public static final String fileName="Serial.ser";
	  public static final Long serialVersionUID=2L;
	  
  public static void main(String args[]) throws IOException, ClassNotFoundException {
    Lion leo = new Lion("roar");
    // serialize

   /* System.out.println("Serialization done.");
    FileOutputStream fos = new FileOutputStream(fileName);
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(leo);
*/
    // deserialize
    
    FileInputStream fis = new FileInputStream(fileName);
    ObjectInputStream ois = new ObjectInputStream(fis);
    Lion deserializedObj = (Lion) ois.readObject();
    System.out.println("DeSerialization done. Lion: " + deserializedObj.getSound());
  }

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	
}

@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	
}
}