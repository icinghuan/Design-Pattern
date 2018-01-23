//�����ܱ�WeeklyLog������ԭ���࣬���ǵ�����Ŀɶ��Ժ�������ԣ�ֻ�г�������ģʽ��صĺ��Ĵ���
class WeeklyLog implements Cloneable
{
       private  String name;
       private  String date;
       private  String content;
       public  void setName(String name) {
              this.name  = name;
       }
       public  void setDate(String date) {
              this.date  = date;
       }
       public  void setContent(String content) {
              this.content  = content;
       }
       public  String getName() {
              return  (this.name);
       }
       public  String getDate() {
              return  (this.date);
       }
       public  String getContent() {
              return  (this.content);
       }
     //��¡����clone()���˴�ʹ��Java�����ṩ�Ŀ�¡����
       public WeeklyLog clone()
       {
              Object obj = null;
              try
              {
                     obj = super.clone();
                     return (WeeklyLog)obj;     
              }
              catch(CloneNotSupportedException e)
              {
                     System.out.println("��֧�ָ��ƣ�");
                     return null;
              }
       }
}

class Client
{
       public  static void main(String args[])
       {
              WeeklyLog log_previous = new WeeklyLog();  //����ԭ�Ͷ���
              log_previous.setName("���޼�");
              log_previous.setDate("��12��");
              log_previous.setContent("���ܹ�����æ��ÿ��Ӱ࣡");

              System.out.println("****�ܱ�****");
              System.out.println("�ܴΣ�" +  log_previous.getDate());
              System.out.println("������" +  log_previous.getName());
              System.out.println("���ݣ�" +  log_previous.getContent());
              System.out.println("--------------------------------");

              WeeklyLog  log_new;
              log_new  = log_previous.clone(); //���ÿ�¡����������¡����
              log_new.setDate("��13��");
              System.out.println("****�ܱ�****");
              System.out.println("�ܴΣ�" + log_new.getDate());
              System.out.println("������" + log_new.getName());
              System.out.println("���ݣ�" + log_new.getContent());
			  
			  System.out.println(log_previous == log_new);
			  System.out.println(log_previous.getDate() == log_new.getDate());
			  System.out.println(log_previous.getName() == log_new.getName());
			  System.out.println(log_previous.getContent() == log_new.getContent());
       }
}
