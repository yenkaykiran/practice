package yuown.designpatterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonTest {

    public static void main(String[] args) throws Exception {
        Ton one = Ton.getInstance();
        System.out.println("1: " + one);
        writeObject(one, "output.txt");

        Ton two = (Ton) readObject("output.txt");
        System.out.println("2: " + two);

        Hack h = new Hack();
        h.setObj(Ton.getInstance());
        writeObject(h, "hack.txt");

        System.out.println("3:" + h.getObj());
        System.out.println("4:" + ((Hack) readObject("hack.txt")).getObj());
    }

    public static Object readObject(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream f1 = new FileInputStream(new File(fileName));
        ObjectInputStream ist = new ObjectInputStream(f1);
        return ist.readObject();
    }

    public static void writeObject(Object one, String fileName) throws FileNotFoundException, IOException {
        FileOutputStream f = new FileOutputStream(new File(fileName));
        ObjectOutputStream ost = new ObjectOutputStream(f);
        ost.writeObject(one);
    }
}

class Hack implements Serializable {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}

class Ton implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1586620828491570274L;

    private int val;

    private static Ton self = new Ton(1);

    private Ton(int v) {
        this.val = v;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static Ton getInstance() {
        return self;
    }

    public Object readResolve() {
        return self;
    }
}