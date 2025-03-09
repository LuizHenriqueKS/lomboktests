package br.zul.tests.lombok.factory;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

import br.zul.tests.lombok.domain.BestLombokDomain;
import br.zul.tests.lombok.domain.FullDomain;
import br.zul.tests.lombok.domain.LombokDataDomain;
import br.zul.tests.lombok.domain.LombokDataDomainChild;
import br.zul.tests.lombok.domain.LombokGetterAndSetterDomain;
import br.zul.tests.lombok.domain.LombokGetterAndSetterDomainChild;
import br.zul.tests.lombok.domain.SimpleDomain;

@Component
public class DomainFactory {

    private final Random random = new SecureRandom();

    public SimpleDomain randomSimpleDomainWithId(Long id) {
        SimpleDomain domain = new SimpleDomain();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }
    
    public FullDomain randomFullDomainWithId(Long id) {
        FullDomain domain = new FullDomain();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }

    public LombokDataDomain randomLombokDataDomainWithId(Long id) {
        LombokDataDomain domain = new LombokDataDomain();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }

    public LombokDataDomainChild randomLombokDataDomainChildWithId(Long id) {
        LombokDataDomainChild domain = new LombokDataDomainChild();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }

    public LombokGetterAndSetterDomain randomLombokGetterAndSetterDomainWithId(Long id) {
        LombokGetterAndSetterDomain domain = new LombokGetterAndSetterDomain();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }

    public LombokGetterAndSetterDomainChild randomLombokGetterAndSetterDomainChildWithId(Long id) {
        LombokGetterAndSetterDomainChild domain = new LombokGetterAndSetterDomainChild();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }

    public BestLombokDomain randomBestLombokDomainWithId(Long id) {
        BestLombokDomain domain = new BestLombokDomain();
        domain.setId(id);
        domain.setName(generateName());
        domain.setAge(generateAge());
        return domain;
    }

    private String generateName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    private int generateAge() {
        return random.nextInt(100);
    }

}
