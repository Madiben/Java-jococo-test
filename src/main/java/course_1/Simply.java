public class Simply 
{

    public int MaxTwoNumber(int aLeft, int aRight)
    {
        int Max = 0;
        if (aLeft<aRight)
        {
            Max = aRight;
        }else{
            Max = aLeft;
        }
        return Max;
    }
}
