package kashan.java.firstservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private Integer id;
    private String name;
    private String country;
    private int wickets;
    private int runs;
}
