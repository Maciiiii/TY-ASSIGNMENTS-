


#include<stdio.h>
#include<stdlib.h>


int ref_str[30];
int pfct=0,i,fr,pno1, p, flag=0;
int len;
 frames[10];

int pagefound (int pno1)
{

    for (i=0; i<fr; i++)
        if(frames[i]==pno1)
            return 1;
    return 0;


}

void main()
{
    printf("\n Enter no. of frames: ");
    scanf("%d", &fr);
    printf("\n Enter length of referencestring: ");
    scanf("%d",&len);
    printf("\n Enter  referencestring: ");
    for (i=0; i<len; i++)
        scanf("%d",&ref_str[i]);

    for (i=0; i<fr; i++)
        frames[i]=-1;

    printf("\n Page No page  frames pagefault pfct");

    printf("\n------------------------------------------");
    for (p=0; p<len; p++)
    {
        pno1=ref_str[p];
        flag=0;

        if (pagefound (pno1)==0)
        {
            frames[pfct%fr]=pno1;

            pfct++;

            flag=1;

        }

        printf("\n %d\t",pno1);
        for (i=0; i<fr; i++)
            printf("  %d  ", frames[i]);

        if(flag==1)
            printf("\tYES");

        else
        {
            printf("\tNO");

        }
        //  printf("\t%d",pfct);

    }

    printf("\n-------------------------------------------");

    printf("\n Total No. of page fault : %d", pfct);

}

frames[j].pno = pno1;

            flag = 1;

        }
        frames[j].counter = currtime;
        currtime++;
        printf("\n%5d\t", pno1);
        for (i = 0; i < n; i++)
            printf("  %d ", frames[i]);


        if (flag == 1)
            printf("\t YES");
        else {
            printf("\t NO");
            cnt++;
        }

    }
    printf("\n----------------------------");
    // hr = ((page_fault)/np);
    // mr = ((cnt)/np);
    printf("\nNo. of page fault: %d ", page_fault);
    printf("\nNo. of page Hits: %d ", cnt);

    // printf("\nHit Ratio : %.3f ",hr);
    //printf("\nMis Ratio : %.3f  ",mr);
}
