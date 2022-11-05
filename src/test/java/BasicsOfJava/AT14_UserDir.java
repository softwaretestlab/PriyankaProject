package BasicsOfJava;

import org.junit.Test;

public class AT14_UserDir {

    @Test
    public void UserDIrLearn(){

        //harcoding of user --softw , this hardcoded path will work only in softw machine
       String myPath= "C:\\Users\\softw\\IdeaProjects\\PriyankaProject01\\src\\main\\java\\PropertiesFile\\PriyankaProjectPropertiesFile.properties";
    //we need dynamic path
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.dir"+"\\src\\main\\java\\PropertiesFile\\PriyankaProjectPropertiesFile.properties"));
    }
}
