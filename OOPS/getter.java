
public class getter{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setSize(5);
        System.out.println(p1.size);
    }
}

class pen {
    String color;
    int size;
    void setColor(String newcolor){
        color = newcolor;
    }
    void setSize(int newsize){
        size = newsize;
    }
}
