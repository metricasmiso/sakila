package sakila_api.sakila.dto;

public class ActorDto {

    int Id;
    String firstName;
    String lastName;
    
    public ActorDto (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ActorDto(){

    }

    //methods
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public int getId(){
        return this.Id;
    }

    public void setId(int id){
        this.Id = id;
    }


}
