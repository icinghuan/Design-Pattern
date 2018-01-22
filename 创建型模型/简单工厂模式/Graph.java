//����ͼ��ӿڣ������Ʒ��  
interface Graph {
	public void draw();
	public void erase();
}

//Բ���ࣺ�����Ʒ��  
class CircleGraph implements Graph {  
    public CircleGraph() {  
        System.out.println("����Բ�Σ�");  
    }  

    public void draw() {  
        System.out.println("��ʾԲ�Σ�");  
    }  
	
	public void erase() {  
        System.out.println("ɾ��Բ�Σ�");  
    }  
}  

//�����ࣺ�����Ʒ��  
class SquareGraph implements Graph {  
    public SquareGraph() {  
        System.out.println("�������Σ�");  
    }  

    public void draw() {  
        System.out.println("��ʾ���Σ�");  
    }  
	
	public void erase() {  
        System.out.println("ɾ�����Σ�");  
    }  
}  

//�������ࣺ�����Ʒ��  
class TriangleGraph implements Graph {  
    public TriangleGraph() {  
        System.out.println("���������Σ�");  
    }  

    public void draw() {  
        System.out.println("��ʾ�����Σ�");  
    }  
	
	public void erase() {  
        System.out.println("ɾ�������Σ�");  
    }  
}  

//ͼ�ι����ࣺ������  
class GraphFactory {  
    //��̬��������  
    public static Graph getGraph(String type) {  
        Graph Graph = null;  
        if (type.equalsIgnoreCase("Circle")) {  
            Graph = new CircleGraph();  
            System.out.println("��ʼ������Բ�Σ�");  
        }  
        else if (type.equalsIgnoreCase("Square")) {  
            Graph = new SquareGraph();  
            System.out.println("��ʼ�����÷��Σ�");  
        }  
        else if (type.equalsIgnoreCase("Triangle")) {  
            Graph = new TriangleGraph();  
            System.out.println("��ʼ�����������Σ�");              
        }  
		else
		{
			System.out.println("UnSupportedShapeException");
		}
        return Graph;  
    }  
}

class Client {  
    public static void main(String args[]) {  
        Graph graph;  
        graph = GraphFactory.getGraph("Circle"); //ͨ����̬��������������Ʒ  
        graph.draw();  
		graph.erase();
		graph = GraphFactory.getGraph("Square"); //ͨ����̬��������������Ʒ  
        graph.draw();  
		graph.erase();
		graph = GraphFactory.getGraph("Triangle"); //ͨ����̬��������������Ʒ  
        graph.draw();  
		graph.erase();
		graph = GraphFactory.getGraph("NULL"); //ͨ����̬��������������Ʒ  
    }  
}