package pack1;

public class PC {
 CPU cpu;
 CPU p;
    HardDisk HD;
    void setCPU(CPU c){
        this.cpu = c;
    }
    void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    void show(){
        System.out.println("CPU�ٶȣ�"+cpu.getSpeed());
        System.out.println("Ӳ��������"+HD.getAmount());
        System.out.println("CPU�¶ȣ�"+cpu.gettem());
        System.out.println("Ӳ�̵�Ʒ�ƣ�"+HD.getBrand());
    }
}