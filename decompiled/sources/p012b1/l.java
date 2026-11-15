package p012b1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p192t1.AbstractC7125c;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11529b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f11530c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11531a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11533b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11534a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(Object obj) {
            this.f11534a = obj;
        }

        public final Object a() {
            return this.f11534a;
        }
    }

    public /* synthetic */ l(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map b() {
        return this.f11531a;
    }

    public final Object c(c cVar) {
        return this.f11531a.get(cVar);
    }

    public final a d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.b(this.f11531a, ((l) obj).f11531a);
    }

    public int hashCode() {
        return this.f11531a.hashCode();
    }

    public String toString() {
        return "Extras(data=" + this.f11531a + ')';
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f11532a;

        public a() {
            this.f11532a = new LinkedHashMap();
        }

        public final l a() {
            return new l(AbstractC7125c.d(this.f11532a), null);
        }

        public final a b(c cVar, Object obj) {
            if (obj != null) {
                this.f11532a.put(cVar, obj);
                return this;
            }
            this.f11532a.remove(cVar);
            return this;
        }

        public a(Map map) {
            this.f11532a = E.v(map);
        }

        public a(l lVar) {
            this.f11532a = E.v(lVar.f11531a);
        }
    }

    private l(Map map) {
        this.f11531a = map;
    }
}
