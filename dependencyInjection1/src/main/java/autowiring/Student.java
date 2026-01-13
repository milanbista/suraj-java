package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    @Autowired
    @Qualifier("address2")
    private Address address;

//    Student(){
//
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public void showDetails(){
        if (address != null) {
            System.out.println(address.getStreetAddress());
            System.out.println(address.getState());
        } else {
            System.out.println("Object not created!!");
        }
        }
}
