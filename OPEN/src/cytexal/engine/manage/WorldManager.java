package cytexal.engine.manage;

import cytexal.engine.main.World;
import toolbox.CYOBHandler;

public class WorldManager extends WorkshopManager{
	
	public static World load(String id){
		World to= (World) WorkshopManager.load(id);
		if(to !=null)
			return to;
		return (World) CYOBHandler.load(getInputStream(id, ".cyob"));
	}
}
