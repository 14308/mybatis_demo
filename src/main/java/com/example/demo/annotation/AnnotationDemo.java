package com.example.demo.annotation;

import com.example.demo.config.AnnotationConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by 陆小凤 on 2017/8/3.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
/*@Import({AnnotationConfig.class})*/
public @interface AnnotationDemo {
}
