package Business.Airliner;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class AirlinerDirectory extends ArrayList<Airliner> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //TODO: add, remove, search, update airliners.
    public void deletAirliner(Airliner airliner){
       this.remove(airliner);
    }

    /**
     * return an airliner by given ID;
     * @param ID
     * @return
     */
    public Airliner getAirlinerByID(int ID){
        try{
            return (Airliner)this.stream()
                    .filter(f -> f.getID() == ID)
                    .toArray()[0];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){}
        return null;
    }
}
