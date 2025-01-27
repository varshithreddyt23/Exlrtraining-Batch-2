import java.util.Scanner;
public class demo009{
        Scanner scanner= new Scanner(System.in);
        String customername(){
            System.out.println("Enter the name:");
            String name=scanner.next();
            return name;
        }
        String accno(){
            System.out.println("Acc no:");
            String accno=scanner.next();
            return accno;
        }
        String balance(){
            System.out.println("Balance amount:");
            String bal=scanner.next();
            return bal;
        }
        public static void main(String[] args) {
            demo009 ob=new demo009();
            String name=ob.customername();
            String accno=ob.accno();
            String bal=ob.balance();
            System.out.println("The name of the customer:"+name);
            System.out.println("The accno provided:"+accno);
            System.out.println("The balance amount is:"+bal);
        }
}
