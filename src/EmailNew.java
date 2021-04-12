import java.util.Locale;
import java.util.Scanner;

public class EmailNew {

        private String firstName;
        private String lastName;
        private String password;
        private int mailBoxCapacity;
        private String alternateEmail;




        //constructor

        public EmailNew(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

        }


        // method for department selection

        public void department(){
            System.out.println("1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
            System.out.println("Enter department number: ");
            Scanner input = new Scanner(System.in);
            int val = input.nextInt();
            switch(val){

                case 1: {
                    System.out.println("Sales");
                }break;
                case 2:{
                    System.out.println("Development");
                }break;
                case 3:{
                    System.out.println("Accounting");
                }break;
                default:{
                    System.out.println(" None");
                }
            }

        }

        //random password generation
        public String randomPassword(int length){
            String password = "ABCDEFGHIJKLMNOP24610934@#%*";
            char [] arr = new char[length];
            for(int i=0;i<length; i++){
                int random = (int) (Math.random()*password.length());
                arr[i] = password.charAt(random);
            }

            return new String((arr));
        }


        //email generation
    public String email(){
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"  + "Softwizz.com";
        }

        //set the mail box capacity
    public int setMailBoxCapacity(int capacity){
            this.mailBoxCapacity = capacity;
            return mailBoxCapacity;

    }


    @Override
    public String toString() {
        return "FirstName= " + firstName  +
                ",LastName= " + lastName;
    }
}


