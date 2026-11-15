package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class U extends InterfaceC6689c.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39829a;

    U() {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.d.a
    public final InterfaceC6689c.d a() {
        return new V(this.f39829a, null);
    }

    @Override // com.google.android.play.core.integrity.InterfaceC6689c.d.a
    public final InterfaceC6689c.d.a b(String str) {
        this.f39829a = str;
        return this;
    }
}
