package p092j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45466b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f45467c = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f45468a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map b() {
        return this.f45468a;
    }

    public final String c(String str) {
        Map map = this.f45468a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.h0(list);
        }
        return null;
    }

    public final a d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.b(this.f45468a, ((n) obj).f45468a);
    }

    public int hashCode() {
        return this.f45468a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f45468a + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f45469a;

        public a() {
            this.f45469a = new LinkedHashMap();
        }

        public final a a(String str, String str2) {
            Map map = this.f45469a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
            return this;
        }

        public final n b() {
            return new n(E.t(this.f45469a), null);
        }

        public final a c(String str, String str2) {
            Map map = this.f45469a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.n(str2));
            return this;
        }

        public final a d(String str, List list) {
            Map map = this.f45469a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.y0(list));
            return this;
        }

        public a(n nVar) {
            Map map = nVar.f45468a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.y0((Collection) entry.getValue()));
            }
            this.f45469a = linkedHashMap;
        }
    }

    private n(Map map) {
        this.f45468a = map;
    }
}
