import java.util.*;
public class Main
{
    static int findNext(String[] people,int i,int n)
    {
        while(people[i]=="")
        {
            i=(i+1)%people.length;
        }
        return i;
    }
    
    static String solve(String[] people,int[] time)
    {
        int ind_time=0,ind_people=0;
        int cur_people=people.length;
        
        while(cur_people>1)
        {
            for(int i=0;i<time[ind_time];i++)
            {
                ind_people=findNext(people,(ind_people+1)%people.length,people.length);
            }
            people[ind_people]="";
            ind_people=findNext(people,ind_people,people.length);
            ind_time=(ind_time+1)%time.length;
            cur_people--;
        }
        
        int i=0;
        while(people[i]=="")
        {
            i++;
        }
        
        return people[i];
    }
    
	public static void main(String[] args) {
	    
	    int[] time={1,2};
	    String[] people={"a","b","c","d"};
	    
        System.out.println(solve(people,time));	    
	}
}
