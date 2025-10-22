package fbdemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FBDatabase animal = new FBDatabase();

        System.out.println("Enter your choice 1 -> singup 2 -> login");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                signup(animal, scanner);
                break;
            case 2:
                login(animal);
                break;
            default:
                System.out.println("no slection");
        }


        System.out.println(animal.users);

        System.out.println(animal.users);
    }


    static void signup (FBDatabase FBDatabase, Scanner suraj){
        System.out.println("Enter username");

        String username =  suraj.nextLine();
        FBDatabase.signup(username);
    }

    static void login(FBDatabase FBDatabase){
        FBDatabase.login();
    }
}
