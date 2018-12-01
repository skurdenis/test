package com.dreamwork.art.service.converters;
import com.dreamwork.art.model.Metric;
import com.dreamwork.art.service.Converter;
import org.apache.commons.lang3.StringUtils;
import java.util.*;




public class TwoMetrics implements Converter {


    @Override
    public List<Metric> convert(LinkedHashMap projectData) {
        String data =  projectData.get("data").toString();


        int count=0;
        int count1=0;
        int countmile=0;
        int countclosedmile=0;
        count=StringUtils.countMatches(data, "closed=true");
        count1=StringUtils.countMatches(data, "closed=false")+count;
        countmile=StringUtils.countMatches(data, "dueOn");
        countclosedmile=StringUtils.countMatches(data, "state=CLOSED");
        float ans=0;
        if(count1==0) ans=1; else ans=(float) count/count1;

        float toreturnprogress=ans*(countclosedmile+1)/countmile;
        float toreturncount=count1;
        for (Object me:projectData.entrySet()) {
            System.out.print(me);
        }
        Metric test1=new Metric("progress", toreturnprogress);
        Metric test2=new Metric("countclosed", toreturncount);
        List<Metric> toreturn=new ArrayList<>();
        Collections.addAll(toreturn, test1,test2);
        return toreturn;

    }

    @Override
    public Set<String> types() {

        Set<String> s=new HashSet<String>() {{
            add("progress");
            add("countclosed");
        }};
        return s;
    }

}




