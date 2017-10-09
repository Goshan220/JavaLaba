package copy;/*
 *POJO
 */

public class Monoblock implements ICopyable {

    private String model;
    private String diag;
    private String color;
    private boolean webcam;

    Monoblock(String p1, String p2, String p3, boolean p4) {
        this.model = p1;
        this.color = p2;
        this.diag = p3;
        this.webcam = p4;
    }

    @Override
    public String toString() {
        return "Monoblock{" +
                "model='" + model + '\'' +
                ", diag='" + diag + '\'' +
                ", color='" + color + '\'' +
                ", webcam=" + webcam +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public Monoblock copy() {

        return new Monoblock(model, color, diag, webcam);
    }

}
