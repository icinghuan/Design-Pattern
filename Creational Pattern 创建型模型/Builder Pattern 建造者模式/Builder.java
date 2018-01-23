class Actor
{
       private  String type; //��ɫ����
       private  String sex; //�Ա�
       private  String face; //����
       private  String costume; //��װ
       private  String hairstyle; //����

       public  void setType(String type) {
              this.type  = type;
       }
       public  void setSex(String sex) {
              this.sex  = sex;
       }
       public  void setFace(String face) {
              this.face  = face;
       }
       public  void setCostume(String costume) {
              this.costume  = costume;
       }
       public  void setHairstyle(String hairstyle) {
              this.hairstyle  = hairstyle;
       }
       public  String getType() {
              return  (this.type);
       }
       public  String getSex() {
              return  (this.sex);
       }
       public  String getFace() {
              return  (this.face);
       }
       public  String getCostume() {
              return  (this.costume);
       }
       public  String getHairstyle() {
              return  (this.hairstyle);
       }
}

//��ɫ����������������
abstract class ActorBuilder
{
       protected  Actor actor = new Actor();

       public  abstract void buildType();
       public  abstract void buildSex();
       public  abstract void buildFace();
       public  abstract void buildCostume();
       public  abstract void buildHairstyle();

    //��������������һ����������Ϸ��ɫ����
       public Actor createActor()
       {
              return actor;
       }
}

//Ӣ�۽�ɫ�����������彨����
class HeroBuilder extends ActorBuilder
{
       public  void buildType()
       {
              actor.setType("Ӣ��");
       }
       public  void buildSex()
       {
              actor.setSex("��");
       }
       public  void buildFace()
       {
              actor.setFace("Ӣ��");
       }
       public  void buildCostume()
       {
              actor.setCostume("����");
       }
       public  void buildHairstyle()
       {
              actor.setHairstyle("Ʈ��");
       }    
}

//��ʹ��ɫ�����������彨����
class AngelBuilder extends ActorBuilder
{
       public  void buildType()
       {
              actor.setType("��ʹ");
       }
       public  void buildSex()
       {
              actor.setSex("Ů");
       }
       public  void buildFace()
       {
              actor.setFace("Ư��");
       }
       public  void buildCostume()
       {
              actor.setCostume("��ȹ");
       }
       public  void buildHairstyle()
       {
              actor.setHairstyle("���糤��");
       }    
}

//��ħ��ɫ�����������彨����
class DevilBuilder extends ActorBuilder
{
       public  void buildType()
       {
              actor.setType("��ħ");
       }
       public  void buildSex()
       {
              actor.setSex("��");
       }
       public  void buildFace()
       {
              actor.setFace("��ª");
       }
       public  void buildCostume()
       {
              actor.setCostume("����");
       }
       public  void buildHairstyle()
       {
              actor.setHairstyle("��ͷ");
       }    
}

//��Ϸ��ɫ������������ָ����
class ActorController
{
    //�𲽹������Ӳ�Ʒ����
       public Actor construct(ActorBuilder ab)
       {
              Actor actor;
              ab.buildType();
              ab.buildSex();
              ab.buildFace();
              ab.buildCostume();
              ab.buildHairstyle();
              actor=ab.createActor();
              return actor;
       }
}