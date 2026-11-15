package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2678Xs0 extends AbstractC2314Qs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25399a;

    C2678Xs0(Object obj) {
        this.f25399a = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2314Qs0
    public final Object a(Object obj) {
        return this.f25399a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2314Qs0
    public final AbstractC2314Qs0 b(InterfaceC1899Is0 interfaceC1899Is0) {
        Object objApply = interfaceC1899Is0.apply(this.f25399a);
        AbstractC2418Ss0.k(objApply, "the Function passed to Optional.transform() must not return null.");
        return new C2678Xs0(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2678Xs0) {
            return this.f25399a.equals(((C2678Xs0) obj).f25399a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25399a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f25399a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 13);
        sb.append("Optional.of(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
