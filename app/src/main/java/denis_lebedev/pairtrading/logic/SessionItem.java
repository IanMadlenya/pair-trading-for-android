package denis_lebedev.pairtrading.logic;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Denis_Lebedev on 12.11.2017.
 */
public class SessionItem {
    public ArrayList<String> symbols;
    public Date firstDate;
    public Date lastDate;
    public double balance;
    public double risk;
}
