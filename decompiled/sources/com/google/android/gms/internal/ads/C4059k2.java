package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4059k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4437n2 f30676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4437n2 f30677b;

    public C4059k2(C4437n2 c4437n2, C4437n2 c4437n3) {
        this.f30676a = c4437n2;
        this.f30677b = c4437n3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4059k2.class == obj.getClass()) {
            C4059k2 c4059k2 = (C4059k2) obj;
            if (this.f30676a.equals(c4059k2.f30676a) && this.f30677b.equals(c4059k2.f30677b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30676a.hashCode() * 31) + this.f30677b.hashCode();
    }

    public final String toString() {
        C4437n2 c4437n2 = this.f30676a;
        C4437n2 c4437n3 = this.f30677b;
        String string = c4437n2.toString();
        String strConcat = c4437n2.equals(c4437n3) ? "" : ", ".concat(c4437n3.toString());
        StringBuilder sb = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb.append("[");
        sb.append(string);
        sb.append(strConcat);
        sb.append("]");
        return sb.toString();
    }
}
