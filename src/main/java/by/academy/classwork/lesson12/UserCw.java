package by.academy.classwork.lesson12;

public class UserCw {
    private String login;
    private String password;

    public UserCw() {
        super();

    }

    public UserCw(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    public void createQuery() {

//         class Query{
//            public void printToLog(){
//                System.out.println("Пользователь. " );
//                System.out.println("Логин: " + getLogin());
//                System.out.println("Пароль: " + getPasword().substring(0, 4) + "******");
//            }
//        }

        Query user1 = new Query();
        user1.printToLog();
    }

//    public class Query{
//        public void printToLog(){
//            System.out.println("Пользователь. " );
//            System.out.println("Логин: " + getLogin());
//            System.out.println("Пароль: " + getPasword().substring(0, 4) + "******");
//        }
//    }

    public static class Query {
        UserCw user;

        public Query() {
            super();
        }

        public Query(UserCw user) {
            super();
            this.user = user;
        }

        public void printToLog() {
            System.out.println("Пользователь. ");
            System.out.println("Логин: " + user.getLogin());
            System.out.println("Пароль: " + user.getPassword().substring(0, 4) + "******");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String... args) {
        UserCw user = new UserCw("User", "123456789");
        user.createQuery();

        UserCw.Query user1 = new UserCw.Query();
        user1.printToLog();

//        Query a = user.new Query();
//        a.printToLog();
    }
}
