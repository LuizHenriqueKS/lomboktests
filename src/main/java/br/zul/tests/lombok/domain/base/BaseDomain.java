package br.zul.tests.lombok.domain.base;

public abstract class BaseDomain<ID> implements Domain {
    
    @Override
    public String toString() {
        String domainName = getClass().getSimpleName();
        String idStr = String.valueOf(getId());
        return String.format("%s(id=%s)", domainName, idStr);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        BaseDomain<?> that = (BaseDomain<?>) other;
        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode() + ( getId() != null ? getId().hashCode() : 0 );
    }

    public abstract ID getId();
 
}
