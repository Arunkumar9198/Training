
public class Car {
int modelNo;
String name;
String make;
int price;
public int getModelNo() {
	return modelNo;
}
public void setModelNo(int modelNo) {
	this.modelNo = modelNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMake() {
	return make;
}
public Car(int modelNo, String name, String make, int price) {
	super();
	this.modelNo = modelNo;
	this.name = name;
	this.make = make;
	this.price = price;
}
public void setMake(String make) {
	this.make = make;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}

