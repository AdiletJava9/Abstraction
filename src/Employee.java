public class Employee extends Person {
private  int id;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.id = id;
    }

    public Employee(String name, String gender) {
        super(name, gender);
    }

    @Override
    public void work() {
        if (id==0){
            System.out.println("Ishteit");
        }else {
            System.out.println("ishtebeyt");
        }
    }




    }


