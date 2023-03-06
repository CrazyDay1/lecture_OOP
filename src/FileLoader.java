import java.util.*;
import java.io.*;
public class FileLoader {
    String file;
    FileLoader(String link){
        this.file = link;
    }

    public String[] load(){
        ArrayList<String> buffer = new ArrayList<String>(); String data;

        try { // try block
            File myObj = new File(this.file);
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> adds = new ArrayList<String>();

            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                adds.add(data);
            }
            /*for(int i =0;i<adds.size();i++){
                System.out.println(adds.get(i));

            }
            System.out.println(adds);*/

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String[] array = buffer.toArray(new String[buffer.size()]);

        return array;
    }
}
