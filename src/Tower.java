public abstract class Tower {
    private double height;
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>=1) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>=2) {
            this.height = height;
        }
    }

    public Tower(double height,double width){
        this.height=height;
        this.width=width;
    }


}
