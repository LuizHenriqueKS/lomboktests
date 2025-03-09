package br.zul.tests.lombok.domain;

import br.zul.tests.lombok.domain.base.Domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(of="id")
@EqualsAndHashCode(of="id")
public class BestLombokDomain implements Domain {
    
    private Long id;
    private String name;
    private Integer age;

}
