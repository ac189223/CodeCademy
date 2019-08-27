package _03_ObjectOrientedJava;

public class _06_Window {
    boolean isOpen;
    int height;
    int width;

    public _06_Window(boolean open, int windowHeight, int windowWidth) {
        isOpen = open;
        height = windowHeight;
        width = windowWidth;
    }

    public static void main(String[] args) {
        _06_Window bedroomWindow = new _06_Window(true, 87, 120);
        _06_Window hallWindow = new _06_Window(false, 150, 200);
        _06_Window toiletWindow = new _06_Window(true, 40, 40);
    }
}
