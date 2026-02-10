//The Command Pattern is a Behavioral pattern that
// turns a request into a stand-alone object.
// This object contains all the information about the request like
// the method to call,
// the arguments,
// and the object that performs the work.

package CommandDesignPattern;

public class CommandApp {
    public static void main(String[] args) {
        TextFileOperationExecutor invoker = new TextFileOperationExecutor();

        TextFile textFile = new TextFile("file1.txt");
        OpenTextFileOperation openTextFileOperation = new OpenTextFileOperation(textFile);
        //sets open file ops
        invoker.setTextFileOperation(openTextFileOperation);
        invoker.executeOperation();

        //save file ops
        SaveTextFileOperation saveTextFileOperation = new SaveTextFileOperation(textFile);
        invoker.setTextFileOperation(saveTextFileOperation);
        invoker.executeOperation();
    }
}
