abstract class AbstractClass   
{  
	//ģ�巽��  
	public void TemplateMethod()   
	{  
        PrimitiveOperation1();  
        PrimitiveOperation2();  
        PrimitiveOperation3();  
	}  

	//�������������巽��  
	public void PrimitiveOperation1()   
	{  
		//ʵ�ִ���  
	}  

	//�������������󷽷�  
	public abstract void PrimitiveOperation2();      
 
	public abstract void PrimitiveOperation3();
}

class ConcreteClass extends AbstractClass   
{  
	@Override
	public void PrimitiveOperation2()   
	{  
		//ʵ�ִ���  
	}  
	
	@Override
	public void PrimitiveOperation3()   
	{  
		//ʵ�ִ���  
	}  
}