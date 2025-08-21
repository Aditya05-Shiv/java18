public class CollegeStudent1 extends Student1{
    public int rollNo;

    public CollegeStudent1(String address, int rollNo) {
        super(address);
        this.rollNo = rollNo;
    }
    public void show_rollNo(){
        System.out.println("Roll No is "+rollNo);
    }
}
