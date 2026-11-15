package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1152x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p190t.k f10128a = new p190t.k();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC1144o.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        p190t.k kVar = f10128a;
        p190t.k kVar2 = (p190t.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new p190t.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new ComponentCallbacksC1144o.m("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new ComponentCallbacksC1144o.m("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public ComponentCallbacksC1144o a(ClassLoader classLoader, String str) {
        try {
            return (ComponentCallbacksC1144o) d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            throw new ComponentCallbacksC1144o.m("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new ComponentCallbacksC1144o.m("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new ComponentCallbacksC1144o.m("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new ComponentCallbacksC1144o.m("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }
}
