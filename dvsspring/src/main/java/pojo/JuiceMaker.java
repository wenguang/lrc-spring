package pojo;

public class JuiceMaker {
    private Source source;

    public Source getSource() {
        return this.source;
    }
    public void setSource(Source source) {
        this.source = source;
    }

    public String makeJuice() {
        String juice = "xxx用户点了一杯" + source.getFruit() + source.getSugar() + source.getSize();
        return juice;
    }
}
