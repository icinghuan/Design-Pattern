import java.util.*;  

//���ܼ����ô�����  
class FBSettingWindow {  
    private String title; //���ڱ���  
    //����һ��ArrayList���洢���й��ܼ�  
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();  

    public FBSettingWindow(String title) {  
        this.title = title;  
    }  

    public void setTitle(String title) {  
        this.title = title;  
    }  

    public String getTitle() {  
        return this.title;  
    }  

    public void addFunctionButton(FunctionButton fb) {  
        functionButtons.add(fb);  
    }  

    public void removeFunctionButton(FunctionButton fb) {  
        functionButtons.remove(fb);  
    }  

    //��ʾ���ڼ����ܼ�  
    public void display() {  
        System.out.println("��ʾ���ڣ�" + this.title);  
        System.out.println("��ʾ���ܼ���");  
        for (Object obj : functionButtons) {  
            System.out.println(((FunctionButton)obj).getName());  
        }  
        System.out.println("------------------------------");  
    }     
}  

//���ܼ��ࣺ��������  
class FunctionButton {  
    private String name; //���ܼ�����  
    private Command command; //ά��һ������������������  

    public FunctionButton(String name) {  
        this.name = name;  
    }  

    public String getName() {  
        return this.name;  
    }  

    //Ϊ���ܼ�ע������  
    public void setCommand(Command command) {  
        this.command = command;  
    }  

    //��������ķ���  
    public void onClick() {  
        System.out.print("������ܼ���");  
        command.execute();  
    }  
}  

//����������  
abstract class Command {  
    public abstract void execute();  
}  

//���������ࣺ����������  
class HelpCommand extends Command {  
    private HelpHandler hhObj; //ά�ֶ���������ߵ�����  

    public HelpCommand() {  
        hhObj = new HelpHandler();  
    }  

    //����ִ�з�������������������ߵ�ҵ�񷽷�  
    public void execute() {  
        hhObj.display();  
    }  
}  

//��С�������ࣺ����������  
class MinimizeCommand extends Command {  
    private WindowHanlder whObj; //ά�ֶ���������ߵ�����  

    public MinimizeCommand() {  
        whObj = new WindowHanlder();  
    }  

//����ִ�з�������������������ߵ�ҵ�񷽷�  
    public void execute() {  
        whObj.minimize();  
    }  
}  

//���ڴ����ࣺ���������  
class WindowHanlder {  
    public void minimize() {  
        System.out.println("��������С�������̣�");  
    }  
}  

//�����ĵ������ࣺ���������  
class HelpHandler {  
    public void display() {  
        System.out.println("��ʾ�����ĵ���");  
    }  
}