package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p057f6.C6982c;
import p057f6.InterfaceC6983d;
import p057f6.q;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public p087i6.a b(InterfaceC6983d interfaceC6983d) {
        Context context = (Context) interfaceC6983d.a(Context.class);
        return c.f(context, !p087i6.f.g(context));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C6982c.e(p087i6.a.class).h("fire-cls-ndk").b(q.l(Context.class)).f(new p057f6.g() { // from class: v6.a
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return this.f50192a.b(interfaceC6983d);
            }
        }).e().d(), Z6.h.b("fire-cls-ndk", "20.0.4"));
    }
}
