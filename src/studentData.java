/**
 * Created by Izzat on 5/14/2016.
 */
public class studentData {
    private String firstName;
    private String lastName;


    private double[] testScores;

    private char grade;

    public studentData()
    {
        firstName = "";
        lastName = "";
        grade = '*';
        testScores = new double[5];
    }
    public char courseGrade(double ... list)
    {
        double avg = 0;
        double sum = 0;

        for(double num : list)
        {
            sum = sum + num;
        }
        if(list.length != 0)
        {
            avg = sum / list.length;
        }
        if(avg >= 90)
            return 'A';
        else if(avg >= 80)
            return 'B';
        else if(avg > 70)
            return 'C';
        else if(avg > 60)
            return 'D';
        else
            return 'F';
    }
    public studentData(String fname, String lname, double ... list)
    {
        firstName = fname;
        lastName = lname;
        testScores = list;
        grade = courseGrade(list);
    }
    public String toString()
    {
        String str;
        str = String.format("%-10s %-10s ", firstName, lastName);
        for(double score : testScores)
            str = str + String.format("%7.2f", score);


        str = str + "   " + grade;

        return str;
    }
}
