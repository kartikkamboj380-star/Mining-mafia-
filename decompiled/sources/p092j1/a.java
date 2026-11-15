package p092j1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p102k1.e;
import r9.InterfaceC7106i;
import r9.InterfaceC7107j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45408a = new a();

    private a() {
    }

    public final q a(InterfaceC7107j interfaceC7107j) {
        int i10 = Integer.parseInt(interfaceC7107j.U());
        long j10 = Long.parseLong(interfaceC7107j.U());
        long j11 = Long.parseLong(interfaceC7107j.U());
        n.a aVar = new n.a();
        int i11 = Integer.parseInt(interfaceC7107j.U());
        for (int i12 = 0; i12 < i11; i12++) {
            e.b(aVar, interfaceC7107j.U());
        }
        return new q(i10, j10, j11, aVar.b(), null, null, 48, null);
    }

    public final void b(q qVar, InterfaceC7106i interfaceC7106i) {
        interfaceC7106i.k0(qVar.d()).writeByte(10);
        interfaceC7106i.k0(qVar.f()).writeByte(10);
        interfaceC7106i.k0(qVar.g()).writeByte(10);
        Set<Map.Entry> setEntrySet = qVar.e().b().entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        interfaceC7106i.k0(size).writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                interfaceC7106i.I((String) entry.getKey()).I(":").I((String) it2.next()).writeByte(10);
            }
        }
    }
}
