
// import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeConcurrentCollection {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("java");
        list.add("python");
        list.add("javascript");
        list.add("nodejs");
        list.add("reactjs");
        list.add("nextjs");
        Runnable t1 = () -> {
            for (String str : list) {
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        // both way we can make thread
        // Runnable t2=new Runnable(){
        //     @Override
        //     public void run(){
        //            list.add("hello");
        //     list.add("hi");
        //     }
        // };
        // creating thread using lamda
        Runnable t2 = () -> {
            list.add("hello");
            list.add("hi");
        };
           
        // starting thread
        new Thread(t2).start();
        new Thread(t1).start();

    }
}
// ******OUTPUT*********
// java
// python
// javascript
// nodejs
// reactjs
// nextjs
// hello
// hi
// *********************

