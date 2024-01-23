public class CountDownClock extends Thread	//CountDownClock class extends the Thread class
{
    public void run()	
    {
        for (int t = 20; t >= 0; t--)	
        {
            System.out.println("T minus " + t);
            try
            {
                Thread.sleep(1000);	
            }
            catch (InterruptedException e)
            {}
        }
    }
}
