import java.io.*;
import java.util.*;
public class ProductMangeTest {
    public static void main(String[] args) throws IOException {
        List<Product> productList =null;
        try {
            productList = WriteAndReadFile.readDataFromFile("product.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ProductManage productManage = new ProductManage(productList);
        productManage.addProduct(new Product(1,"dgccv","weccv",22.78,"dgveee"));
        productManage.addProduct(new Product(2,"bfdbdf","efvvv",29.95,"vsdvsdv"));
        productManage.addProduct(new Product(3,"redgdrfgv","fffffdss",86.95,"vrdv"));
        productManage.addProduct(new Product(4,"rffff","efvvv",85.95,"vsdvsdv"));
        productManage.addProduct(new Product(5,"rrevv","efvvv",55.95,"vsdvsdv"));
        System.out.println(productManage.getProduct("bfdbdf"));
    }
}
