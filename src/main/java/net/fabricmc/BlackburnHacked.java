package net.fabricmc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

/**
 * Blackburn Hacked Init Class 
 * Loads all nessiscary functions into fabrick
 */
public class BlackburnHacked  implements ModInitializer {
    
	public static final String VERSION = "1.7.1";
	
    
    
    @Override
    public void onInitialize() {
    	
    	try {
			//Check if FancyMenu was loaded client- or serverside
    		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            }
        
        } catch (Exception e) {
                e.printStackTrace();
            }
        }


        
        private void onClientSetup() {
            try {
    
            
               
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
	
}
