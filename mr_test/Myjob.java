package mr_test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;

/**
 * Created by lichen on 2017/8/5.
 */
public class Myjob  extends Configuration implements tool {
    public static class MapClasss extends MapReduceBase implements Mapper<Text,Text,Text,Text>{

    }

}
