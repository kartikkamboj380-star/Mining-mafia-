package com.google.firebase.datatransport;

import Z6.h;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p057f6.C6982c;
import p057f6.E;
import p057f6.InterfaceC6983d;
import p057f6.g;
import p057f6.q;
import p125m4.j;
import p145o4.u;
import p237x6.b;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ j a(InterfaceC6983d interfaceC6983d) {
        u.f((Context) interfaceC6983d.a(Context.class));
        return u.c().g(a.f16790g);
    }

    public static /* synthetic */ j b(InterfaceC6983d interfaceC6983d) {
        u.f((Context) interfaceC6983d.a(Context.class));
        return u.c().g(a.f16791h);
    }

    public static /* synthetic */ j c(InterfaceC6983d interfaceC6983d) {
        u.f((Context) interfaceC6983d.a(Context.class));
        return u.c().g(a.f16791h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C6982c> getComponents() {
        return Arrays.asList(C6982c.e(j.class).h(LIBRARY_NAME).b(q.l(Context.class)).f(new g() { // from class: x6.c
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return TransportRegistrar.c(interfaceC6983d);
            }
        }).d(), C6982c.c(E.a(p237x6.a.class, j.class)).b(q.l(Context.class)).f(new g() { // from class: x6.d
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return TransportRegistrar.b(interfaceC6983d);
            }
        }).d(), C6982c.c(E.a(b.class, j.class)).b(q.l(Context.class)).f(new g() { // from class: x6.e
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return TransportRegistrar.a(interfaceC6983d);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
