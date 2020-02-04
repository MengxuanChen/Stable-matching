import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CVSParser {

    public void parser(Map personnel, String location, String cvsSplitter, String line, String type){
        try (BufferedReader br = new BufferedReader(new FileReader(location))) {

            while ((line = br.readLine()) != null) {
                String name = line.split(cvsSplitter)[0];
                Queue<String> companyRank = new LinkedList<String>();
                List<String> studentRank = new ArrayList<String>();
                if("Company".equals(type)){
                    for (int i = 1 ; i <line.split(cvsSplitter).length;i++){
                        companyRank.add(line.split(cvsSplitter)[i]);
                    }
                    Company tmp = new Company(name,false,companyRank);
                    personnel.put(name,tmp);
                }else if ("Student".equals(type)){
                    studentRank = Arrays.asList(Arrays.copyOfRange(line.split(cvsSplitter),1,line.split(cvsSplitter).length));
                    Student tmp = new Student(name,false,studentRank);
                    personnel.put(name,tmp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
