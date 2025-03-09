package br.zul.tests.lombok.domain;

import br.zul.tests.lombok.domain.base.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class LombokDataDomainChild extends BaseDomain<Long> {
    
    private Long id;
    private String name;
    private Integer age;

}
