import java.util.ArrayList;
import java.util.List;

public class Splitwise {
  
	public static void main(String args[]) { 
		 
		User user1 = new User("ABC","ABC001" ) ; 
		
		User user2 = new User("ABCD","ABC002" ) ; 
		
		User user3 = new User("ABCDE","ABC003" ) ; 
		
		User user4 = new User("ABC","ABC004" ) ; 
		
		
		List<User> userList = new ArrayList<User>() ; 
		userList.add(user1) ; 
		userList.add(user2) ; 
		userList.add(user3) ; 
		userList.add(user4);  
		
		
       Group group1 = new Group(userList, "GRP001", "Grurn") ; 
       
             
       
       Expense expense1 = new Expense("EXP001", user1, 400, "chowmin") ; 
       Split split1 = new Split("SPL001", 100 , user1) ; 
       Split split2 = new Split("SPL001", 100 , user2) ;
       Split split3 = new Split("SPL001", 100 , user3) ;
       Split split4 = new Split("SPL001", 100 , user4) ; 
       
       
       List<Split> splitList = new ArrayList<Split>() ; 
       splitList.add(split1); 
       splitList.add(split2); 
       splitList.add(split3); 
       splitList.add(split4); 
       
       
       expense1.setSplitList(splitList); 
       
        List<Expense> expenses = new ArrayList<Expense>() ; 
        expenses.add(expense1) ; 
        
        group1.setExpenses(expenses); 
        
        System.out.println("Group name: " + group1.getName()) ; 
        
        for(Expense expense:group1.getExpenses()) {
        	System.out.println("expenese id: "+ expense.getId()) ; 
        System.out.println("expenese name: "+ expense.getName()) ;
        System.out.println("expenese paidBy: "+ expense.getPaidBy().getName()) ;
         
        for(Split split : expense.getSplitList() ) { 
        	
        	System.out.println("split id: " + split.getId()) ; 
        	System.out.println("split amount: " + split.getAmount()) ;
        	System.out.println("split user name: " + split.getUser().getName()); 
        	
        }
        }
       
	}
}
