import java.util.*;

public class StableMatching {

    public static void main (String args[]){
        String employerFile = "C:/Users/Max/Downloads/coop_e_3x3.txt";
        String studentFile = "C:/Users/Max/Downloads/coop_s_3x3.txt";
        String cvsSplitter = ",";
        String line = "";
        MatchingCore matchingCore = new MatchingCore();
        Map<String, Company> employer = new HashMap<String, Company>();
        Map<String, Company> student = new HashMap<String, Company>();
        Map<String, String> match = new HashMap<String, String>();
        CVSParser cvsParser = new CVSParser();
        cvsParser.parser(employer,employerFile,cvsSplitter,line,"Company");
        cvsParser.parser(student,studentFile,cvsSplitter,line,"Student");
        int matchingNum = employer.keySet().size();
        matchingCore.match(employer,student,match,matchingNum);
        System.out.println("lool");
    }
}
