package com.ehsan.Interfaces;

public class App {

    public static void main(String[] args) {
        Machine mach1 = new Machine(2);
        mach1.showInfo();


        Person person1 = new Person("ehsan");
        person1.showInfo();

        Info info1 = new Machine(22);  // we can do this, because Machine implements the INfo.
        info1.showInfo();
        info1.showIndex();

        Info info2 = person1; //we can do this, because person1 is the reference to the Person OBJ.
        info2.showInfo();

        showInfo(person1);

        /////////////////////////////username and password///////////

        UserInfo user1 = new UserInfo("ehsan@example.com", 123456);
        user1.showUserStatement();

        State state1 = user1;
        state1.showUserStatement();

        showState(user1);


        ///////////example to use 2 Interface in a single Class/////////
        mach1.showUserStatement();  // LOL Java is so funny!

    }
    public static void showInfo(Info info) {
        info.showInfo();
    }

    public static void showState(State state) {
        state.showUserStatement();
    }

}
