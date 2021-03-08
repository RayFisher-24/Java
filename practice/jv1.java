class use{
    private String name;
    private int id;

    public use(){
        name = "Arijit";
    }
    
    public use(String myName){
        name = myName;
    }

    public use(String myName, int i){
        name = myName;
        id = i;
    }

    public void setNum(String n){
        this.name = n;
    }
    public String getNum(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    
    
}

public class jv1 { 
    public static void main(String args[]) { 
        System.out.println("jv1");
        use u = new use("arijit", 100);
        
      /*  //Private
        u.setNum("Arijit");
        System.out.println("My name is " + u.getNum());

        //protected
        u.sub = "java";
        System.out.println("I Learn " + u.sub);*/

        System.out.println("My name is " +u.getNum());
        System.out.println("The id is "+u.getId());



    }
}