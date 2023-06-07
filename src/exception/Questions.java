package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Questions {

    public void m1(){

        try{

            int a=3;
            System.out.println("Printing a:"+a);
            File file= new File("test");
        }

        catch (Exception e){

            System.out.println("Exception occurred :"+e);
        }
        /*catch (SQLException e){
            System.out.println("Exception occurred :"+e);
        }
*/

    }
}
