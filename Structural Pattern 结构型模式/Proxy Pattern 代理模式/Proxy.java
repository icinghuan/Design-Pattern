abstract class Subject  
{  
    public abstract void Request();  
}

class RealSubject extends Subject  
{  
	@Override
    public void Request()  
    {  
        System.out.println("��ʵ����");//ҵ�񷽷�����ʵ�ִ���  
    }  
}

class Proxy extends Subject  
{  
    private RealSubject realSubject = new RealSubject(); //ά��һ������ʵ������������  

    public void PreRequest()   
    {  
        //...
    }  

	@Override
    public void Request()   
    {  
		System.out.println("ͨ����������");
        PreRequest();  
        realSubject.Request(); //������ʵ�������ķ���  
        PostRequest();  
    }  

    public void PostRequest()   
    {  
        //...  
    }  
}

class Client {
	public static void main(String[] args) {
		Subject subject = new Proxy();
		subject.Request();
	}
}