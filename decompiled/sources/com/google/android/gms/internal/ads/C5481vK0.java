package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5481vK0 extends AbstractC4977rK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34034a;

    public C5481vK0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f34034a = bool;
    }

    private static boolean m(C5481vK0 c5481vK0) {
        Object obj = c5481vK0.f34034a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4977rK0
    public final String a() {
        Object obj = this.f34034a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return i().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(obj.getClass())));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5481vK0.class != obj.getClass()) {
            return false;
        }
        C5481vK0 c5481vK0 = (C5481vK0) obj;
        Object obj2 = this.f34034a;
        if (obj2 == null) {
            return c5481vK0.f34034a == null;
        }
        if (m(this) && m(c5481vK0)) {
            if ((obj2 instanceof BigInteger) || (c5481vK0.f34034a instanceof BigInteger)) {
                return l().equals(c5481vK0.l());
            }
            return i().longValue() == c5481vK0.i().longValue();
        }
        if (obj2 instanceof Number) {
            Object obj3 = c5481vK0.f34034a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return k().compareTo(c5481vK0.k()) == 0;
                }
                double dJ = j();
                double dJ2 = c5481vK0.j();
                if (dJ != dJ2) {
                    return Double.isNaN(dJ) && Double.isNaN(dJ2);
                }
                return true;
            }
        }
        return obj2.equals(c5481vK0.f34034a);
    }

    public final boolean g() {
        Object obj = this.f34034a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(a());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Object obj = this.f34034a;
        if (obj == null) {
            return 31;
        }
        if (m(this)) {
            jDoubleToLongBits = i().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number i() {
        Object obj = this.f34034a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new AK0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final double j() {
        return this.f34034a instanceof Number ? i().doubleValue() : Double.parseDouble(a());
    }

    public final BigDecimal k() {
        Object obj = this.f34034a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : KK0.a(a());
    }

    public final BigInteger l() {
        Object obj = this.f34034a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return m(this) ? BigInteger.valueOf(i().longValue()) : KK0.b(a());
    }

    public final boolean zza() {
        return this.f34034a instanceof Boolean;
    }

    public final boolean zzc() {
        return this.f34034a instanceof Number;
    }

    public C5481vK0(Number number) {
        Objects.requireNonNull(number);
        this.f34034a = number;
    }

    public C5481vK0(String str) {
        Objects.requireNonNull(str);
        this.f34034a = str;
    }
}
