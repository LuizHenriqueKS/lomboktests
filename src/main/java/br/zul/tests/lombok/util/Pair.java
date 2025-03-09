package br.zul.tests.lombok.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pair<A, B> {
    
    private A a;
    private B b;

}
