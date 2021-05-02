
package week4hmw1;

public class CustomerManager implements CustomerService{

    @Override
    public void Save(Customer customer) {
        System.out.println("Veritabanına kaydedildi."+ customer.firstName);
    }
    
    
}
