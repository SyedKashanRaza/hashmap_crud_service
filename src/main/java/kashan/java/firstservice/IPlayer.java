package kashan.java.firstservice;

import java.util.Collection;

public interface IPlayer<T> {
    
    public void save(T p);  
    
    public Collection<T> getAll();

    public void remove(int id);
    
    public void update(T p);  
}
