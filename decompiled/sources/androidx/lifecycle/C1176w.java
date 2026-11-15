package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1176w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1176w f10245a = new C1176w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f10246b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f10247c = new HashMap();

    private C1176w() {
    }

    private final InterfaceC1161g a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            p070h.w.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r10 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r10 != null ? r10.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            Intrinsics.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.F(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f10246b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC1171q.class.isAssignableFrom(cls);
    }

    public static final InterfaceC1168n f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z9 = object instanceof InterfaceC1168n;
        boolean z10 = object instanceof InterfaceC1158d;
        if (z9 && z10) {
            return new C1159e((InterfaceC1158d) object, (InterfaceC1168n) object);
        }
        if (z10) {
            return new C1159e((InterfaceC1158d) object, null);
        }
        if (z9) {
            return (InterfaceC1168n) object;
        }
        Class<?> cls = object.getClass();
        C1176w c1176w = f10245a;
        if (c1176w.d(cls) != 2) {
            return new E(object);
        }
        Object obj = f10247c.get(cls);
        Intrinsics.c(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c1176w.a((Constructor) list.get(0), object);
            return new S(null);
        }
        int size = list.size();
        InterfaceC1161g[] interfaceC1161gArr = new InterfaceC1161g[size];
        for (int i10 = 0; i10 < size; i10++) {
            f10245a.a((Constructor) list.get(i10), object);
            interfaceC1161gArr[i10] = null;
        }
        return new C1157c(interfaceC1161gArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f10247c.put(cls, CollectionsKt.d(constructorB));
            return 2;
        }
        if (C1156b.f10202c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f10247c.get(superclass);
            Intrinsics.c(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f10247c.get(intrface);
                Intrinsics.c(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f10247c.put(cls, arrayList);
        return 2;
    }
}
