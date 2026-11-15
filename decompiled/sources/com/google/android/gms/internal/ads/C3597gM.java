package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3597gM implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f28625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3636gf0 f28626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.w f28627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RunnableC3886ie0 f28628d;

    /* synthetic */ C3597gM(C3723hM c3723hM, C3636gf0 c3636gf0, L4.w wVar, RunnableC3886ie0 runnableC3886ie0, byte[] bArr) {
        this.f28625a = new WeakReference(c3723hM);
        this.f28626b = c3636gf0;
        this.f28627c = wVar;
        this.f28628d = runnableC3886ie0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        C3723hM c3723hM = (C3723hM) this.f28625a.get();
        String str = (String) map.get("u");
        if (c3723hM == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f28626b.b(str, this.f28627c, this.f28628d, c3723hM.z());
    }
}
