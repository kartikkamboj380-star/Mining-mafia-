package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p108k7.B;
import p108k7.z;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40928a;

    public l(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f40928a = bool;
    }

    private static boolean s(l lVar) {
        Object obj = lVar.f40928a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f40928a == null) {
            return lVar.f40928a == null;
        }
        if (s(this) && s(lVar)) {
            if ((this.f40928a instanceof BigInteger) || (lVar.f40928a instanceof BigInteger)) {
                return l().equals(lVar.l());
            }
            return p().longValue() == lVar.p().longValue();
        }
        Object obj2 = this.f40928a;
        if (obj2 instanceof Number) {
            Object obj3 = lVar.f40928a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return k().compareTo(lVar.k()) == 0;
                }
                double dO = o();
                double dO2 = lVar.o();
                return dO == dO2 || (Double.isNaN(dO) && Double.isNaN(dO2));
            }
        }
        return obj2.equals(lVar.f40928a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f40928a == null) {
            return 31;
        }
        if (s(this)) {
            jDoubleToLongBits = p().longValue();
        } else {
            Object obj = this.f40928a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(p().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal k() {
        Object obj = this.f40928a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : B.b(q());
    }

    public BigInteger l() {
        Object obj = this.f40928a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return s(this) ? BigInteger.valueOf(p().longValue()) : B.c(q());
    }

    public boolean m() {
        return r() ? ((Boolean) this.f40928a).booleanValue() : Boolean.parseBoolean(q());
    }

    public double o() {
        return t() ? p().doubleValue() : Double.parseDouble(q());
    }

    public Number p() {
        Object obj = this.f40928a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new z((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String q() {
        Object obj = this.f40928a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (t()) {
            return p().toString();
        }
        if (r()) {
            return ((Boolean) this.f40928a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f40928a.getClass());
    }

    public boolean r() {
        return this.f40928a instanceof Boolean;
    }

    public boolean t() {
        return this.f40928a instanceof Number;
    }

    public boolean u() {
        return this.f40928a instanceof String;
    }

    public l(Number number) {
        Objects.requireNonNull(number);
        this.f40928a = number;
    }

    public l(String str) {
        Objects.requireNonNull(str);
        this.f40928a = str;
    }
}
