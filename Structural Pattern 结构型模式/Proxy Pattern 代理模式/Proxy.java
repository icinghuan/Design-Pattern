abstract class Subject  
{  
    public abstract void Request();  
}

class RealSubject extends Subject  
{  
	@Override
    public void Request()  
    {  
        System.out.println("真实操作");//业务方法具体实现代码  
    }  
}

class Proxy extends Subject  
{  
    private RealSubject realSubject = new RealSubject(); //维持一个对真实主题对象的引用  

    public void PreRequest()   
    {  
        //...
    }  

	@Override
    public void Request()   
    {  
		System.out.println("通过代理运行");
        PreRequest();  
        realSubject.Request(); //调用真实主题对象的方法  
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