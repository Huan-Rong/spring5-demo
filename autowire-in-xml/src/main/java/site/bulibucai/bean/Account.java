package site.bulibucai.bean;

public class Account {

    private String name;
    private User user;

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
