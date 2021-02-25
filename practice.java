interface TVremote{
    void remote();
}

interface smartTVremote{
    void smartRemote();
    int fuck();
}

class TV implements TVremote, smartTVremote{
    public void remote(){
        System.out.println("Remote...");
    }
    public void smartRemote(){
        System.out.println("Smart Remote...");
    }
    public int fuck(int f){
        return f;
    }
}

public class practice { 
    public static void main(String args[]) {
        TVremote t = new TV();
        t.remote(); //right
        //t.smartRemote(); error
        
    }
}
