//[ N 찍기 ] - C언어
#include <stdio.h>

    int main(void)
{
        int N;
        int i;
        
        scanf("%d",&N);
        
        for(i=1; N>=i; i++)
        {
            printf("%d\n",i);
        }
        
  return 0;      
}
