package main.java._6.클래스;

public class Member {

    String name;
    String id;
    String password;
    int age;

    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public boolean login(String id, String password) {
        if (id == "hong" && password == "12345") {
            return true;
        }else{
            return false;
        }
    };

    public void logout(String id) {
        System.out.println(id + " 가 로그아웃 되었습니다.");
    }


}
