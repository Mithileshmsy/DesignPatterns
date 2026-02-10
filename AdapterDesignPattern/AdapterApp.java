package AdapterDesignPattern;

public class AdapterApp {
    public static void main(String[] args) {
        String jsonData = "{'name':'MSY'}";
        JsonReader jsonReader = new XmlToJsonAdapter();
        jsonReader.readJson(jsonData);
    }
}
