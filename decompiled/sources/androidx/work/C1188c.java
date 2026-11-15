package androidx.work;

import android.net.Uri;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.M;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.work.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1188c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f11230i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1188c f11231j = new C1188c(null, false, false, false, false, 0, 0, null, 255, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f11232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f11238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f11239h;

    /* JADX INFO: renamed from: androidx.work.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11241b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11244e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private r f11242c = r.NOT_REQUIRED;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f11245f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f11246g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Set f11247h = new LinkedHashSet();

        public final C1188c a() {
            Set setA0 = CollectionsKt.A0(this.f11247h);
            long j10 = this.f11245f;
            long j11 = this.f11246g;
            return new C1188c(this.f11242c, this.f11240a, this.f11241b, this.f11243d, this.f11244e, j10, j11, setA0);
        }

        public final a b(r networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.f11242c = networkType;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c, reason: collision with other inner class name */
    public static final class C0181c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f11248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11249b;

        public C0181c(Uri uri, boolean z9) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f11248a = uri;
            this.f11249b = z9;
        }

        public final Uri a() {
            return this.f11248a;
        }

        public final boolean b() {
            return this.f11249b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.b(C0181c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            C0181c c0181c = (C0181c) obj;
            return Intrinsics.b(this.f11248a, c0181c.f11248a) && this.f11249b == c0181c.f11249b;
        }

        public int hashCode() {
            return (this.f11248a.hashCode() * 31) + Boolean.hashCode(this.f11249b);
        }
    }

    public C1188c(r requiredNetworkType, boolean z9, boolean z10, boolean z11, boolean z12, long j10, long j11, Set contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f11232a = requiredNetworkType;
        this.f11233b = z9;
        this.f11234c = z10;
        this.f11235d = z11;
        this.f11236e = z12;
        this.f11237f = j10;
        this.f11238g = j11;
        this.f11239h = contentUriTriggers;
    }

    public final long a() {
        return this.f11238g;
    }

    public final long b() {
        return this.f11237f;
    }

    public final Set c() {
        return this.f11239h;
    }

    public final r d() {
        return this.f11232a;
    }

    public final boolean e() {
        return !this.f11239h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.b(C1188c.class, obj.getClass())) {
            return false;
        }
        C1188c c1188c = (C1188c) obj;
        if (this.f11233b == c1188c.f11233b && this.f11234c == c1188c.f11234c && this.f11235d == c1188c.f11235d && this.f11236e == c1188c.f11236e && this.f11237f == c1188c.f11237f && this.f11238g == c1188c.f11238g && this.f11232a == c1188c.f11232a) {
            return Intrinsics.b(this.f11239h, c1188c.f11239h);
        }
        return false;
    }

    public final boolean f() {
        return this.f11235d;
    }

    public final boolean g() {
        return this.f11233b;
    }

    public final boolean h() {
        return this.f11234c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f11232a.hashCode() * 31) + (this.f11233b ? 1 : 0)) * 31) + (this.f11234c ? 1 : 0)) * 31) + (this.f11235d ? 1 : 0)) * 31) + (this.f11236e ? 1 : 0)) * 31;
        long j10 = this.f11237f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f11238g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f11239h.hashCode();
    }

    public final boolean i() {
        return this.f11236e;
    }

    public /* synthetic */ C1188c(r rVar, boolean z9, boolean z10, boolean z11, boolean z12, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? r.NOT_REQUIRED : rVar, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? M.d() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1188c(C1188c other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z9 = other.f11233b;
        boolean z10 = other.f11234c;
        this(other.f11232a, z9, z10, other.f11235d, other.f11236e, other.f11237f, other.f11238g, other.f11239h);
    }
}
