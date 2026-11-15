package p108k7;

import com.google.gson.h;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p070h.w;
import p128m7.a;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f45656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f45658c;

    public t(Map map, boolean z9, List list) {
        this.f45656a = map;
        this.f45657b = z9;
        this.f45658c = list;
    }

    private static C A(final Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C() { // from class: k7.s
                @Override // p108k7.C
                public final Object a() {
                    return t.k(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new C() { // from class: k7.b
                @Override // p108k7.C
                public final Object a() {
                    return t.f(type);
                }
            };
        }
        return null;
    }

    private C B(final Class cls) {
        if (this.f45657b) {
            return new C() { // from class: k7.q
                @Override // p108k7.C
                public final Object a() {
                    return t.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new C() { // from class: k7.r
            @Override // p108k7.C
            public final Object a() {
                return t.m(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new h(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return I.f45640a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new h("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new h("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map g() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map h() {
        return new TreeMap();
    }

    public static /* synthetic */ Object i(String str) {
        throw new h(str);
    }

    public static /* synthetic */ Collection j() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object k(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new h("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new h("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object l(String str) {
        throw new h(str);
    }

    public static /* synthetic */ Object m(String str) {
        throw new h(str);
    }

    public static /* synthetic */ Map n() {
        return new A();
    }

    public static /* synthetic */ Object o(String str) {
        throw new h(str);
    }

    public static /* synthetic */ Collection p() {
        return new TreeSet();
    }

    public static /* synthetic */ Object q(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection r() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object s(String str) {
        throw new h(str);
    }

    static String t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + H.a("r8-abstract-class");
    }

    private static boolean v(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && w.k(actualTypeArguments[0]) == String.class;
    }

    private static C w(Class cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new C() { // from class: k7.m
                @Override // p108k7.C
                public final Object a() {
                    return t.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new C() { // from class: k7.n
                @Override // p108k7.C
                public final Object a() {
                    return t.j();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new C() { // from class: k7.o
                @Override // p108k7.C
                public final Object a() {
                    return t.p();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new C() { // from class: k7.p
                @Override // p108k7.C
                public final Object a() {
                    return t.r();
                }
            };
        }
        return null;
    }

    private static C x(Class cls, o oVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            o oVar2 = o.ALLOW;
            if (oVar == oVar2 || (F.a(declaredConstructor, null) && (oVar != o.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (oVar != oVar2 || (strP = a.p(declaredConstructor)) == null) ? new C() { // from class: k7.j
                    @Override // p108k7.C
                    public final Object a() {
                        return t.q(declaredConstructor);
                    }
                } : new C() { // from class: k7.i
                    @Override // p108k7.C
                    public final Object a() {
                        return t.i(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new C() { // from class: k7.h
                @Override // p108k7.C
                public final Object a() {
                    return t.l(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static C y(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return w(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return z(type, cls);
        }
        return null;
    }

    private static C z(Type type, Class cls) {
        if (cls.isAssignableFrom(A.class) && v(type)) {
            return new C() { // from class: k7.c
                @Override // p108k7.C
                public final Object a() {
                    return t.n();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new C() { // from class: k7.d
                @Override // p108k7.C
                public final Object a() {
                    return t.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new C() { // from class: k7.e
                @Override // p108k7.C
                public final Object a() {
                    return t.h();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new C() { // from class: k7.f
                @Override // p108k7.C
                public final Object a() {
                    return t.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new C() { // from class: k7.g
                @Override // p108k7.C
                public final Object a() {
                    return t.g();
                }
            };
        }
        return null;
    }

    public String toString() {
        return this.f45656a.toString();
    }

    public C u(TypeToken typeToken, boolean z9) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        w.a(this.f45656a.get(type));
        w.a(this.f45656a.get(rawType));
        C cA = A(type, rawType);
        if (cA != null) {
            return cA;
        }
        o oVarB = F.b(this.f45658c, rawType);
        C cX = x(rawType, oVarB);
        if (cX != null) {
            return cX;
        }
        C cY = y(type, rawType);
        if (cY != null) {
            return cY;
        }
        final String strT = t(rawType);
        if (strT != null) {
            return new C() { // from class: k7.a
                @Override // p108k7.C
                public final Object a() {
                    return t.o(strT);
                }
            };
        }
        if (!z9) {
            final String str = "Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new C() { // from class: k7.k
                @Override // p108k7.C
                public final Object a() {
                    return t.d(str);
                }
            };
        }
        if (oVarB == o.ALLOW) {
            return B(rawType);
        }
        final String str2 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new C() { // from class: k7.l
            @Override // p108k7.C
            public final Object a() {
                return t.s(str2);
            }
        };
    }
}
