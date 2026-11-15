package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class T7 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D3 f36498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f36499d;

    public T7(D3 d10) {
        super("require");
        this.f36499d = new HashMap();
        this.f36498c = d10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        InterfaceC6289p interfaceC6289p;
        B2.a("require", 1, list);
        String strZzc = c6157a2.a((InterfaceC6289p) list.get(0)).zzc();
        Map map = this.f36499d;
        if (map.containsKey(strZzc)) {
            return (InterfaceC6289p) map.get(strZzc);
        }
        Map map2 = this.f36498c.f36261a;
        if (map2.containsKey(strZzc)) {
            try {
                interfaceC6289p = (InterfaceC6289p) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            interfaceC6289p = InterfaceC6289p.f36808x;
        }
        if (interfaceC6289p instanceof AbstractC6235j) {
            this.f36499d.put(strZzc, (AbstractC6235j) interfaceC6289p);
        }
        return interfaceC6289p;
    }
}
