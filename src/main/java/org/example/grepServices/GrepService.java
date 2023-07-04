package org.example.grepServices;

import java.util.List;
public class GrepService {
    public String grepService(List<String> lines, String word){
        String result="";
        for (int i=0;i<lines.size();i++){
            String line=lines.get(i);
            if (line.toLowerCase().contains(word.toLowerCase())){
                result+=line+"\n";
            }
        }
        return result;
    }

}
