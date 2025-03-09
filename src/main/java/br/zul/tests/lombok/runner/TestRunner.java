package br.zul.tests.lombok.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.zul.tests.lombok.domain.base.Domain;
import br.zul.tests.lombok.factory.DomainFactory;
import br.zul.tests.lombok.util.Pair;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@RequiredArgsConstructor
public class TestRunner implements CommandLineRunner {

    private final DomainFactory domainFactory;

    @Override
    public void run(String... args) throws Exception {
        List<Pair<Domain, Domain>> domainPairs = createDomainPairs();
        logSeparator();
        testToString(domainPairs);
        testToEquals(domainPairs);
        testToHashCode(domainPairs);
    }

    private void testToString(List<Pair<Domain, Domain>> domainPairs) {
        logStartTest("toString");
        for (Pair<Domain, Domain> pair: domainPairs) {
            String domainName = pair.getA().getClass().getSimpleName();
            log.info("{} -> {} || {}", domainName, pair.getA().toString(), pair.getB().toString());
        }
        logSeparator();
    }

    private void testToEquals(List<Pair<Domain, Domain>> domainPairs) {
        logStartTest("equals");
        for (Pair<Domain, Domain> pair: domainPairs) {
            String domainName = pair.getA().getClass().getSimpleName();
            Domain a = pair.getA();
            Domain b = pair.getB();
            log.info("{} -> {}", domainName, Objects.equals(a, b));
        }
        logSeparator();
    }

    private void testToHashCode(List<Pair<Domain, Domain>> domainPairs) {
        logStartTest("hashCode");
        for (Pair<Domain, Domain> pair: domainPairs) {
            String domainName = pair.getA().getClass().getSimpleName();
            Domain a = pair.getA();
            Domain b = pair.getB();
            String equalsStr = a.hashCode() == b.hashCode() ? "[equals]" : "[not equals]";
            log.info("{} -> {} || {} => {}", domainName, a.hashCode(), b.hashCode(), equalsStr);
        }
        logSeparator();
    }

    private void logStartTest(String testName) {
        log.info(">> {} <<", testName);
    }

    private void logSeparator(){
        log.info("===================================");
    }

    private List<Pair<Domain, Domain>> createDomainPairs() {
        List<Pair<Domain, Domain>> domainPairs = new ArrayList<>();
        appendPair(domainPairs, domainFactory.randomSimpleDomainWithId(1L), domainFactory.randomSimpleDomainWithId(1L));
        appendPair(domainPairs, domainFactory.randomFullDomainWithId(2L), domainFactory.randomFullDomainWithId(2L));
        appendPair(domainPairs, domainFactory.randomLombokDataDomainWithId(3L), domainFactory.randomLombokDataDomainWithId(3L));
        appendPair(domainPairs, domainFactory.randomLombokDataDomainChildWithId(4L), domainFactory.randomLombokDataDomainChildWithId(4L));
        appendPair(domainPairs, domainFactory.randomLombokGetterAndSetterDomainWithId(5L), domainFactory.randomLombokGetterAndSetterDomainWithId(5L));
        appendPair(domainPairs, domainFactory.randomLombokGetterAndSetterDomainChildWithId(6L), domainFactory.randomLombokGetterAndSetterDomainChildWithId(6L));
        appendPair(domainPairs, domainFactory.randomBestLombokDomainWithId(7L), domainFactory.randomBestLombokDomainWithId(7L));
        return domainPairs;
    }

    private <T> void appendPair(List<Pair<T, T>> pairs, T pairItemA, T pairItemB) {
        Pair<T, T> pair = new Pair<>(pairItemA, pairItemB);
        pairs.add(pair);
    }

}
