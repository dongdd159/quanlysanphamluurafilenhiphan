import java.io.*;
import java.util.*;
public class WriteAndReadFile {
    public static List<Product> readDataFromFile(String path) throws IOException, ClassNotFoundException{
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
        if (file.length()>0){
            List<Product> productList;
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();
            productList = (List<Product>) object;
            fis.close();
            ois.close();
            return productList;
        }
        return new ArrayList<>();
    }
    public static void writeObjectList(List<Product> productList, String path) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productList);
        objectOutputStream.close();
        fileOutputStream.close();
    }
    public static void writeObject(Product product, String path)throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
