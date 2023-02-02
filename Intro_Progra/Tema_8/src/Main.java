public class Main {
    public static void main(String[] args) {
        Person persona=new Person();

        persona.setAge(42);
        persona.setName("Alex");
        persona.setTelephone("955533027");

        System.out.println(persona.getAge());
        System.out.println(persona.getName());
        System.out.println(persona.getTelephone());
    }
}
class Person{
    private int age;
    private String name;
    private String telephone;
    public void setAge(int age){this.age=age;}
    public int getAge(){return age;}
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setTelephone(String telephone){this.telephone=telephone;}
    public String getTelephone(){return telephone;}
}