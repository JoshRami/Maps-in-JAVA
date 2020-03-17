import java.util.HashMap;
import java.util.Map;
    class Maps{  
     public static void main(String args[]){ 
         Employee employee1 = new Employee("Josue","01234562-7",19,2000.00D);
         Employee employee2 = new Employee("Ismael","08455431-7",59,5000.00D);
         Employee employee3 = new Employee("Andrea","06164741-8",59,5000.00D);
         Employee[] empleados = {employee1,employee2,employee3};
         Employee.getEmployeeDetailsByDui("06164741-8", Employee.makeHashMap(empleados));
      }  
    } 
    class Employee{
        private int age;
        private String dui;
        private String name;
        private double savings;

        public void setAge(int age){
           this.age = age;
        }
        public void setNombre(String name){
           this.name = name;
        }
        public void setAhorro(double savings){
           this.savings = savings;
        }
        public void setDui(String dui){
           this.dui = dui;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }
        public double getSavings(){
            return savings;
        }
        public String getDui(){
            return dui;
        }
        public Employee(String name,String dui, int age, double savings){
            this.name = name;
            this.dui = dui;
            this.age = age;
            this.savings = savings;
        }
        public static void getEmployeeDetailsByDui(String dui, HashMap<String,Employee> map){
            for (Map.Entry<String,Employee> entry : map.entrySet()) {
                if(dui == entry.getKey()){
                    Employee employee = entry.getValue();
                    System.out.println(employee.getName()+" DUI: "+ employee.getDui() +" Edad: "+ employee.getAge() + " Ahorros: "+ employee.getSavings()+"$");
                    return;
                } 
            }
        }
        public static HashMap<String,Employee> makeHashMap(Employee[] employes_arr){
            HashMap<String,Employee> employes = new HashMap<String,Employee>();
            for (Employee empleado : employes_arr) {
                employes.put(empleado.getDui(),empleado);        
            }
            return employes;
        }
    } 