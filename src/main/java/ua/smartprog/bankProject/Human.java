package ua.smartprog.bankProject;
public class Human {
        private String firstName;
        private String secondName;
        private int age;
        public Human(){
            firstName = "Eric";
            secondName = "Martin";
            age = 30;
        }
        public Human(String fName, String sName, int cAge){
            firstName = fName;
            secondName = sName;
            age = cAge;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName(){
            return secondName;
        }

        public int getAge() {
            return age;
        }
}
