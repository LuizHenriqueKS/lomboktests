# lomboktests

### Project Description

This project demonstrates the usage of Lombok library in Java to reduce boilerplate code. It includes various domain classes that utilize Lombok annotations such as `@Data`, `@Getter`, `@Setter`, `@EqualsAndHashCode`, and `@ToString`. The output section shows the results of invoking `toString`, `equals`, and `hashCode` methods on instances of these domain classes, highlighting the differences in behavior when using Lombok annotations.

### Output
```
===================================
>> toString <<
SimpleDomain -> br.zul.tests.lombok.domain.SimpleDomain@6c8a68c1 || br.zul.tests.lombok.domain.SimpleDomain@56193c7d
FullDomain -> FullDomain(id=2) || FullDomain(id=2)
LombokDataDomain -> LombokDataDomain(id=3, name=icdhrpzcax, age=80) || LombokDataDomain(id=3, name=leadhkzgfc, age=10)
LombokDataDomainChild -> LombokDataDomainChild(id=4, name=nzvtteiawr, age=6) || LombokDataDomainChild(id=4, name=bedcwgldjr, age=74)
LombokGetterAndSetterDomain -> br.zul.tests.lombok.domain.LombokGetterAndSetterDomain@4fcc529 || br.zul.tests.lombok.domain.LombokGetterAndSetterDomain@25cc7470
LombokGetterAndSetterDomainChild -> LombokGetterAndSetterDomainChild(id=6) || LombokGetterAndSetterDomainChild(id=6)
BestLombokDomain -> BestLombokDomain(id=7) || BestLombokDomain(id=7)
===================================
>> equals <<
SimpleDomain -> false
FullDomain -> true
LombokDataDomain -> false
LombokDataDomainChild -> false
LombokGetterAndSetterDomain -> false
LombokGetterAndSetterDomainChild -> true
BestLombokDomain -> true
===================================
>> hashCode <<
SimpleDomain -> 1821010113 || 1444494461 => [not equals]
FullDomain -> 33 || 33 => [equals]
LombokDataDomain -> 1661140602 || 1272238053 => [not equals]
LombokDataDomainChild -> 1527520707 || -233124461 => [not equals]
LombokGetterAndSetterDomain -> 83674409 || 634156144 => [not equals]
LombokGetterAndSetterDomainChild -> 641030351 || 641030351 => [equals]
BestLombokDomain -> 66 || 66 => [equals]
===================================
```