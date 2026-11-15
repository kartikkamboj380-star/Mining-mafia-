package p001a0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlin.ranges.b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f7237b;

    static final class a extends m implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7238a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? AbstractC7024j.M((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z9);
    }

    @Override // p001a0.f
    public Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f7236a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.c(E.d(CollectionsKt.s(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return p001a0.a.b(linkedHashMap);
    }

    @Override // p001a0.f
    public Object b(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f7236a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (this.f7237b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object obj) {
        boolean zB;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map map = cVar.f7236a;
        if (map == this.f7236a) {
            return true;
        }
        if (map.size() != this.f7236a.size()) {
            return false;
        }
        Map map2 = cVar.f7236a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object obj2 = this.f7236a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zB = Intrinsics.b(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zB = true;
                } else {
                    zB = false;
                }
            } else {
                zB = false;
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.f7237b.b(true);
    }

    public final void g(f.b... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public final Object h(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        return this.f7236a.remove(key);
    }

    public int hashCode() {
        Iterator it = this.f7236a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        j(key, obj);
    }

    public final void j(f.a key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f7236a.put(key, p001a0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f7236a.put(key, obj);
            return;
        }
        Map map = this.f7236a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return CollectionsKt.e0(this.f7236a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f7238a, 24, null);
    }

    public c(Map preferencesMap, boolean z9) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f7236a = preferencesMap;
        this.f7237b = new b(z9);
    }
}
