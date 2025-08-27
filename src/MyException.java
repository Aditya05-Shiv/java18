public class MyException {
    public static void main(String[] args) {
        //UserDefinedException udf=new UserDefinedException();
        //try{
        //    udf.validate(12);
        //      udf.validate(19);
        //  } catch (InvalidAgeException e){
        //     System.out.println(e.getMessage());
        // }
        // }
        Bank b=new Bank();
        try{
           // b.withdraw(10000);
            b.withdraw(5000);
        } catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}