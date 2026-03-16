package Session2.HW1;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {

    static void main(String[] args) {
        //kiem tra dieu kien
        Predicate<String> checkAdmin = n -> n.equals("Admin");
        System.out.println(checkAdmin.test("Admin"));
        //bien doi kieu du lieu
        Function<String,String> change = n -> "name: "+n;
        System.out.println(change.apply("Changiuoi angry")) ;
        //tieu thu du lieu ,dung de in du lieu
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Changiuoi");

        //cung cap du lieu , dung khi khai bao
        Supplier<String> user = ()-> "Changiuoi";
        System.out.println(user.get());
    }


}
