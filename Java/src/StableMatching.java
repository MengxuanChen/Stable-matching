import java.util.*;

public class StableMatching {

    public static void main (String args[]){
        String employerFile = "C:/Users/Max/Downloads/coop_e_10x10.csv";
        String studentFile = "C:/Users/Max/Downloads/coop_s_10x10.csv";
        String cvsSplitter = ",";
        String line = "";
        Map<String, Personnel> employer = new HashMap<String, Personnel>();;
        Map<String,Personnel> student = new HashMap<String, Personnel>();;
        CVSParser cvsParser = new CVSParser();
        cvsParser.parser(employer,employerFile,cvsSplitter,line);
        cvsParser.parser(student,studentFile,cvsSplitter,line);
    }
}
