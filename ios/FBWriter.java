package ios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FBWriter {
    public static void main(String[] args) throws IOException {
        //
        User u1 = new User("milan", "pass");
        User u2 = new User("suraj", "pass");
        List<User> users = new ArrayList<>();
        FileReader reader = new FileReader("users.txt");
        int ch;
        String info="";
        while ((ch = reader.read()) != -1){
            info+=(char) ch;
        }
        System.out.println(info);
        String[] parts = info.split(";");
        System.out.println(parts.length);

        for (int i = 0; i< parts.length ; i=i+2){
            User u = new User(parts[i], parts[i+1]);
            users.add(u);
        }

        System.out.println(users.size());



//        FileWriter writer = new FileWriter("users.txt", true);
//        //signup
//        writer.write(u1.username + " " + u1.password + "\n");
//        writer.write(u2.username + " " + u2.password);
//        writer.close();
//
//        //scanner press 1

    }
}

//
class User{
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
