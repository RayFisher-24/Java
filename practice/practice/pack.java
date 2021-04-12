import com.company.*;

class usingPack extends practice{
    void meth2(){
        System.out.println(a);
    }
}

public class pack { 
    public static void main(String args[]) { 
        System.out.println("hello");
        usingPack u = new usingPack();
        u.meth2();
    }
}

