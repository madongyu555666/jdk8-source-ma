import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author madongyu
 * @projectName jdk8-source-ma
 * @description: jdk版本jdk1.8.0_60
 * @date 2020/6/513:51
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("jdk1.8.0_60");

        HashMap map=new HashMap();
        map.put("2","1");
        map.get("2");
       /* ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put("1","2");*/
    }
}
