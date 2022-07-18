import java.util.Objects;

public class FTStudent extends Student {

    public FTStudent(String firstName, String secondName, int id) {
        super(firstName, secondName, id);
    }

    @Override
    public void serve (String room, int hour) throws IllegalArgumentException {
        room = room.toUpperCase();

        if(!Objects.equals(room, "A123") && !Objects.equals(room, "B123"))
            throw new IllegalArgumentException("You've chosen the incorrect room!");
        if(!(Objects.equals(room, "A123") && (hour >= 8 && hour <= 16)) && !(Objects.equals(room, "B123") && (hour >= 9 && hour <= 17)))
            throw new IllegalArgumentException("This room is out of service at this point of time!");
    }
}
