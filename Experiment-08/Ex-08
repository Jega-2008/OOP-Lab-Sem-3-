class data{
int value;
boolean available=false;
synchronized void produce(int v){
while(available)
try{wait();}catch(Exception e){}
value=v;
available=true;
System.out.println("producted:"+value);
notifyAll();
}
synchronized void consume(){
while(!available)
try{wait();}catch(Exception e){}
System.out.println("Consumed:"+value);
available=false;
notify();
}
}
public class Interthread{
public static void main(String[] args){
data d=new data();
new Thread(()->d.produce(10)).start();
new Thread(()->d.consume()).start();
}
}
