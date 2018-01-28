abstract class AbstractClass   
{  
	//模板方法  
	public void TemplateMethod()   
	{  
        PrimitiveOperation1();  
        PrimitiveOperation2();  
        PrimitiveOperation3();  
	}  

	//基本方法—具体方法  
	public void PrimitiveOperation1()   
	{  
		//实现代码  
	}  

	//基本方法—抽象方法  
	public abstract void PrimitiveOperation2();      
 
	public abstract void PrimitiveOperation3();
}

class ConcreteClass extends AbstractClass   
{  
	@Override
	public void PrimitiveOperation2()   
	{  
		//实现代码  
	}  
	
	@Override
	public void PrimitiveOperation3()   
	{  
		//实现代码  
	}  
}