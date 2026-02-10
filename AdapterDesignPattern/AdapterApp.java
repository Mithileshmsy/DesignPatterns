//The Adapter Pattern is used when you want
// to make two incompatible interfaces work together.
// It acts like a bridge or a connector between
// two classes that otherwise cannot communicate.

package AdapterDesignPattern;

public class AdapterApp {
    public static void main(String[] args) {
        String jsonData = "{'name':'MSY'}";
        JsonReader jsonReader = new XmlToJsonAdapter();
        jsonReader.readJson(jsonData);
    }
}
