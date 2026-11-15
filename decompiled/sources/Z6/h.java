package Z6;

import android.content.Context;
import p057f6.C6982c;
import p057f6.InterfaceC6983d;
import p057f6.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C6982c b(String str, String str2) {
        return C6982c.l(f.a(str, str2), f.class);
    }

    public static C6982c c(final String str, final a aVar) {
        return C6982c.m(f.class).b(q.l(Context.class)).f(new p057f6.g() { // from class: Z6.g
            @Override // p057f6.g
            public final Object a(InterfaceC6983d interfaceC6983d) {
                return f.a(str, aVar.a((Context) interfaceC6983d.a(Context.class)));
            }
        }).d();
    }
}
