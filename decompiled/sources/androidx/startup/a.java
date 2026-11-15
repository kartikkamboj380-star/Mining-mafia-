package androidx.startup;

import D0.b;
import D0.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f10943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f10944e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f10947c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f10946b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f10945a = new HashMap();

    a(Context context) {
        this.f10947c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objCreate;
        if (F0.a.h()) {
            try {
                F0.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                F0.a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f10945a.containsKey(cls)) {
            objCreate = this.f10945a.get(cls);
        } else {
            set.add(cls);
            try {
                D0.a aVar = (D0.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = aVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!this.f10945a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = aVar.create(this.f10947c);
                set.remove(cls);
                this.f10945a.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        F0.a.f();
        return objCreate;
    }

    public static a e(Context context) {
        if (f10943d == null) {
            synchronized (f10944e) {
                try {
                    if (f10943d == null) {
                        f10943d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10943d;
    }

    void a() {
        try {
            try {
                F0.a.c("Startup");
                b(this.f10947c.getPackageManager().getProviderInfo(new ComponentName(this.f10947c.getPackageName(), InitializationProvider.class.getName()), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData);
                F0.a.f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } catch (Throwable th) {
            F0.a.f();
            throw th;
        }
    }

    void b(Bundle bundle) {
        String string = this.f10947c.getString(b.f416a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (D0.a.class.isAssignableFrom(cls)) {
                            this.f10946b.add(cls);
                        }
                    }
                }
                Iterator it = this.f10946b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f10944e) {
            try {
                objD = this.f10945a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f10946b.contains(cls);
    }
}
