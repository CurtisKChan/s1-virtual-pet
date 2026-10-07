import javax.swing.*;

public class VirtualPetMain {
    VirtualPet vp = new VirtualPet();
    
    public VirtualPetMain(){
        this.waitABeat(2000);
        vp.shockedToldTest();
        this.waitABeat(1000);
        vp.morrisResponse1();
        this.waitABeat(1000);
        String ans1 = this.askForInput("Are you annoyed at Mr. Morris?");
        if(ans1.equals("yes"))
            vp.hearTestAnnoyed();
        else     
            vp.hearTestFine();
        this.waitABeat(1000);
        vp.daysLater();
        this.waitABeat(2500);
        String ans2 = this.askForInput("Will you study? Current net IQ: " + vp.netIQ());
        if(ans2.equals("yes")){
            vp.study();
            this.waitABeat(2000);
            vp.happy();
            String ans3 = this.askForInput("Do you want to review your quizes to study? Current net IQ: " + vp.netIQ());}
                if(ans3.equals("yes")){
                    vp.study();
                    this.waitABeat(2000);
                    vp.tired();
                    String ans4 = this.askForInput("Want to study the slideshows now? Current net IQ: " + vp.netIQ());}
                        if(ans4.equals("yes")){
                            vp.study();
                            this.waitABeat(2000);
                            vp.sick();
                            String ans5 = this.askForInput("Do you want to study some more? Current net IQ: " + vp.netIQ());}
                                if(ans5.equals("yes"));{
                                    vp.study();
                                    this.waitABeat(2000);
                                    vp.dead();}

        vp.sleep();
        this.waitABeat(1000);
        vp.testDay();
        if netIQ = 0;
            vp.fail();




        
        
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

