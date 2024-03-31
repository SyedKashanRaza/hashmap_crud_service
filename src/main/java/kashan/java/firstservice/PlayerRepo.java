package kashan.java.firstservice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlayerRepo implements IPlayer<Player> {

    private Map<Integer, Player> data;

    public PlayerRepo(){
        this.data= new HashMap<>();
    }

    @Override
    public void save(Player p) {
        this.data.put(p.getId(), p);
    }

    @Override
    public Collection<Player> getAll() {
        return this.data.values();
    }

    @Override
    public void remove(int id) {
        this.data.remove(id);
    }

    @Override
    public void update(Player p) {
        this.data.put(p.getId(), p);
    }
}
