package main.java._10.예외처리;

public class LoginExam {
    public static void main(String[] args) {
        try {
            login("white", "12344");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException  {
        //id가 blue가 아니라면 NotExistIDException 발생
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");

        }

        //password가 "!2345"가 아니라면 WrongPasswordException발생
        if (!password.equals("12345")) {
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
