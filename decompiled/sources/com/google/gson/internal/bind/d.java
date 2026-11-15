package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class d extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t f40794d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f40795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f40796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f40797c;

    class a implements t {
        a() {
        }

        @Override // com.google.gson.t
        public s b(com.google.gson.e eVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            a aVar = null;
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new d(rawType, aVar);
        }
    }

    /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum b(p138n7.a aVar) throws IOException {
        if (aVar.n1() == p138n7.b.NULL) {
            aVar.V0();
            return null;
        }
        String strL1 = aVar.l1();
        Enum r10 = (Enum) this.f40795a.get(strL1);
        return r10 == null ? (Enum) this.f40796b.get(strL1) : r10;
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(p138n7.c cVar, Enum r10) throws IOException {
        cVar.p1(r10 == null ? null : (String) this.f40797c.get(r10));
    }

    private d(Class cls) {
        this.f40795a = new HashMap();
        this.f40796b = new HashMap();
        this.f40797c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r10 = (Enum) field2.get(null);
                String strName = r10.name();
                String string = r10.toString();
                p098j7.c cVar = (p098j7.c) field2.getAnnotation(p098j7.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f40795a.put(str, r10);
                    }
                }
                this.f40795a.put(strName, r10);
                this.f40796b.put(string, r10);
                this.f40797c.put(r10, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
