import java.util.ArrayList;
import java.util.HashMap;

public class CarService {
public static void main(String[] args) {
	Car c1=new Car(1,"Nano","Tata",1000);
	Car c2=new Car(2,"Batmobile","Wayne",10000000);
	Car c3=new Car(3,"i10","Hyundai",1000);
	Car c4=new Car(4,"City","Honda",10000000);
	Showroom s1=new Showroom();
	Showroom s2=new Showroom();
	ArrayList<Car> temp=new ArrayList<Car>();
	temp.add(c1);
	temp.add(c2);
	
	s1.setName("Ashok Leyland");
	s1.setCars(temp);
	
	ArrayList<Car> temp1=new ArrayList<Car>();
	temp1.add(c3);
	temp1.add(c4);
	
	s2.setName("Marvel");
	s2.setCars(temp1);
	HashMap<String, ArrayList<Car>> hm=new HashMap<String, ArrayList<Car>>();
	hm.put(s1.name, s1.getCars());
	hm.put(s2.name, s2.getCars());
	
	ArrayList<Car> w=hm.get("Marvel");
	for(Car q:w)
	{
		System.out.println(q.modelNo +" "+ q.name +" "+ q.make+ " "+q.price);
	}
	
}
}
