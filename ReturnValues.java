public class ReturnValues {
    public static void main(String[] args) {

        System.out.println(measureRectangle(4.3, 8.4, "perimeter")); 
        System.out.println(measureRectangle(3.2, 4.1, "area"));

        

        
    }
    /**
     * Function name: measureRectangle
     * @param length (double)
     * @param width (double)
     * @param calculation (String)
     * @return (String)
     * Inside The Function:
     * 1. two double variables store both the area and perimeter respectively 
     * 2. If else statement ensures length and width are not negative 
     * 3. If - Switch statement takes calculation argument
     * 4. returns the area, perimeter or error message depending on argument
     * 5. Else - return error message  
     */

    public static String measureRectangle(double length, double width, String calculation) {
        double area = ( length * width);
        double perimeter = 2*(length+width);

        if (length > 0 && width > 0){
            switch(calculation){
                case "area":
                return ("The area for a rectangle with a length of " + length + " and a width of " + width + " is " + area +"\n");
                case "perimeter":
                return ("The perimeter for a rectangle with a length of " + length + " and a width of " + width + " is " + perimeter +"\n");
                default:
                return ("That was a invalid choice");
            }

        }else {
            return ("Sorry , the calculation was not permitted");

        }

        



        };
        

        
        
        
    }





