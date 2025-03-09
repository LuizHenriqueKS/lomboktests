package br.zul.tests.lombok.domain;

import br.zul.tests.lombok.domain.base.Domain;
import lombok.Data;

@Data
public class LombokDataDomain implements Domain {
    
    private Long id;
    private String name;
    private Integer age;

}
