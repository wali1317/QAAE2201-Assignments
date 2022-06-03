package Assignment4;

public class TextEditor {
    public TextEditor openTextEditor() {
        TextEditor myTextEditor = new TextEditor();
        return myTextEditor;
    }
    public void writeIntoTextFile(String inputText) {
        System.out.println(inputText);
    }
    public void closeTextEditor() {
        System.out.println("Text Editor is closed");
    }
}
