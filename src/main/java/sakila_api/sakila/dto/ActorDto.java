package sakila_api.sakila.dto;

public class ActorDto {

    int actorId;
    String actorFirstName;
    String actorLastName;
    
    public ActorDto (String actorFirstName, String actorLastName){
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
    }

    public ActorDto(){

    }

    //methods
    public String getActorFirstName(){
        return this.actorFirstName;
    }

    public void setActorFirstName(String name){
        this.actorFirstName = name;
    }

    public String getActorLastName() {
        return actorLastName;
    }

    public void setActorLastName(String name){
        this.actorLastName = name;
    }

    public int getActorId(){
        return this.actorId;
    }

    public void setActorId(int id){
        this.actorId = id;
    }


}
