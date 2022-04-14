package tamrin1;

public class User {
        private String userName;
        private String name;
        private String passWord;
        private byte age;
        private String address;
        private int phoneNumber;
        private String academics;

        public String getUserName() {
            return userName;
        }
        public String getName() {
            return name;
        }
        public String getPassWord() {
            return passWord;
        }
        public byte getAge() {
            return age;
        }
        public String getAddress() {
            return address;
        }
        public int getPhoneNumber() {
            return phoneNumber;
        }
        public String getAcademics() {
            return academics;
        }
        public User(String Ausername, String Aname, String Apassword, byte Aage, String Aaddress, int AphoneNumber, String Aacademics) {
            userName = Ausername;
            name = Aname;
            passWord = Apassword;
            age = Aage;
            address = Aaddress;
            phoneNumber = AphoneNumber;
            academics = Aacademics;
        }
        public User(){}
}
