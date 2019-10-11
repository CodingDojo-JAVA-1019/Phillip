import java.util.*;


public class Portfolio{
    private ArrayList<Object> projPort = new ArrayList<Object>();
        
    public ArrayList<Object> getPortfolio(){
        return projPort;
    }
    public void addPortfolio(ArrayList<Object> proj){
        projPort.add(proj);
    }
    public void showProjects(ArrayList<Object> portfolio){
        for(Object project : portfolio){
            System.out.print("The project name is: "+project.name+".");
        }

    }

}