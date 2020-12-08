package pack1;

public class CPU {
 private int speed; 
 private int tem;
 int gettem() {
  return tem;
 }
 public void settem( int tem) {
  if(tem>=45&&tem<=65) {
   this.tem=tem;
  }
 }
 public void setSpeed(int m){
  this.speed = m;
  }
 int getSpeed(){  
  return speed ;
  }
 }