//�ڱ�ʵ���У�Ϊ����ϸ˵���Զ����������ʵ�ֹ��̣�����û��ʹ��JDK�����õĵ���������ʵ�ϣ�JDK���õ������Ѿ�ʵ���˶�һ��List������������  
import java.util.*;  

//����ۺ���  
abstract class AbstractObjectList {  
    protected List<Object> objects = new ArrayList<Object>();  

    public AbstractObjectList(List objects) {  
        this.objects = objects;  
    }  

    public void addObject(Object obj) {  
        this.objects.add(obj);  
    }  

    public void removeObject(Object obj) {  
        this.objects.remove(obj);  
    }  

    public List getObjects() {  
        return this.objects;  
    }  

    //������������������ĳ��󹤳�����  
    public abstract AbstractIterator createIterator();  
}  

//��Ʒ�����ࣺ����ۺ���  
class ProductList extends AbstractObjectList {  
    public ProductList(List products) {  
        super(products);  
    }  

    //ʵ�ִ�������������ľ��幤������  
    public AbstractIterator createIterator() {  
        return new ProductIterator(this);  
    }  
}   

//���������  
interface AbstractIterator {  
    public void next(); //������һ��Ԫ��  
    public boolean isLast(); //�ж��Ƿ�Ϊ���һ��Ԫ��  
    public void previous(); //������һ��Ԫ��  
    public boolean isFirst(); //�ж��Ƿ�Ϊ��һ��Ԫ��  
    public Object getNextItem(); //��ȡ��һ��Ԫ��  
    public Object getPreviousItem(); //��ȡ��һ��Ԫ��  
}  

//��Ʒ�����������������  
class ProductIterator implements AbstractIterator {  
    private ProductList productList;  
    private List products;  
    private int cursor1; //����һ���α꣬���ڼ�¼���������λ��  
    private int cursor2; //����һ���α꣬���ڼ�¼���������λ��  

    public ProductIterator(ProductList list) {  
        this.productList = list;  
        this.products = list.getObjects(); //��ȡ���϶���  
        cursor1 = 0; //������������α�ĳ�ʼֵ  
        cursor2 = products.size() -1; //������������α�ĳ�ʼֵ  
    }  

    public void next() {  
        if(cursor1 < products.size()) {  
            cursor1++;  
        }  
    }  

    public boolean isLast() {  
        return (cursor1 == products.size());  
    }  

    public void previous() {  
        if (cursor2 > -1) {  
            cursor2--;  
        }  
    }  

    public boolean isFirst() {  
        return (cursor2 == -1);  
    }  

    public Object getNextItem() {  
        return products.get(cursor1);  
    }   

    public Object getPreviousItem() {  
        return products.get(cursor2);  
    }     
}

class Client {  
    public static void main(String args[]) {  
        List products = new ArrayList();  
        products.add("���콣");  
        products.add("������");  
        products.add("�ϳ���");  
        products.add("��������");  
        products.add("��ʮ���¾�");  

        AbstractObjectList list;  
        AbstractIterator iterator;  

        list = new ProductList(products); //�����ۺ϶���  
        iterator = list.createIterator();   //��������������  

        System.out.println("���������");      
        while(!iterator.isLast()) {  
            System.out.print(iterator.getNextItem() + "��");  
            iterator.next();  
        }  
        System.out.println();  
        System.out.println("-----------------------------");  
        System.out.println("���������");  
        while(!iterator.isFirst()) {  
            System.out.print(iterator.getPreviousItem() + "��");  
            iterator.previous();  
        }  
    }  
}