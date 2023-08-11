// Accept number from user and count number of digits

import java.util.*;

class Digits
{
    public int CountDigit(int iValue)
    {
        int iCount = 0;
        int iDigit = 0;
        
        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iCount++;
            iValue = iValue / 10;
        }
        
        return iCount;
    }
}

class Program07
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDigit(iNo);
        System.out.println("Number of digits are: "+ iRet);

        sobj.close();
    }
}
