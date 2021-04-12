package lesson_17;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //проставляем путь к конфигурационному файлу
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //mapping запросов по url(все запросы от пользователей послыаются на наш Dispatcher servlet)
        return new String[]{"/"};
    }
}
