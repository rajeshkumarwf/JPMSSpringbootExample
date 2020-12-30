module ModulePractice1 {
    requires org.apache.tomcat.embed.core;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.beans;

    opens com.example.ModulePractice1;
}