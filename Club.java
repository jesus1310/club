import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    // Declaramos un ArrayList para almacenar los socios
    private ArrayList<Membership> miembros;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        miembros = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        miembros.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return miembros.size();
    }

    /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int month){
        int sociosEnMesDado = 0;
        if(month < 1 || month > 12) {
            System.out.println("El mes introducido no es válido, debe estar en el rango [1,12]");
        }
        else {
            for (Membership miembro : miembros){
                if (miembro.getMonth() == month){
                    sociosEnMesDado = sociosEnMesDado + 1;
                } 
            }
        }
        return sociosEnMesDado;
    }
}
