//Concrete Commands
package CommandDesignPattern;

public class OpenTextFileOperation implements TextFileOperation{
    private final TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
       textFile.open();
    }
}
