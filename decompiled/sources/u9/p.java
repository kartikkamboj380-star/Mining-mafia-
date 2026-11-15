package u9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p070h.w;

/* JADX INFO: loaded from: classes3.dex */
class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f50074d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a[] f50075e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f50076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f50078c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f50079a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f50080b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f50081c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final StringBuilder f50082d = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class f50083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Class f50084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f50085g;

        a() {
        }

        private boolean b(Method method, Class cls) {
            this.f50082d.setLength(0);
            this.f50082d.append(method.getName());
            StringBuilder sb = this.f50082d;
            sb.append('>');
            sb.append(cls.getName());
            String string = this.f50082d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f50081c.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f50081c.put(string, cls2);
            return false;
        }

        boolean a(Method method, Class cls) {
            Object objPut = this.f50080b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f50080b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class cls) {
            this.f50084f = cls;
            this.f50083e = cls;
            this.f50085g = false;
        }

        void d() {
            if (this.f50085g) {
                this.f50084f = null;
                return;
            }
            Class superclass = this.f50084f.getSuperclass();
            this.f50084f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f50084f = null;
            }
        }

        void e() {
            this.f50079a.clear();
            this.f50080b.clear();
            this.f50081c.clear();
            this.f50082d.setLength(0);
            this.f50083e = null;
            this.f50084f = null;
            this.f50085g = false;
        }
    }

    p(List list, boolean z9, boolean z10) {
        this.f50076a = list;
        this.f50077b = z9;
        this.f50078c = z10;
    }

    private List b(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f50084f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private List c(Class cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f50084f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private void d(a aVar) {
        Method[] methods;
        try {
            try {
                methods = aVar.f50084f.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.f50084f.getMethods();
                aVar.f50085g = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        m mVar = (m) method.getAnnotation(m.class);
                        if (mVar != null) {
                            Class<?> cls = parameterTypes[0];
                            if (aVar.a(method, cls)) {
                                aVar.f50079a.add(new o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                            }
                        }
                    } else if (this.f50077b && method.isAnnotationPresent(m.class)) {
                        throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                    }
                } else if (this.f50077b && method.isAnnotationPresent(m.class)) {
                    throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                }
            }
        } catch (LinkageError e10) {
            String str = "Could not inspect methods of " + aVar.f50084f.getName();
            throw new e(this.f50078c ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e10);
        }
    }

    private List e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f50079a);
        aVar.e();
        synchronized (f50075e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f50075e;
                    if (aVarArr[i10] == null) {
                        aVarArr[i10] = aVar;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    private w9.a f(a aVar) {
        aVar.getClass();
        List list = this.f50076a;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                w.a(it.next());
                throw null;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f50075e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f50075e;
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVarArr[i10] = null;
                        return aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new a();
        }
    }

    List a(Class cls) {
        Map map = f50074d;
        List list = (List) map.get(cls);
        if (list != null) {
            return list;
        }
        List listC = this.f50078c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
