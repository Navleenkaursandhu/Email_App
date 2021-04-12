public class EmailMain {
    public static void main(String[] args) {
        EmailNew obj0 = new EmailNew("Navleen", "Sandhu");
        System.out.println(obj0);
        obj0.department();

        System.out.println("Password: " + obj0 .randomPassword(10));

        System.out.println("Email: " + obj0.email());
        System.out.println("Mail Box Capacity: " + obj0.setMailBoxCapacity(500) + "mb");

    }
}
