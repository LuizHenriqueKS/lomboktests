package br.zul.tests.lombok.domain;

import br.zul.tests.lombok.domain.base.Domain;

public class FullDomain implements Domain {
    
    private Long id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return String.format("FullDomain(id=%d)", id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null) return false;
        if (getClass()!=obj.getClass()) return false;
        FullDomain other = (FullDomain) obj;
        if (id==null){
            if (other.id!=null) return false;
        } else if (!id.equals(other.id)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id==null) ? 0 : id.hashCode());
        return result;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

}