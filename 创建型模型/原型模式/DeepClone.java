import  java.io.*;
//������
class  Attachment implements Serializable
{
       private  String name; //������
       public  void setName(String name)
       {
              this.name  = name;
       }
       public  String getName()
       {
              return  this.name;
       }
     public void download()
     {
            System.out.println("���ظ������ļ���Ϊ" + name);
     }
}

//�����ܱ���
class  WeeklyLog implements Serializable
{
       private  Attachment attachment;
       private  String name;
       private  String date;
       private  String content;
       public  void setAttachment(Attachment attachment) {
              this.attachment  = attachment;
       }
       public  void setName(String name) {
              this.name  = name;
       }
       public  void setDate(String date) {
              this.date  = date;
       }
       public  void setContent(String content) {
              this.content  = content;
       }
       public  Attachment getAttachment(){
              return  (this.attachment);
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
   //ʹ�����л�����ʵ�����¡
       public WeeklyLog deepClone() throws  IOException, ClassNotFoundException, OptionalDataException
       {
              //������д������
              ByteArrayOutputStream bao=new  ByteArrayOutputStream();
              ObjectOutputStream oos=new  ObjectOutputStream(bao);
              oos.writeObject(this);

              //�����������ȡ��
              ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
              ObjectInputStream ois=new  ObjectInputStream(bis);
              return  (WeeklyLog)ois.readObject();
       }
}

class Client
{
       public  static void main(String args[])
       {
              WeeklyLog  log_previous, log_new = null;
              log_previous  = new WeeklyLog(); //����ԭ�Ͷ���
              Attachment  attachment = new Attachment(); //������������
              log_previous.setAttachment(attachment);  //��������ӵ��ܱ���
              try
              {
                     log_new =  log_previous.deepClone(); //�������¡����������¡����                  
              }
              catch(Exception e)
              {
                     System.err.println("��¡ʧ�ܣ�");
              }
              //�Ƚ��ܱ�
              System.out.println("�ܱ��Ƿ���ͬ�� " + (log_previous ==  log_new));
              //�Ƚϸ���
              System.out.println("�����Ƿ���ͬ�� " +  (log_previous.getAttachment() == log_new.getAttachment()));
       }
}