package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1123t extends AbstractC1105a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1123t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected g0 unknownFields = g0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC1105a.AbstractC0149a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1123t f9671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected AbstractC1123t f9672b;

        protected a(AbstractC1123t abstractC1123t) {
            this.f9671a = abstractC1123t;
            if (abstractC1123t.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f9672b = n();
        }

        private static void m(Object obj, Object obj2) {
            U.a().d(obj).a(obj, obj2);
        }

        private AbstractC1123t n() {
            return this.f9671a.E();
        }

        public final AbstractC1123t f() {
            AbstractC1123t abstractC1123tBuildPartial = buildPartial();
            if (abstractC1123tBuildPartial.w()) {
                return abstractC1123tBuildPartial;
            }
            throw AbstractC1105a.AbstractC0149a.e(abstractC1123tBuildPartial);
        }

        @Override // androidx.datastore.preferences.protobuf.J.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC1123t buildPartial() {
            if (!this.f9672b.y()) {
                return this.f9672b;
            }
            this.f9672b.z();
            return this.f9672b;
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            aVarNewBuilderForType.f9672b = buildPartial();
            return aVarNewBuilderForType;
        }

        protected final void i() {
            if (this.f9672b.y()) {
                return;
            }
            k();
        }

        protected void k() {
            AbstractC1123t abstractC1123tN = n();
            m(abstractC1123tN, this.f9672b);
            this.f9672b = abstractC1123tN;
        }

        @Override // androidx.datastore.preferences.protobuf.K
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC1123t getDefaultInstanceForType() {
            return this.f9671a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    protected static class b extends AbstractC1106b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1123t f9673b;

        public b(AbstractC1123t abstractC1123t) {
            this.f9673b = abstractC1123t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC1115k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static AbstractC1124u.b B(AbstractC1124u.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    protected static Object D(J j10, String str, Object[] objArr) {
        return new W(j10, str, objArr);
    }

    protected static AbstractC1123t F(AbstractC1123t abstractC1123t, InputStream inputStream) {
        return g(G(abstractC1123t, AbstractC1111g.g(inputStream), C1117m.b()));
    }

    static AbstractC1123t G(AbstractC1123t abstractC1123t, AbstractC1111g abstractC1111g, C1117m c1117m) throws C1125v {
        AbstractC1123t abstractC1123tE = abstractC1123t.E();
        try {
            Y yD = U.a().d(abstractC1123tE);
            yD.h(abstractC1123tE, C1112h.O(abstractC1111g), c1117m);
            yD.b(abstractC1123tE);
            return abstractC1123tE;
        } catch (e0 e10) {
            throw e10.a().k(abstractC1123tE);
        } catch (C1125v e11) {
            e = e11;
            if (e.a()) {
                e = new C1125v(e);
            }
            throw e.k(abstractC1123tE);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1125v) {
                throw ((C1125v) e12.getCause());
            }
            throw new C1125v(e12).k(abstractC1123tE);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C1125v) {
                throw ((C1125v) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void H(Class cls, AbstractC1123t abstractC1123t) {
        abstractC1123t.A();
        defaultInstanceMap.put(cls, abstractC1123t);
    }

    private static AbstractC1123t g(AbstractC1123t abstractC1123t) throws C1125v {
        if (abstractC1123t == null || abstractC1123t.w()) {
            return abstractC1123t;
        }
        throw abstractC1123t.d().a().k(abstractC1123t);
    }

    private int k(Y y9) {
        return y9 == null ? U.a().d(this).d(this) : y9.d(this);
    }

    protected static AbstractC1124u.b p() {
        return V.d();
    }

    static AbstractC1123t q(Class cls) {
        AbstractC1123t abstractC1123t = defaultInstanceMap.get(cls);
        if (abstractC1123t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1123t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1123t != null) {
            return abstractC1123t;
        }
        AbstractC1123t defaultInstanceForType = ((AbstractC1123t) i0.i(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean x(AbstractC1123t abstractC1123t, boolean z9) {
        byte bByteValue = ((Byte) abstractC1123t.m(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = U.a().d(abstractC1123t).c(abstractC1123t);
        if (z9) {
            abstractC1123t.n(d.SET_MEMOIZED_IS_INITIALIZED, zC ? abstractC1123t : null);
        }
        return zC;
    }

    void A() {
        this.memoizedSerializedSize &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) m(d.NEW_BUILDER);
    }

    AbstractC1123t E() {
        return (AbstractC1123t) m(d.NEW_MUTABLE_INSTANCE);
    }

    void I(int i10) {
        this.memoizedHashCode = i10;
    }

    void J(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public void b(AbstractC1113i abstractC1113i) {
        U.a().d(this).i(this, C1114j.P(abstractC1113i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1105a
    int c(Y y9) {
        if (!y()) {
            if (t() != Integer.MAX_VALUE) {
                return t();
            }
            int iK = k(y9);
            J(iK);
            return iK;
        }
        int iK2 = k(y9);
        if (iK2 >= 0) {
            return iK2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iK2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return U.a().d(this).g(this, (AbstractC1123t) obj);
        }
        return false;
    }

    Object f() {
        return m(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int getSerializedSize() {
        return c(null);
    }

    void h() {
        this.memoizedHashCode = 0;
    }

    public int hashCode() {
        if (y()) {
            return j();
        }
        if (u()) {
            I(j());
        }
        return s();
    }

    void i() {
        J(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    int j() {
        return U.a().d(this).f(this);
    }

    protected final a l() {
        return (a) m(d.NEW_BUILDER);
    }

    protected Object m(d dVar) {
        return o(dVar, null, null);
    }

    protected Object n(d dVar, Object obj) {
        return o(dVar, obj, null);
    }

    protected abstract Object o(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC1123t getDefaultInstanceForType() {
        return (AbstractC1123t) m(d.GET_DEFAULT_INSTANCE);
    }

    int s() {
        return this.memoizedHashCode;
    }

    int t() {
        return this.memoizedSerializedSize & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public String toString() {
        return L.f(this, super.toString());
    }

    boolean u() {
        return s() == 0;
    }

    public final boolean w() {
        return x(this, true);
    }

    boolean y() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void z() {
        U.a().d(this).b(this);
        A();
    }
}
