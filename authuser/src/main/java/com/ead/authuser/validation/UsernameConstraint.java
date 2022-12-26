package com.ead.authuser.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


//criação de anotação UsernameConstraint
@Documented
//classe UsernameConstraintImpl implementara a interface UsernameConstraint
@Constraint(validatedBy = UsernameConstraintImpl.class)
//pode-se usar a anotação no metodo ou em algum campo/atributo
@Target({ElementType.METHOD, ElementType.FIELD})
//executar anotação em tempo de execução
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameConstraint {

    //obrigatório, parametros default do bean validation
    String message() default "Invalid username";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
