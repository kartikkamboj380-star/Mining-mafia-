package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class V extends InterfaceC6689c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39830a;

    /* synthetic */ V(String str, T5.g gVar) {
        this.f39830a = str;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.d
    public final String a() {
        return this.f39830a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC6689c.d)) {
            return false;
        }
        InterfaceC6689c.d dVar = (InterfaceC6689c.d) obj;
        String str = this.f39830a;
        if (str == null) {
            return dVar.a() == null;
        }
        return str.equals(dVar.a());
    }

    public final int hashCode() {
        String str = this.f39830a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f39830a + "}";
    }
}
