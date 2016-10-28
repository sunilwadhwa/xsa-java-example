package tinyworld.tinyjava.tinyweb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TinyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
       return new Class[] { TinyWebConfiguration.class };
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {
       return null;
   }
 
   @Override
   protected String[] getServletMappings() {
       return new String[] { "/" };
   }

}
