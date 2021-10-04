import static javax.swing.JOptionPane.*;

public class Agecheck {
    public static void main(String[] args) {
        int alder = Integer.parseInt(showInputDialog("Oppgi alder: "));
        int alderTerskel = 70;

        if (alder < 18) {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
        else if (alder >= alderTerskel) {
            showMessageDialog(null,"Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
        else {
            showMessageDialog(null,"Du kan ta førerkortet for bil da du er gammel nok");
        }
    }
}
