
package week4hmw1;

public class MernisServiceAdapter implements CustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) {
       return true;
    }
    
    
    
}
