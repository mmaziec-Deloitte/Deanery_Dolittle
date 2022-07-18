import java.util.Objects;

//TODO this name should mean something - so PartTimeStudent is better that PTStudent even if it's longer
public class PTStudent extends Student {

    public PTStudent(String firstName, String secondName, int id){
        super(firstName, secondName, id);
    }

    @Override
    public void serve (String room, int hour) throws IllegalArgumentException {
        room = room.toUpperCase();

        //TODO You have some hardcoded logic here -> imagine we needed to add a new room that could serve the PartTimeStudents
        // then you would need to write an extra comparison of objects and it's hours
        // that is why a better way would be to introduce an enum/class that would represent a Room -> each room would have the info about
        // the opening and  closing hour in itself and it could contain a method verifying whether the hour is correct
        // then in this class you could simply keep a reference to a collection of Rooms that are suitable for a PartTime student
        // and let the Room enum handle the hours checking
        if(!Objects.equals(room, "C124") && !Objects.equals(room, "D124")) //TODO it is better practice to use the equals method from String, not from Objects
            //TODO so basically you can use "C124".equals(room)
            throw new IllegalArgumentException("You've chosen the incorrect room!"); //TODO ok but I wanted some custom exceptions to be implemented ;)
        if(!(Objects.equals(room, "C124") && (hour >= 9 && hour <= 13)) && !(Objects.equals(room, "D124") && (hour >= 17 && hour <= 20)))
            throw new IllegalArgumentException("This room is out of service at this point of time!");
    }


}



