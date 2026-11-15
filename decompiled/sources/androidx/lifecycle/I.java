package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f10155f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class[] f10156g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0.d.c f10161e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final I a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new I();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new I(map);
            }
            ClassLoader classLoader = I.class.getClassLoader();
            Intrinsics.c(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new I(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : I.f10156g) {
                Intrinsics.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public I(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10157a = linkedHashMap;
        this.f10158b = new LinkedHashMap();
        this.f10159c = new LinkedHashMap();
        this.f10160d = new LinkedHashMap();
        this.f10161e = new z0.d.c() { // from class: androidx.lifecycle.H
            @Override // z0.d.c
            public final Bundle a() {
                return I.d(this.f10154a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(I this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : kotlin.collections.E.t(this$0.f10158b).entrySet()) {
            this$0.e((String) entry.getKey(), ((z0.d.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.f10157a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f10157a.get(str));
        }
        return K.d.a(p129m8.q.a("keys", arrayList), p129m8.q.a("values", arrayList2));
    }

    public final z0.d.c c() {
        return this.f10161e;
    }

    public final void e(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f10155f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.c(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f10159c.get(key);
        z zVar = obj2 instanceof z ? (z) obj2 : null;
        if (zVar != null) {
            zVar.n(obj);
        } else {
            this.f10157a.put(key, obj);
        }
        L8.x xVar = (L8.x) this.f10160d.get(key);
        if (xVar == null) {
            return;
        }
        xVar.setValue(obj);
    }

    public I() {
        this.f10157a = new LinkedHashMap();
        this.f10158b = new LinkedHashMap();
        this.f10159c = new LinkedHashMap();
        this.f10160d = new LinkedHashMap();
        this.f10161e = new z0.d.c() { // from class: androidx.lifecycle.H
            @Override // z0.d.c
            public final Bundle a() {
                return I.d(this.f10154a);
            }
        };
    }
}
