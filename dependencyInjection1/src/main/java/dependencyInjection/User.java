package dependencyInjection;

public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
     public void showDetails(){
         System.out.println("Name: "+name);
     }
}
