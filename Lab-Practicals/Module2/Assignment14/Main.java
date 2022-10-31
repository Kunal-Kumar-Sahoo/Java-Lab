interface Rectangle {
    void drawRectangle();
}

interface Circle {
    void drawCircle();
}

class Main implements Rectangle, Circle {
    public void drawRectangle() {
        System.out.println("Drawing rectangle");
    }

    public void drawCircle() {
        System.out.println("Drawing circle");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.drawRectangle();
        m.drawCircle();
    }
}