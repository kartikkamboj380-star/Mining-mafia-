package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1156b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C1156b f10202c = new C1156b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10203a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10204b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f10205a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f10206b;

        a(Map map) {
            this.f10206b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1164j.a aVar = (AbstractC1164j.a) entry.getValue();
                List arrayList = (List) this.f10205a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f10205a.put(aVar, arrayList);
                }
                arrayList.add((C0159b) entry.getKey());
            }
        }

        private static void b(List list, r rVar, AbstractC1164j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0159b) list.get(size)).a(rVar, aVar, obj);
                }
            }
        }

        void a(r rVar, AbstractC1164j.a aVar, Object obj) {
            b((List) this.f10205a.get(aVar), rVar, aVar, obj);
            b((List) this.f10205a.get(AbstractC1164j.a.ON_ANY), rVar, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0159b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f10207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f10208b;

        C0159b(int i10, Method method) {
            this.f10207a = i10;
            this.f10208b = method;
            method.setAccessible(true);
        }

        void a(r rVar, AbstractC1164j.a aVar, Object obj) {
            try {
                int i10 = this.f10207a;
                if (i10 == 0) {
                    this.f10208b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f10208b.invoke(obj, rVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f10208b.invoke(obj, rVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0159b)) {
                return false;
            }
            C0159b c0159b = (C0159b) obj;
            return this.f10207a == c0159b.f10207a && this.f10208b.getName().equals(c0159b.f10208b.getName());
        }

        public int hashCode() {
            return (this.f10207a * 31) + this.f10208b.getName().hashCode();
        }
    }

    C1156b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f10206b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f10206b.entrySet()) {
                e(map, (C0159b) entry.getKey(), (AbstractC1164j.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            B b10 = (B) method.getAnnotation(B.class);
            if (b10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC1164j.a aVarValue = b10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1164j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1164j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0159b(i10, method), aVarValue, cls);
                z9 = true;
            }
        }
        a aVar = new a(map);
        this.f10203a.put(cls, aVar);
        this.f10204b.put(cls, Boolean.valueOf(z9));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, C0159b c0159b, AbstractC1164j.a aVar, Class cls) {
        AbstractC1164j.a aVar2 = (AbstractC1164j.a) map.get(c0159b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0159b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0159b.f10208b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f10203a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f10204b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((B) method.getAnnotation(B.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f10204b.put(cls, Boolean.FALSE);
        return false;
    }
}
