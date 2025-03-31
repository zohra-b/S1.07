package org;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //to make it available at runtime.
@Target(ElementType.TYPE)  //  so it can only be used on classes
public @interface MyAnnotation {
    String directory();
}
