class ThreadPrint extends Thread{
    Object[] ObjectName;

    public ThreadPrint (Object[] objectName){
        ObjectName = objectName;
    }
    
    @Override
    public void run() {
        for (Object objectPrint : ObjectName){
            System.out.println(objectPrint);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.run();
    }
}