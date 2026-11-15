package com.google.firebase.analytics.connector.internal;

import Z6.h;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p057f6.C6982c;
import p057f6.InterfaceC6983d;
import p057f6.q;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p037d6.a lambda$getComponents$0(InterfaceC6983d interfaceC6983d) {
        return p037d6.b.h((p007a6.f) interfaceC6983d.a(p007a6.f.class), (Context) interfaceC6983d.a(Context.class), (D6.d) interfaceC6983d.a(D6.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<C6982c> getComponents() {
        return Arrays.asList(C6982c.e(p037d6.a.class).b(q.l(p007a6.f.class)).b(q.l(Context.class)).b(q.l(D6.d.class)).f(a.f39977a).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
