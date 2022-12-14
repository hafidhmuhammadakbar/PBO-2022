// Class ThreadPrint
//      extends Class Thread, berarti mewarisi semua attribute dan method dari Class Thread
class ThreadPrint extends Thread{
    Object[] ObjectName;

    // Konstruktor
    public ThreadPrint (Object[] objectName){
        ObjectName = objectName;
    }
    
    @Override
    public void run() {
        for (Object objectPrint : ObjectName){
            System.out.println(objectPrint);
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}