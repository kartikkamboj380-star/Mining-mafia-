package p108k7;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f45640a = c();

    class a extends I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f45641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f45642c;

        a(Method method, Object obj) {
            this.f45641b = method;
            this.f45642c = obj;
        }

        @Override // p108k7.I
        public Object d(Class cls) {
            I.b(cls);
            return this.f45641b.invoke(this.f45642c, cls);
        }
    }

    class b extends I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f45643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45644c;

        b(Method method, int i10) {
            this.f45643b = method;
            this.f45644c = i10;
        }

        @Override // p108k7.I
        public Object d(Class cls) {
            I.b(cls);
            return this.f45643b.invoke(null, cls, Integer.valueOf(this.f45644c));
        }
    }

    class c extends I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f45645b;

        c(Method method) {
            this.f45645b = method;
        }

        @Override // p108k7.I
        public Object d(Class cls) {
            I.b(cls);
            return this.f45645b.invoke(null, cls, Object.class);
        }
    }

    class d extends I {
        d() {
        }

        @Override // p108k7.I
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class cls) {
        String strT = t.t(cls);
        if (strT == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strT);
    }

    private static I c() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    public abstract Object d(Class cls);
}
