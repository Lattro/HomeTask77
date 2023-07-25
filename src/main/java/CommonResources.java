public class CommonResources
{
    private int val;
    public CommonResources(int val) {
        this.val = val;
    }
    public synchronized  void action()
    {
        for (int i = 0; i < 10; i++)
        {
            val -=1;
        }
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName());
        System.out.println(val);
    }
}
