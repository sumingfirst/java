package �쳣����;
public class Hero {
    public String name;
    protected float hp;
 
    public void attackHero(Hero h) throws DefinedException{
        if(h.hp == 0){
            throw new DefinedException(h.name + " �Ѿ�����,����Ҫʩ�ż���" );
        }
    }
 
    public String toString(){
        return name;
    }
     
    class DefinedException extends Exception{
         
        public DefinedException(){
             
        }
        public DefinedException(String msg){
            super(msg);
        }
    }
      
    public static void main(String[] args) {
         
        Hero garen =  new Hero();
        garen.name = "����";
        garen.hp = 616;
 
        Hero teemo =  new Hero();
        teemo.name = "��Ī";
        teemo.hp = 0;
         
        try {
            garen.attackHero(teemo);
             
        } catch (DefinedException e) {
            // TODO Auto-generated catch block
            System.out.println("�쳣�ľ���ԭ��:"+e.getMessage());
            e.printStackTrace();
        }
         
    }
}