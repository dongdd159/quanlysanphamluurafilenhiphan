import java.io.*;
import java.util.*;
public class ProductManage implements Serializable {
    List<Product> productList;
    public ProductManage(List<Product> productList) {
        this.productList = productList;
    }
    public void addProduct(Product product) throws IOException {
        productList.add(product);
        WriteAndReadFile.writeObjectList(productList,"product.txt");
    }
    @Override
    public String toString() {
        return "ProductManage{" +
                "productList=" + productList +
                '}';
    }
    public Product getProduct(String name) throws IOException {
        for (Product temp:productList) {
            if (temp.getName()==name){
                WriteAndReadFile.writeObject(temp,"searching.txt");
                return temp;
            }
        }
        WriteAndReadFile.writeObject(null,"searching.txt");
        return null;
    }
}
