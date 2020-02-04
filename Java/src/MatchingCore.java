import java.util.Map;

public class MatchingCore {

    public void match(Map employer, Map student, Map match, int matchingNum) {
        while (match.size() != matchingNum) {
            for (Object company : employer.keySet()) {
                Company tmp = (Company) employer.get(company);
                if (!tmp.isMatch()) {
                    String candidate = (String) tmp.getRank().poll();
                    Student prospect = (Student) student.get(candidate);
                    if(!prospect.isMatch()){
                        match.put(candidate,tmp.getName());
                        ((Company) employer.get(company)).setMatch(true);
                        ((Student) student.get(candidate)).setMatch(true);
                    }else{
                        int currentRank = prospect.getRank().indexOf(match.get(candidate));
                        int futureRank = prospect.getRank().indexOf(tmp.getName());
                        if(futureRank>currentRank){
                            String pastCompany =(String)match.get(candidate);
                            ((Company)employer.get(pastCompany)).setMatch(false);
                            ((Company)employer.get(tmp.getName())).setMatch(true);
                            match.replace(candidate,tmp.getName());
                        }else{
                            System.out.println(candidate+" has reject"+ tmp.getName()+"'s offer");
                        }
                    }
                }
            }
        }
    }
}
