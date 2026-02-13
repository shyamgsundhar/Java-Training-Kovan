package org.kovan.intern.oops_and_architectural_thinking.interfaces_and_abstract_classes;

interface Plugin{
    void execute();
}

class CoreEngine{
    void runPlugins(Plugin[] plugins){
        for(Plugin plugin:plugins){
            System.out.println(plugin);
        }
    }
}
public class PluginSystemDemo {
    public static void main(String[] args) {
        Plugin plugin1= new Plugin() {
            @Override
            public void execute() {
                System.out.println("First Plugin");
            }
        };

        Plugin plugin2 = new Plugin() {
            @Override
            public void execute() {
                System.out.println("Second Plugin");
            }
        };

        Plugin plugin3=new Plugin() {
            @Override
            public void execute() {
                System.out.println("Third Plugin");
            }
        };
        Plugin[] plugins={
                plugin1,plugin2,plugin3
        };
        CoreEngine coreEngine = new CoreEngine();
        coreEngine.runPlugins(plugins);
    }
}
