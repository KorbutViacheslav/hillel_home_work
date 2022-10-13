package home_work_5;

class Animal {
    static int count;
    public Animal(){
    count++;
        System.out.println("Created animal(s): "+this.count);
    }
    public void run(int maxdis){
        System.out.println("I cant running max");
    }
    public void swim(int maxswim){

    }
}
