import java.util.ArrayList;

public class JavaCollections {
    public static void main(String[] args){
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Bhargav");
        studentsName.add("Rushikesh");
        studentsName.add("Dhruvil");
        studentsName.add("Vinit");

        studentsName.add(1, "Kauntey");
        System.out.println(studentsName.indexOf("Dhruvil"));
        // studentsName.
        System.out.println(studentsName);
    }
}
