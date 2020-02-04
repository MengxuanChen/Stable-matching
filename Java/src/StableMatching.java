import java.util.*;

public class StableMatching {

    public static void main (String args[]){
        String employerFile = "C:/Users/Max/Downloads/coop_e_10x10.csv";
        String studentFile = "C:/Users/Max/Downloads/coop_s_10x10.csv";
        String cvsSplitter = ",";
        String line = "";
        MatchingCore matchingCore = new MatchingCore();
        Map<String, Company> employer = new HashMap<String, Company>();
        Map<String, Company> student = new HashMap<String, Company>();
        ArrayList<String[]> match = new ArrayList<String[]>();
        CVSParser cvsParser = new CVSParser();
        cvsParser.parser(employer,employerFile,cvsSplitter,line,"Company");
        cvsParser.parser(student,studentFile,cvsSplitter,line,"Student");
        int matchingNum = employer.keySet().size();
       // matchingCore.allMatched(employer);
    }
}
