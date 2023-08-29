package ra.Config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("1111111111111111111");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("2222222222");
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("33333333333");
        return new String[]{"/"};
    }
//    @Override
//    protected Filter[] getServletFilters() {
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setForceEncoding(true);
//        filter.setEncoding("UTF-8");
//        return new Filter[]{filter};
//    }
}
