//���������ࣺԭ����  
class Chessman {  
    private String label;  
    private int x;  
    private int y;  

    public Chessman(String label,int x,int y) {  
        this.label = label;  
        this.x = x;  
        this.y = y;  
    }  

    public void setLabel(String label) {  
        this.label = label;   
    }  

    public void setX(int x) {  
        this.x = x;   
    }  

    public void setY(int y) {  
        this.y = y;   
    }  

    public String getLabel() {  
        return (this.label);   
    }  

    public int getX() {  
        return (this.x);   
    }  

    public int getY() {  
        return (this.y);   
    }  

    //����״̬  
    public ChessmanMemento save() {  
        return new ChessmanMemento(this.label,this.x,this.y);  
    }  

    //�ָ�״̬  
    public void restore(ChessmanMemento memento) {  
        this.label = memento.getLabel();  
        this.x = memento.getX();  
        this.y = memento.getY();  
    }  
}  

//�������ӱ���¼�ࣺ����¼  
class ChessmanMemento {  
    private String label;  
    private int x;  
    private int y;  

    public ChessmanMemento(String label,int x,int y) {  
        this.label = label;  
        this.x = x;  
        this.y = y;  
    }  

    public void setLabel(String label) {  
        this.label = label;   
    }  

    public void setX(int x) {  
        this.x = x;   
    }  

    public void setY(int y) {  
        this.y = y;   
    }  

    public String getLabel() {  
        return (this.label);   
    }  

    public int getX() {  
        return (this.x);   
    }  

    public int getY() {  
        return (this.y);   
    }     
}  

//�������ӱ���¼�����ࣺ������  
class MementoCaretaker {  
    private ChessmanMemento memento;  

    public ChessmanMemento getMemento() {  
        return memento;  
    }  

    public void setMemento(ChessmanMemento memento) {  
        this.memento = memento;  
    }  
}  

class Client {  
    public static void main(String args[]) {  
        MementoCaretaker mc = new MementoCaretaker();  
        Chessman chess = new Chessman("��",1,1);  
        display(chess);  
        mc.setMemento(chess.save()); //����״̬       
        chess.setY(4);  
        display(chess);  
        mc.setMemento(chess.save()); //����״̬  
        display(chess);  
        chess.setX(5);  
        display(chess);  
        System.out.println("******����******");     
        chess.restore(mc.getMemento()); //�ָ�״̬  
        display(chess);  
    }  

    public static void display(Chessman chess) {  
        System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");  
    }  
}