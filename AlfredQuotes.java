import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guestGreeting = String.format("Hello, %s. Lovely to see you.", name);
        return guestGreeting;
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        String guestGreeting = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return guestGreeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String currentDate = String.format("It is currently %s.", date);
        return currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") >= 0){
            return "At your service.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }
    
    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!

    public String repeatLoudly(String message) {
        String loudMessage = message.toUpperCase();
        return loudMessage;
    }
}

