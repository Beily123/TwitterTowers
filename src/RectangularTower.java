public class RectangularTower extends Tower{
    public RectangularTower(double height,double width){
        super(height, width);
    }

    //פונקציה לחישוב היקף
    public double calcPerimeter(){
        return (super.getHeight()*2)+(super.getWidth()*2);
    }

    //פונקציה לחישוב שטח
    public double calcArea(){
        return (super.getHeight()*super.getWidth());
    }

    //פונקציה המדפיסה שטח או היקף לפי תנאי
    public void print(){
      if(getHeight()==getWidth()||Math.abs(getHeight()-getWidth())>5){
          double area=calcArea();
          System.out.println();
          System.out.println("שטח המלבן הוא: "+area);
      }
      else{
          double perimeter=calcPerimeter();
          System.out.println("היקף המלבן הוא: "+perimeter);
      }
    }
}
