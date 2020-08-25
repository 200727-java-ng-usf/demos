import java.io.*;
import java.util.*;



public class MavenDriver {
    public static void main(String[] args) {



//        List<Integer> IntegerList = new ArrayList<>();
//        IntegerList = Arrays.asList(1,2,3,4,5,6,7);
//        IntegerList.forEach(System.out::println);
//
//        HashSet<Integer> IntegerSet = new HashSet<>();
//        IntegerSet.add(1);
//        IntegerSet.add(2);
//        IntegerSet.forEach(System.out::println);
//
//        HashMap<Integer,String> number = new HashMap<>();
//        number.put(1,"one");
//        number.put(2,"two");
//
//        System.out.println(number.entrySet());
//        System.out.println(number.values());

        File file = new File("src/main/resources/new.txt");


//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            fileWriter.write("Today is Sunday!\n");
//            fileWriter.write("I am coding now");
//
//            fileWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread mY = new Thread(() -> System.out.println(Thread.currentThread().getName() + " " + "this is a new Thread"));


    }
}
