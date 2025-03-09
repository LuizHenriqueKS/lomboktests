package br.zul.tests.lombok.domain;

import br.zul.tests.lombok.domain.base.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LombokGetterAndSetterDomainChild extends BaseDomain<Long> {
    
    private Long id;
    private String name;
    private Integer age;

}
