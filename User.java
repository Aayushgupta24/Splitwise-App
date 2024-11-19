public class User{ 

  private String name ; 
   private String id ; 


   // initlize the objects using conrtuctor  used to only set the members
 
    public User(String name , String id ) {
         
         this.name = name ; 
         this.id = id ; 
    }

    public String getName() { 
          return name ; 
    }
    public String getId() { 
         return id ; 
    }

    public void setName(String newName) { 
          this.name = newName ; 
    }
    public void setId (String id) { 
         this.id = id ; 
    }
   
}