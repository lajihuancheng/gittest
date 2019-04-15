/**
 * Description
 * ProjectName git33
 * Created by liubo on 2019/4/15 10:06.
 * Version 1.0
 */

/**
 *
 * @刘波
 * @create 2019-04-15 10:06
 **/
public class User {
    String age;
    String name;
    String  num;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public User() {
    }

    public User(String age, String name, String num) {
        this.age = age;
        this.name = name;
        this.num = num;
    }
}
