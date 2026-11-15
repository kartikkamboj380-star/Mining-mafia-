package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class R3 extends AbstractC6258l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X5.m f36480b;

    R3(Context context, X5.m mVar) {
        this.f36479a = context;
        this.f36480b = mVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6258l4
    final Context a() {
        return this.f36479a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6258l4
    final X5.m b() {
        return this.f36480b;
    }

    public final boolean equals(Object obj) {
        X5.m mVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6258l4) {
            AbstractC6258l4 abstractC6258l4 = (AbstractC6258l4) obj;
            if (this.f36479a.equals(abstractC6258l4.a()) && ((mVar = this.f36480b) != null ? mVar.equals(abstractC6258l4.b()) : abstractC6258l4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f36479a.hashCode() ^ 1000003;
        X5.m mVar = this.f36480b;
        return (iHashCode * 1000003) ^ (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        String string = this.f36479a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f36480b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
