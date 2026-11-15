package p088i7;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p057f6.C6982c;
import p057f6.InterfaceC6983d;
import p057f6.g;
import p057f6.i;

/* JADX INFO: loaded from: classes3.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, C6982c c6982c, InterfaceC6983d interfaceC6983d) {
        try {
            c.b(str);
            return c6982c.h().a(interfaceC6983d);
        } finally {
            c.a();
        }
    }

    @Override // p057f6.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C6982c c6982cR : componentRegistrar.getComponents()) {
            final String strI = c6982cR.i();
            if (strI != null) {
                c6982cR = c6982cR.r(new g() { // from class: i7.a
                    @Override // p057f6.g
                    public final Object a(InterfaceC6983d interfaceC6983d) {
                        return b.b(strI, c6982cR, interfaceC6983d);
                    }
                });
            }
            arrayList.add(c6982cR);
        }
        return arrayList;
    }
}
