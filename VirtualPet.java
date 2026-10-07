/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int netIQ = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("worried");
        face.setMessage("You have just been told there is a CSA test in a week");
    }
    
    // public void feed() {
    //     if (hunger > 10) {
    //         hunger = hunger - 10;
    //     } else {
    //         hunger = 0;
    //     }
    //     face.setMessage("Yum, thanks");
    //     face.setImage("normal");
    // }
    
    // public void exercise() {
    //     hunger = hunger + 3;
    //     face.setMessage("1, 2, 3, jump.  Whew.");
    //     face.setImage("tired");
    // }
    
    // public void sleep() {
    //     hunger = hunger + 1;
    //     face.setImage("asleep");
    // }

    public void hearTestAnnoyed(){
        face.setMessage("Me: No way Mr. Morris!");
        face.setImage("annoyed");
    }

    public void hearTestFine(){
        face.setMessage("Me: Okay");
        face.setImage("normal");
    }

    public void shockedToldTest(){
        face.setMessage("Me: Are you serious Mr. Morris?");
        face.setImage("shocked");
    }

    public void morrisResponse1(){
        face.setMessage("Mr Morris: Yes.");
    }

    public void daysLater(){
        face.setImage("dayslater");
    }

    public void study(){
        face.setImage("study");
        netIQ = netIQ + 2;
    }

    public void happy(){
        face.setImage("happy");
    }

    public void tired(){
        face.setImage("tired");
    }

    public void sick(){
        face.setImage("sick");
    }

    public void dead(){
        face.setImage("dead");
    }

    public void sleep(){
        face.setImage("asleep");
        face.setMessage("**The Night Before the Test**");
    }

    public int netIQ(){
        return netIQ;
    }

    public void testDay(){
        face.setImage("testDay");
    }






} // end Virtual Pet
