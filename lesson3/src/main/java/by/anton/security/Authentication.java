package by.anton.security;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Authentication {
    private static Map<String,String> users=new HashMap<>();
    private static Map<String,Integer> userCooki=new HashMap<>();
    private static Random random=new Random();
    private static Authentication authentication;
    private Authentication(){};
    public static Authentication init(){
        if(authentication==null){
            users.put("test","test");
            return new Authentication();
        }
        return authentication;
    }
    public boolean addUser(String name, String password){
        if(users.entrySet().stream().filter(s->s.getKey().equalsIgnoreCase(name))!=null){
            users.put(name, password);
            return true;
        }else {
        return false;
        }
    }
    public void deleteUser(String name){
        if(users.entrySet().stream().filter(s->s.getKey().equalsIgnoreCase(name))!=null){
            users.remove(name);
        }
    }

    public Integer checkUser(String name,String password){
        if(users.entrySet().stream().filter(s->s.getKey().equalsIgnoreCase(name))!=null
                && users.get(name).equalsIgnoreCase(password) ){
            int key= random.nextInt();
            userCooki.put(name,key);
            return key;
        }else {
            return null;
        }
    }
}
