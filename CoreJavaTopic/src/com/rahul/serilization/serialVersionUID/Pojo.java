package com.rahul.serilization.serialVersionUID;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Pojo implements Externalizable{
private int id;
private String name;
private String add;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	out.writeInt(id);
	out.writeUTF(name);
	out.writeUTF(add);
	
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	id=in.readInt();
	name=in.readUTF();
	add=in.readUTF();
}

}
