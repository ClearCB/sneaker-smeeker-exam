package edu.craptocraft.sneakerraffle.utilities;


import edu.craptocraft.sneakerraffle.domain.Entry;
import edu.craptocraft.sneakerraffle.domain.Raffle;

public class GUI {

    public static void drawSneaker(Raffle sneaker) {
        System.out.println(
                "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
                        "\t\t" + sneaker.toString());
    }

    public static void drawEntry(Entry entry){

        System.out.println(entry.toString());
    }

    public static void drawWinner(Entry entry){
        
        System.out.println("\n\t\t¡¡ You are a Winner !!:\n "+ entry.toString());
    }
}
