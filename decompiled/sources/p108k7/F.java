package p108k7;

import com.google.gson.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p070h.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45634a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f45635b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f45635b = method;
            }

            @Override // k7.F.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f45635b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: renamed from: k7.F$b$b, reason: collision with other inner class name */
        class C0459b extends b {
            C0459b() {
                super();
            }

            @Override // k7.F.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (x.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0459b();
            }
            f45634a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f45634a.a(accessibleObject, obj);
    }

    public static o b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return o.ALLOW;
        }
        w.a(it.next());
        throw null;
    }
}
