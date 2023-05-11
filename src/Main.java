import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice=0;
        while (choice!=3){
        System.out.println("to rectangular tower enter 1, to triangle tower enter 2, to exit enter 3");
        choice= in.nextInt();
        double height=0;
        double width=0;
        if (choice!=3) {
            System.out.println("enter the height of the tower");
            height = in.nextInt();
            System.out.println("enter the width of the tower");
            width = in.nextInt();
        }
            if (choice==1){
                    RectangularTower myRectangularTower = new RectangularTower(height, width);
                    myRectangularTower.print();
                }
                if (choice==2){
                    TriangleTower myTriangleTower=new TriangleTower(height,width);
                    System.out.println("to calc the perimeter enter 1, to print the tower enter 2");
                    int myChoice = in.nextInt();
                    if (myChoice==1)
                        System.out.println(myTriangleTower.calcPerimeter());
                    if (myChoice==2)
                            myTriangleTower.print();
                    }
        }
            }
        }