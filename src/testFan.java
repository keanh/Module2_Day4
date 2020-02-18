public class testFan {
    public static void main(String[] args) {
        fan Fan1 = new fan(true,fan.Fast,10,"yellow");
        System.out.println(Fan1.getSpeed());
        System.out.println(Fan1.getRadius());
        System.out.println(Fan1.getColor());
        Fan1.checkStatus();

        fan Fan2 = new fan(false,fan.Medium,5,"blue");
        System.out.println(Fan2.getSpeed());
        System.out.println(Fan2.getRadius());
        System.out.println(Fan2.getColor());
        Fan2.checkStatus();
    }
}
