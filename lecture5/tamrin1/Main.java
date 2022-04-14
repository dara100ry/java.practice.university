package tamrin1;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String UserName;
        String name;
        String passWord;
        byte age;
        String address;
        int phoneNumber;
        String academics;
    
        System.out.println("Enter Username:");
        UserName = sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Password:");
        passWord = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextByte();
        System.out.println("Enter Address:");
        address = sc.nextLine();
        System.out.println("Enter phone number:");
        phoneNumber = sc.nextInt();
        System.out.println("Enter academisc:");
        academics = sc.nextLine();

        User user = new Builder().setUsername("dara100ry").setName("dara").setPassWord("passWord").setAge(18).setAddress("tehran").setPhoneNumber(9120000).setAcademics("diplom").makeUser();
        System.out.println(user.getUserName());
        System.out.println(user.getName());
        System.out.println(user.getPassWord());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getPhoneNumber());
        System.out.println(user.getAcademics());
    }
    }
}
