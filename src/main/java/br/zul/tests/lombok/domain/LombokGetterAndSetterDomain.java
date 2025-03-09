package br.zul.tests.lombok.domain;

import br.zul.tests.lombok.domain.base.Domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokGetterAndSetterDomain implements Domain {
    
    private Long id;
    private String name;
    private Integer age;

}
