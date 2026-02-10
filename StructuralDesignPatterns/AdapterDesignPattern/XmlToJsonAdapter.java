package StructuralDesignPatterns.AdapterDesignPattern;

public class XmlToJsonAdapter implements JsonReader{
    //1.legacy or third party class which need to inject
    private XMLService xmlService;

    public XmlToJsonAdapter() {
        this.xmlService = new XMLService();
    }

    @Override
    public void readJson(String json) {
        //logic to convert json data to xml(dummy implementation)
        String convertedXmlData = "<xml>"+json+"</xml>";
        xmlService.readXml(convertedXmlData);
    }

}
