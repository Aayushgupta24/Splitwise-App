import java.util.List;

public  class Expense  { 
  String id ; 
  User paidBy ; 
  double amount ; 
  List<Split> splitList ; 
  String name ; 

   public Expense(String id , User paidBy , double amount , String name) { 
        this.id = id ; 
        this.paidBy = paidBy ; 
        this.amount = amount ; 
        
   }
    
    public String getId () { 
          return id ; 
    }
   public User getPaidBy() { 
     return paidBy ; 
   } 
    public double getAmount() { 
         return amount ; 
    } 

    public List<Split> getSplitList() { 
         return splitList ; 
    } 
    public String getName() { 
        return name ; 
    } 

    public void setId( String id) { 
         this.id = id ; 
    }

     public void setPaidBy( User paidBy) { 
         this.paidBy = paidBy ; 
    }

     public void setAmount( double amount) { 
         this.amount = amount ; 
    }

     public void setSplitList( List<Split> splitList) { 
         this.splitList = splitList ; 
    }

     public void setName( String name) { 
         this.name = name ; 
    }

} 