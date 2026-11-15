package p048e7;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p129m8.g;
import p129m8.q;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements InterfaceC6978y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f43297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f43299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f43300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f43301f;

    public C(Context appContext, final b0 uuidGenerator) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f43296a = appContext;
        this.f43297b = g.a(new Function0() { // from class: e7.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.p(this.f43520a);
            }
        });
        this.f43298c = Process.myPid();
        this.f43299d = g.a(new Function0() { // from class: e7.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.q(uuidGenerator);
            }
        });
        this.f43300e = g.a(new Function0() { // from class: e7.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.o(this.f43295a);
            }
        });
    }

    private final List j() {
        return F.f43308a.a(this.f43296a);
    }

    private final E l() {
        return (E) this.f43300e.getValue();
    }

    private final boolean n(E e10, C6977x c6977x) {
        if (Intrinsics.b(a(), e10.c())) {
            return (e10.b() == c6977x.a() && Intrinsics.b(m(), c6977x.b())) ? false : true;
        }
        return e10.b() != c6977x.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E o(C c10) {
        return F.f43308a.b(c10.f43296a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(C c10) {
        return c10.l().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(b0 b0Var) {
        String string = b0Var.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // p048e7.InterfaceC6978y
    public String a() {
        return (String) this.f43297b.getValue();
    }

    @Override // p048e7.InterfaceC6978y
    public boolean b(Map processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        C6977x c6977x = (C6977x) processDataMap.get(a());
        return (c6977x != null && c6977x.a() == k() && Intrinsics.b(c6977x.b(), m())) ? false : true;
    }

    @Override // p048e7.InterfaceC6978y
    public Map c(Map map) {
        Map mapV;
        if (map != null && (mapV = E.v(map)) != null) {
            mapV.put(a(), new C6977x(Process.myPid(), m()));
            Map mapT = E.t(mapV);
            if (mapT != null) {
                return mapT;
            }
        }
        return E.e(q.a(a(), new C6977x(Process.myPid(), m())));
    }

    @Override // p048e7.InterfaceC6978y
    public void d() {
        this.f43301f = true;
    }

    @Override // p048e7.InterfaceC6978y
    public boolean e(Map processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        if (this.f43301f) {
            return false;
        }
        List<E> listJ = j();
        ArrayList arrayList = new ArrayList();
        for (E e10 : listJ) {
            C6977x c6977x = (C6977x) processDataMap.get(e10.c());
            Pair pair = c6977x != null ? new Pair(e10, c6977x) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair2 = (Pair) obj;
            if (!n((E) pair2.a(), (C6977x) pair2.b())) {
                return false;
            }
        }
        return true;
    }

    @Override // p048e7.InterfaceC6978y
    public Map f() {
        return InterfaceC6978y.a.a(this);
    }

    public int k() {
        return this.f43298c;
    }

    public String m() {
        return (String) this.f43299d.getValue();
    }
}
