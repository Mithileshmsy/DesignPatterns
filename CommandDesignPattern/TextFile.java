//receiver
package CommandDesignPattern;

public class TextFile {
    private String fileName;
    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    //receiver methods
    public void open(){
        System.out.println("Opening "+fileName);
    }
    public void save(){
        System.out.println("Saving "+fileName);
    }

}
