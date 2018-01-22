//抽象图表接口：抽象产品类  
interface Graph {
	public void draw();
	public void erase();
}

//圆形类：具体产品类  
class CircleGraph implements Graph {  
    public CircleGraph() {  
        System.out.println("创建圆形！");  
    }  

    public void draw() {  
        System.out.println("显示圆形！");  
    }  
	
	public void erase() {  
        System.out.println("删除圆形！");  
    }  
}  

//方形类：具体产品类  
class SquareGraph implements Graph {  
    public SquareGraph() {  
        System.out.println("创建方形！");  
    }  

    public void draw() {  
        System.out.println("显示方形！");  
    }  
	
	public void erase() {  
        System.out.println("删除方形！");  
    }  
}  

//三角形类：具体产品类  
class TriangleGraph implements Graph {  
    public TriangleGraph() {  
        System.out.println("创建三角形！");  
    }  

    public void draw() {  
        System.out.println("显示三角形！");  
    }  
	
	public void erase() {  
        System.out.println("删除三角形！");  
    }  
}  

//图形工厂类：工厂类  
class GraphFactory {  
    //静态工厂方法  
    public static Graph getGraph(String type) {  
        Graph Graph = null;  
        if (type.equalsIgnoreCase("Circle")) {  
            Graph = new CircleGraph();  
            System.out.println("初始化设置圆形！");  
        }  
        else if (type.equalsIgnoreCase("Square")) {  
            Graph = new SquareGraph();  
            System.out.println("初始化设置方形！");  
        }  
        else if (type.equalsIgnoreCase("Triangle")) {  
            Graph = new TriangleGraph();  
            System.out.println("初始化设置三角形！");              
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
        graph = GraphFactory.getGraph("Circle"); //通过静态工厂方法创建产品  
        graph.draw();  
		graph.erase();
		graph = GraphFactory.getGraph("Square"); //通过静态工厂方法创建产品  
        graph.draw();  
		graph.erase();
		graph = GraphFactory.getGraph("Triangle"); //通过静态工厂方法创建产品  
        graph.draw();  
		graph.erase();
		graph = GraphFactory.getGraph("NULL"); //通过静态工厂方法创建产品  
    }  
}