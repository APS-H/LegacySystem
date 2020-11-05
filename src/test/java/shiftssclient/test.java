package shiftssclient;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
public class test {
    public static void main(String args[]) throws Exception_Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8086/ERP?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("getResourceAll");
            List<Object> s=(List)objects[0];
            Object a=s.get(0);
            Field f=s.get(0).getClass().getDeclaredField("code");
            f.setAccessible(true);
            System.out.println("返回数据:" +(String)f.get(s.get(0)));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

    }
}
