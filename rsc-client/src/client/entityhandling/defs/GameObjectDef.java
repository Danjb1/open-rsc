package client.entityhandling.defs;

/**
 * Data relating to a game object, for example a table or chair.
 */
public class GameObjectDef extends EntityDef {

    public String command1;

    public String command2;
    
    public int type;
    
    public int width;
    
    public int height;
    
    /**
     * Z-position of items placed atop this object.
     */
    public int groundItemZ;

    public String objectModel;

    public int modelID;

    public String getObjectModel() {
        return objectModel;
    }

    public String getCommand1() {
        return command1.toLowerCase();
    }

    public String getCommand2() {
        return command2.toLowerCase();
    }

    public int getType() {
        return type;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getGroundItemZ() {
        return groundItemZ;
    }
    
}
