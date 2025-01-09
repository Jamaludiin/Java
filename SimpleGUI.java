public class SimpleGUI {
    private String name;
    private int height;
    private int width;
    private String bgColor;
    private String font;
    private String text;

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return (int) (height * width);
    }

    public void setSize(int height, int width) {
        this.height = height;
        this.width = height;
    }

  

    public String getBgColor() {
        return bgColor;
    }
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getFont() {
        return font;
    }
    public void setFont(String font) {
        this.font = font;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
        gui.setName("My GUI");
        gui.setHeight(500);
        gui.setWidth(800);
        gui.setBgColor("white");
        gui.setFont("Arial");
        gui.setText("Hello, World!");

}


class Button extends SimpleGUI {

    // click method
    public void click() {
        System.out.println("Button clicked!");
    }

    // double click method
    public void doubleClick() {
        System.out.println("Button double clicked!");
    }

}


class Label extends SimpleGUI {

}

class TextField extends SimpleGUI {

}

}

