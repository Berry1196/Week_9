boolean jobsDone = true;

void setup()
{
    println(isValueGreaterThanThreshold(10, 5));
    println(isValueGreaterThanThreshold(4, 8));
    
    if (isJobDone())
    {
        println("Job's done!"); 
    }
}

boolean isValueGreaterThanThreshold(int value, int threshold) 
{
  boolean result = false;
    if (value > threshold) 
    {
      result = true;
                        
    }
    return result;
}

boolean isJobDone()
{
    return jobsDone;    
}
