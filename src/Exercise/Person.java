package Exercise;

public class Person {
   /* private String name;
    private byte age;
    private String gender;
    private String address;*/

    public String name;
    public byte age;
    public String gender;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name +
                " is a man aged " +
                age +
                " who lives at " +
                address + ". ";
    }
}
