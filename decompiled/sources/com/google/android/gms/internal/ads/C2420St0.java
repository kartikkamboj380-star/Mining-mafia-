package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.St0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2420St0 extends AbstractC5051rv0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC1899Is0 f23334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AbstractC5051rv0 f23335b;

    C2420St0(InterfaceC1899Is0 interfaceC1899Is0, AbstractC5051rv0 abstractC5051rv0) {
        this.f23334a = interfaceC1899Is0;
        this.f23335b = abstractC5051rv0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5051rv0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC1899Is0 interfaceC1899Is0 = this.f23334a;
        return this.f23335b.compare(interfaceC1899Is0.apply(obj), interfaceC1899Is0.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2420St0) {
            C2420St0 c2420St0 = (C2420St0) obj;
            if (this.f23334a.equals(c2420St0.f23334a) && this.f23335b.equals(c2420St0.f23335b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f23334a, this.f23335b);
    }

    public final String toString() {
        String string = this.f23335b.toString();
        int length = string.length();
        String string2 = this.f23334a.toString();
        StringBuilder sb = new StringBuilder(length + 12 + string2.length() + 1);
        sb.append(string);
        sb.append(".onResultOf(");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
