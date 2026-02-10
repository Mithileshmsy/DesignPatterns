//Concrete Commands
package CommandDesignPattern;

public class SaveTextFileOperation implements TextFileOperation{
    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
