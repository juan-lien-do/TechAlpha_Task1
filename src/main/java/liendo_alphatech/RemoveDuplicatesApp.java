package liendo_alphatech;

public class RemoveDuplicatesApp
{
    public static void main( String[] args )
    {
        //Launch Controller
        // This app follows the MVC architecture.
        // Model = RDService, View=RDIO (IO stands for input-output), Controller=RDController
        new RemoveDuplicatesController();
    }
}
