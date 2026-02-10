//invoker
package BehavioralDesignPatterns.CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
    private List<TextFileOperation> opsList;
    TextFileOperation textFileOperation;

    public TextFileOperationExecutor() {
        this.opsList = new ArrayList<>();
    }

    public void setTextFileOperation(TextFileOperation textFileOperation){
        this.textFileOperation = textFileOperation;
        opsList.add(textFileOperation);
    }
    public void executeOperation(){
        textFileOperation.execute();
    }
}
