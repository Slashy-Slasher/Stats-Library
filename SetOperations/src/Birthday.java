package src;

import java.util.ArrayList;

public class Birthday
{
    public static void main(String[] argsWH)
    {
        int classSize = 23;
        int count = 0;
        int timesRan = 1000000;
        Birthday Bday = new Birthday();
        for(int i = 0; i< timesRan;i++)
        {
            if(Bday.testLoop(classSize) == 1)
            {
                count++;
            }
        }
        //Bday.testLoop();
        System.out.println((double)((double)count/(double)timesRan)*100 +"%");
    }
    public int testLoop(int classSize)
    {

        double sameBirthday = 0;
        int count = 0;
        ArrayList<Person> classroom = new ArrayList<Person>();
        for(int i = 0; i<classSize; i++)
        {
            classroom.add(new Person());
        }
        //System.out.println(hasBirthday(classroom));
        if(hasBirthday(classroom))
        {
            count = 1;
        }
        return count;
    }

    public boolean hasBirthday(ArrayList<Person> classroom)
    {
        boolean output = false;
        for(int i = 0; i < classroom.size(); i++)
        {
            for(int j = 0; j < classroom.size(); j++)
            {
                if((classroom.get(i).getBirthday() == classroom.get(j).getBirthday()) && (i != j))
                {
                    //System.out.println("Person A bday: "+ i +" " + classroom.get(i).getBirthday() );
                    //System.out.println("Person B bday: "+ j +" " + classroom.get(j).getBirthday() );

                    output = true;
                    i = classroom.size();
                    j = classroom.size();
                }
            }
        }
        return output;
    }

}

