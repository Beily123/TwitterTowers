public class TriangleTower extends Tower {
    public TriangleTower(double height, double width) {
        super(height, width);
    }

    //חישוב הצלעות של המשולש באמצעות משפט פיתגורס
    public double calcSide() {
        double temp = Math.pow(getWidth() / 2, 2) + Math.pow(getHeight(), 2);
        return Math.sqrt(temp);
    }

    //חישוב היקף משולש
    public double calcPerimeter() {
        double side = calcSide();
        return side * 2 + getWidth();
    }

    public void print() {
        if (getWidth() % 2 == 0 || getWidth() > getHeight() * 2) {
            System.out.println("לא ניתן להדפיס את המשולש");
        }
        //טיפול במקרה שהגובה הוא 2 נדפיס רק שורה עליונה עם כוכבית אחת
        //ושורה תחתונה עם מספר כוכביות כרוחב שהתקבל כפרמטר
        //הרוחב שהתקבל  הינו 1/3
        else if (getHeight()==2) {
            //מספר הרווחים לפני הדפסת הכוכבית בשורה העליונה
            int space=(int) getWidth()/2;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            for (int i = 0; i < getWidth(); i++) {
                System.out.print("*");
            }
        }
        //טיפול במקרה שהרוחב הוא 3 נדפיס בשורה העליונה כוכבית אחת
        //ושאר השורות לפי הגובה שהתקבל כפרמטר נדפיס 3 כוכביות
        else if (getWidth()==3) {
            System.out.println(" *");
            for (int i = 0; i < getHeight()-1; i++) {
                System.out.println("***");
            }
        } else {
            //משתנה המכיל את מספר השורות בעלי רוחב שונה מלבד השורה הראשונה והאחרונה במשולש
            int numRowsWithDifferentWidths = (int) (getWidth()) / 2 -1;
            //משתנה המכיל את מספר השורות בעלי אותו רוחב מלבד השורה הראשונה והאחרונה במשולש
            int numRowsWithSameWidths = ((int) (getHeight()) - 2) / numRowsWithDifferentWidths;
            //משתנה המכיל את שארית החלוקה שתתווסף לקבוצת השורות העליונה
            int mod = ((int) (getHeight()) - 2) % numRowsWithDifferentWidths;
            //הדפסת הרווחים לפני הכוכב הראשון
            for (int i = 0; i < (int)getWidth()/2; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            if (getWidth() > 3) {
                //לולאה שרצה על רוחבו של המשולש בקפיצות של מספרים אי-זוגיים
                for (int i = 3; i < getWidth(); i += 2) {
                    //לולאה שרצה על מספר השורות של כל קבוצה בעלי אותו רוחב
                    for (int j = 0; j < numRowsWithSameWidths + mod; j++) {
                        //המיקום בו מתחילה השורה הנוכחית
                        int place=(int)getWidth()/2-i/2;
                        //הדפסת השורה הנוכחית לפי הרוחב שחושב
                        for (int k = 0; k < place+i; k++) {
                            if (k<place){
                                System.out.print(" ");
                            }
                            else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    if (i == 3) {
                        mod = 0;
                    }
                }
            }
            //הדפסת השורה הנמוכה בעלת הרוחב של המשולש
            for (int i = 0; i < getWidth(); i++) {
                System.out.print("*");
            }
        }
    }
}
