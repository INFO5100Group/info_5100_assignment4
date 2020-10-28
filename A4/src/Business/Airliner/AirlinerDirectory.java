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
}
