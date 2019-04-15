import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        User user = new User("1","10","100");
        User user5 = new User("1","10","104");
        User user1 = new User("1","11","101");
        User user2 = new User("2","12","102");
        User user3 = new User("2","13","103");
        User user6 = new User("2","13","105");
        users.add(user);
        users.add(user1);
        /*users.add(user2);
        users.add(user3);
        users.add(user5);
        users.add(user6);*/
        List<User> collect1 = users.stream().filter(User -> "1".equals(User.getAge())).collect(Collectors.toList());

        long count = users.stream().filter(User -> "1".equals(User.getAge())&&"100".equals(User.getNum())).count();
        System.out.println(collect1);
    }


    public  void setName(){
        System.out.println();
        System.out.println("2323");
    }
}
