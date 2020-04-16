//import java.util.ArrayList;
//
//public class DataStorage {
//
//    static private DataStorage instance;
//    private ArrayList<Customer> customerArrayList;
//
//    public DataStorage() {
//    }
//    static public DataStorage getInstance(){
//        return instance;
//    }
//
//    public void addCustomer(Customer customer){
//        this.customerArrayList.add(customer);
//    }
//    public ArrayList<Customer> getAllCustomers(){
//        return this.customerArrayList;
//    }
//    public loadData(){
//        customerArrayList.add(new Customer());
//    }
//}
//





//class DataStorage
//{
//    private static let instance = DataStorage()
//    private lazy var countryList: [Country] = []
//    private init (){}
//    static func getInstance() -> DataStorage{
//    return instance
//}
//    func addCountry(country: Country){
//        self.countryList.append(country)
//    }
//    func getAllCountries() -> [Country]{
//    return self.countryList
//}
//    func loadData(){
//        countryList.append(Country.init(name: "Afghanistan", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//        countryList.append(Country.init(name: "India", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//        countryList.append(Country.init(name: "Canada", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//        countryList.append(Country.init(name: "Afghanistan", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//        countryList.append(Country.init(name: "Afghanistan", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//        countryList.append(Country.init(name: "Afghanistan", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//        countryList.append(Country.init(name: "Afghanistan", capital: "Afghanistan", flag: #imageLiteral(resourceName: "elephant.png")))
//    }
//}