import java.util.Objects;

public class PTStudent extends Student {

    public PTStudent(String firstName, String secondName, int id){
        super(firstName, secondName, id);
    }

    @Override
    public void serve (String room, int hour) throws IllegalArgumentException {
        room = room.toUpperCase();

        if(!Objects.equals(room, "C124") && !Objects.equals(room, "D124"))
            throw new IllegalArgumentException("You've chosen the incorrect room!");
        if(!(Objects.equals(room, "C124") && (hour >= 9 && hour <= 13)) && !(Objects.equals(room, "D124") && (hour >= 17 && hour <= 20)))
            throw new IllegalArgumentException("This room is out of service at this point of time!");
    }


}



