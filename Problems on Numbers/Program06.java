// Accept number from user and return multiplication of even factors of that number

import java.util.*;

class Numbers
{
    public int EvenFact(int iValue)
    {
        int iMult = 1;
        for(int iCnt = 2; iCnt <= iValue; iCnt= iCnt + 2)
        {
            if((iValue % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}

class Program06
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.EvenFact(iNo);
        System.out.println("Multiplication of even numbers: "+ iRet);

        sobj.close();
    }
}
