package src.prefi;

public class User implements Comparable<User> {
    private String name;
    private int registerYear;
    private String mail;

    public User(String name, int registerYear, String mail) {
        this.name = name;
        this.registerYear = registerYear;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", registerYear=" + registerYear + ", mail='" + mail + '\'' + '}';
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegisterYear() {
        return registerYear;
    }

    public void setRegisterYear(int registerYear) {
        this.registerYear = registerYear;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
