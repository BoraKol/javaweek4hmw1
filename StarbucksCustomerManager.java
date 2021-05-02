
package week4hmw1;

public class StarbucksCustomerManager extends CustomerManager{
    
    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    
    public void Save(Customer customer){
        
        if(customerCheckService.checkIfRealPerson(customer))
        {
            System.out.println("Veritabanına kaydedildi "+ customer.firstName );
        }  
        
        else{
            System.out.println("Geçerli bir kişi değildir.");
        }
    
    
    
    
}
           
           
    
    
}
