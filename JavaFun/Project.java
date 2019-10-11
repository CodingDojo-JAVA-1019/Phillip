import java.util.*;

public class Project{
    private String desc = "";
    private String name = "";
    private Double cost;
    
    public Project(){
    }
    public Project(String name){
        this.name=name;
    }
    public Project(String name, String desc){
        this.name=name;
        this.desc = desc;
    }
    public Project(String name, String desc, Double cost){
        this.name=name;
        this.desc=desc;
        this.cost=cost;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public Double getCost(){
        return cost;
    }
    public void setCost(Double cost){
        this.cost=cost;
    }
    public String elevatorPitch(){
        return name+ "("+cost+")"+" : "+desc;
    }

}
