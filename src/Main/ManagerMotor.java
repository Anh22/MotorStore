package Main;

import sun.security.rsa.MGF1;

import java.util.ArrayList;
import java.util.stream.Collector;

public class ManagerMotor {
    private ArrayList<Motor>motors;
    public ManagerMotor(ArrayList<Motor>motors){
        this.motors=motors;
    }
    public ManagerMotor(){
        this.motors=new ArrayList<Motor>();
    }
    public void addMotor(Motor mt){
        this.motors.add(mt);
    }
    public void showManager(){
        for (Motor motor:motors
             ) {
            System.out.println(motor);

        }
    }
    public void edit (int id,Motor motor){
        int index =-1;
        for (int i = 0; i < this.motors.size(); i++) {
            if (id==this.motors.get(i).getId()){
                index=1;
            }

        }
        this.motors.set(index,motor);
    }
    public void deteteMOtor(String hoTen){
        int index =-1;
        for (int i = 0; i < this.motors.size(); i++) {
            if (hoTen==this.motors.get(i).getName()){
                index=i;
            }

        }
        this.motors.remove(index);
    }
    public void findAll(String name){
        for (int i = 0; i < this.motors.size(); i++) {
            if (this.motors.get(i).getName().equals(name)) {
                System.out.println(this.motors.get(i));
            }

        }
    }
   public void findPrice(int price){
       for (int i = 0; i < this.motors.size(); i++) {
           if (this.motors.get(i).getPrice()==price){
               System.out.println(this.motors.size());
           }

       }
       System.out.println("Not Found");

   }
   public void sortDownCc(){
       motors.sort((m1, m2) -> Integer.compare((int) m1.getCc(), (int) m2.getCc()));
       System.out.println(motors);
   }
   public void sortUpCc(){
       motors.sort((m1, m2) -> Integer.compare((int) m2.getCc(), (int) m1.getCc()));
       System.out.println(motors);
   }

}

