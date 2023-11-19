public class Rectangle {
    short length ;

    short width ;

    //method to give the perimeter of the rectangle:
    void perimeter(){
        System.out.println("the area of the rectangle is: "+(length + width)*2) ;
    }


    //method to give the area of the rectangle:
    void area(){
        System.out.println("the perimeter of the rectangle is: "+(length + width )) ;

    }


    //method to check it is a square or not:
    void is_square(){
        if (length == width){
            System.out.println("it's a square");
        } else {
            System.out.println("it's not a square");
        }
    }

    //Method to view the rectangle:
    void info(){
        System.out.println("length of the rectangle is :"+length );
        System.out.println("width of the rectangle is:"+width);
    }

}
