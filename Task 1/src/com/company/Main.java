package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    public static void main(String[] args)
        {
            int sortingArr[] =  {8,9,1,5,11,13,7,4,6,3,12,10,2};
            int result[] = sortingMethod(sortingArr);
            for(int a:result)
            {
                System.out.println(a);
            }
            int i = 1;
            boolean loopDone = false;
            while ( i <= sortingMethod(sortingArr).length && !loopDone) {
                System.out.println(i);

                if(sortingMethod(sortingArr).length == i)
                {
                    loopDone = true;
                }
                i++;
        }
        }
        public static int[] sortingMethod(int[] sortingArr)
        {
            int tmp;
            for(int i=0;i<sortingArr.length;i++)
            {
                for(int j=i;j<sortingArr.length;j++)
                {
                    if(sortingArr[i]>sortingArr[j])
                    {
                        tmp = sortingArr[i];
                        sortingArr[i] = sortingArr[j];
                        sortingArr[j] = tmp;
                    }
                }
            }
            return sortingArr;
        }
    }

