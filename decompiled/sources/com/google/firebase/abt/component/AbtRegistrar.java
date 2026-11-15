package com.google.firebase.abt.component;

import Z6.h;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p057f6.C6982c;
import p057f6.InterfaceC6983d;
import p057f6.g;
import p057f6.q;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(InterfaceC6983d interfaceC6983d) {
        return new a((Context) interfaceC6983d.a(Context.class), interfaceC6983d.f(p037d6.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6982c> getComponents() {
        return Arrays.asList(C6982c.e(a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.j(p037d6.a.class)).f(new g() { // from class: c6.a
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return AbtRegistrar.a(interfaceC6983d);
            }
        }).d(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
