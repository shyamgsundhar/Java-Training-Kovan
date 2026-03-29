package org.kovan.intern.oops_and_architectural_thinking.classes_statics_and_singleton_pattern;

class AppConfig{
    private static AppConfig appConfig;
    private AppConfig(){
        System.out.println("Constructed Called");
    }
    public static AppConfig getInstance(){
        if(appConfig==null){
            appConfig=new AppConfig();
            System.out.println("New Instance Created");
        }
        return appConfig;
    }
}

public class AppConfigTest {
    public static void main(String[] args) {
        AppConfig appConfig1= AppConfig.getInstance();
        AppConfig appConfig2= AppConfig.getInstance();
        AppConfig appConfig3= AppConfig.getInstance();
        System.out.println(appConfig1==appConfig2);
        System.out.println(appConfig2==appConfig3);
    }
}
