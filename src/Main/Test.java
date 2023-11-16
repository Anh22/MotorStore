package Main;

import javax.sound.midi.Soundbank;
import javax.xml.ws.soap.Addressing;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Test {

    ManagerMotor managerMotor = new ManagerMotor();
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        int choice;
        do {
            System.out.println("-------Motor Store---------\n"+
                    "1 .Add New Motor\n"+
                    "2. Show All Products\n"+
                    "3. Seach\n"+
                    "4. Remove prroduct by id\n"+
                    "5. Sort product\n"+
                    "0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            if(choice==1){
                addMenu();

            } else if (choice==2) {
                managerMotor.showManager();

            } else if (choice==3) {
                seacc();

            } else if (choice==4) {
                System.out.print("Enter Id: ");
                String  removeId = scanner.nextLine();
                managerMotor.deteteMOtor(removeId);
                System.out.println("Remove Success");
                break;
                
            } else if (choice==5) {
                sortMenu();

                
            }


        }while (choice!=0);
    }
    private void addMenu(){
        System.out.println("Product Information: ");
        System.out.println("id");
        int ii = scanner.nextInt();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price: ");
        int price = scanner.nextInt();
        System.out.println("Enter Cylinder Capacity: ");
        int cc = scanner.nextInt();
        Motor newMotor = new Motor(ii,name,price,cc);
        managerMotor.addMotor(newMotor);
        System.out.println(newMotor);
        System.out.println("Add Success");
    }

    public void seachMenu(){
        int choice;
        do {
            System.out.println("-----Seach-----\n"+
                    "1. Seach By Peice\n"+
                    "2. Seach by Name\n"+
                    "3. Exit");
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            if (choice==1){
                System.out.println("Enter Id:" );
                int price = scanner.nextInt();
                managerMotor.findPrice(price);
                System.out.println(price);
                System.out.println("Find Success");
            } else if (choice==2) {
                System.out.println("Enter name");
                String name = scanner.nextLine();
                managerMotor.findAll(name);
                System.out.println("Find Success");

            }

        }while (choice!=0);
    }
    private void seacc(){

    }
    private  void sortMenu(){

    }
}
