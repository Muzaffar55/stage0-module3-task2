package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private int age;
    private int phoneNumber;

    void callToFriend() {
        age = ADULT_AGE;
    }

    void callByNumber(int number) {
        number = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
