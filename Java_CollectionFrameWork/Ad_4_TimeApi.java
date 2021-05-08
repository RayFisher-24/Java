import java.util.*;
import java.time.*;

public class Ad_4_TimeApi{
    public static void main(String args[]) {

        //Calendar class refence object 
        //Calendar c = Calendar.getInstance();
       // System.out.println(c.getTime());

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //Clock c = Clock.now();
        System.out.println(System.currentTimeMillis());
    }
}