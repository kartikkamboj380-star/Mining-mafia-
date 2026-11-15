package r9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7111n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f48483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f48484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f48485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f48486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f48487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Long f48488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f48489h;

    public C7111n(boolean z9, boolean z10, T t10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f48482a = z9;
        this.f48483b = z10;
        this.f48484c = t10;
        this.f48485d = l10;
        this.f48486e = l11;
        this.f48487f = l12;
        this.f48488g = l13;
        this.f48489h = kotlin.collections.E.t(extras);
    }

    public static /* synthetic */ C7111n b(C7111n c7111n, boolean z9, boolean z10, T t10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c7111n.f48482a;
        }
        if ((i10 & 2) != 0) {
            z10 = c7111n.f48483b;
        }
        if ((i10 & 4) != 0) {
            t10 = c7111n.f48484c;
        }
        if ((i10 & 8) != 0) {
            l10 = c7111n.f48485d;
        }
        if ((i10 & 16) != 0) {
            l11 = c7111n.f48486e;
        }
        if ((i10 & 32) != 0) {
            l12 = c7111n.f48487f;
        }
        if ((i10 & 64) != 0) {
            l13 = c7111n.f48488g;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            map = c7111n.f48489h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c7111n.a(z9, z10, t10, l10, l15, l16, l14, map2);
    }

    public final C7111n a(boolean z9, boolean z10, T t10, Long l10, Long l11, Long l12, Long l13, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new C7111n(z9, z10, t10, l10, l11, l12, l13, extras);
    }

    public final Long c() {
        return this.f48487f;
    }

    public final Long d() {
        return this.f48485d;
    }

    public final T e() {
        return this.f48484c;
    }

    public final boolean f() {
        return this.f48483b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f48482a) {
            arrayList.add("isRegularFile");
        }
        if (this.f48483b) {
            arrayList.add("isDirectory");
        }
        if (this.f48485d != null) {
            arrayList.add("byteCount=" + this.f48485d);
        }
        if (this.f48486e != null) {
            arrayList.add("createdAt=" + this.f48486e);
        }
        if (this.f48487f != null) {
            arrayList.add("lastModifiedAt=" + this.f48487f);
        }
        if (this.f48488g != null) {
            arrayList.add("lastAccessedAt=" + this.f48488g);
        }
        if (!this.f48489h.isEmpty()) {
            arrayList.add("extras=" + this.f48489h);
        }
        return CollectionsKt.e0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C7111n(boolean z9, boolean z10, T t10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : t10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? kotlin.collections.E.g() : map);
    }
}
