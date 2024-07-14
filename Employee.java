public class Employee {

    private String id ;
    private String name;
    private  int salary=0;


    public Employee(String id , String name , int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
       public Employee (){
       }

       public void setId(String id){
        this.id=id;
       }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }


     // Methods
    public int getAnnualSlary(){
        return this.salary*12;
    }
     public int raisedSalary(int percent){
      int rais=(int)(this.salary *(percent/100.0));
      this.salary += rais;
         return this.salary;
     }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
