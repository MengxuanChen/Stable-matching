import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class CVSParser {

    public void parser(Map personnel, String location, String cvsSplitter, String line){
        try (BufferedReader br = new BufferedReader(new FileReader(location))) {

            while ((line = br.readLine()) != null) {
                String name = line.split(cvsSplitter)[0];
                String [] rank = Arrays.copyOfRange(line.split(cvsSplitter),1,line.split(cvsSplitter).length);
                Personnel tmp = new Personnel(name,false,rank);
                personnel.put(name,tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
