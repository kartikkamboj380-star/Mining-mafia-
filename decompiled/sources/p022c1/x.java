package p022c1;

import r9.AbstractC7112o;
import r9.InterfaceC7107j;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final w a(InterfaceC7107j interfaceC7107j, AbstractC7112o abstractC7112o, w.a aVar) {
        return new z(interfaceC7107j, abstractC7112o, aVar);
    }

    public static final w b(T t10, AbstractC7112o abstractC7112o, String str, AutoCloseable autoCloseable, w.a aVar) {
        return new v(t10, abstractC7112o, str, autoCloseable, aVar);
    }

    public static /* synthetic */ w c(InterfaceC7107j interfaceC7107j, AbstractC7112o abstractC7112o, w.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return a(interfaceC7107j, abstractC7112o, aVar);
    }

    public static /* synthetic */ w d(T t10, AbstractC7112o abstractC7112o, String str, AutoCloseable autoCloseable, w.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return b(t10, abstractC7112o, str, autoCloseable, aVar);
    }
}
