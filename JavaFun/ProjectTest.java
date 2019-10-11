public class ProjectTest{
    public static void main(String[] args) {
        
   

    Project myProj = new Project("Trash Goals", "The world is full of trash.  Help pick it up!", 28265.00);

    System.out.println(myProj.getName());
    System.out.println(myProj.getDesc());
    System.out.println(myProj.getCost());
    System.out.println(myProj.elevatorPitch());
}
}