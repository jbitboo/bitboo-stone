package tech.bitboo.stone.annotations;

import java.lang.annotation.Documented;

@Documented
public @interface Caution
{
    String description() default "";
}
