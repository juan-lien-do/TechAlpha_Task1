package liendo_alphatech;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemoveDuplicatesController {
    private RemoveDuplicatesIO rdio;
    private RemoveDuplicatesService rds;
    private Long[] initialNumberArray;
    private Long[] finalNumberArray;

    public RemoveDuplicatesController(){
        // set RDIO
        rdio = new RemoveDuplicatesIO(this);
        // set RDS
        rds = new RemoveDuplicatesService();
        // start routine
        routine();
    }

    public void routine(){
        // call input output class and set initialNumberArray (from rdio)
        rdio.askForInitialArray();
        // call service and set finalNumberArray
        this.finalNumberArray = rds.removeDuplicates(this.initialNumberArray);
        // call input output class and show final number array
        rdio.showArray(this.finalNumberArray);
        // end of the use case
    }
}
