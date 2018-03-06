import org.apache.catalina.startup.Tomcat;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setProperty("java.awt.headless", "true");

        // Disable JAR scanning to improve startup performance.
        System.setProperty("tomcat.util.scan.StandardJarScanFilter.jarsToSkip", "*");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.setBaseDir(System.getProperty("java.io.tmpdir"));

        tomcat.start();
        tomcat.getServer().await();
    }
}
