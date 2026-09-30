import javax.swing.*;

public class VirtualPetMain {
    VirtualPet vp = new VirtualPet();
    
    public VirtualPetMain(){
        this.waitABeat(2000);
        vp.shockedToldTest();
        this.waitABeat(1000);
        vp.morrisResponse1();
        this.waitABeat(1000);
        String ans = this.askForInput("Are you annoyed at Mr. Morris?");
        if(ans.equals("yes"))
            vp.hearTestAnnoyed();
        else     
            vp.hearTestFine();
        this.waitABeat(1000);
        vp.daysLater();
        this.waitABeat(2500);
        String ans = this.askForInput("Will you study?");
        if(ans.equals("yes"))
            vp.study();
        // vp.feed();
        // vp.exercise();
        // this.waitABeat(1000);
        // String ans = this.askForInput("Are you ready to sleeep?");
        // if(ans.equals("yes"))
        //     vp.sleep();
        // else
        //     vp.exercise();

    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VirtualPetMain();    
    }
}

