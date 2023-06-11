class room{
    public int roomNo;
    public String roomType;
    public double roomArea;
    public int ACmachine;

    public void setData(int roomNo, String roomType, double roomArea, int ACmachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.ACmachine = ACmachine;
    }

    public void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " sq. ft.");
        System.out.println("AC Machine: " + ACmachine);
    }

}
public class Q11 {
    public static void main(String[] args) {
        room obj = new room();
        obj.setData(1,"single",22,2);
        obj.displayData();

    }

}
