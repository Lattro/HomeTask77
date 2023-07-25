public class ThreadClass extends Thread
{
    CommonResources commonResources;
    public ThreadClass(CommonResources commonResources)
    {
        this.commonResources = commonResources;
    }
    @Override
    public void run()
    {
        commonResources.action();
    }
}
