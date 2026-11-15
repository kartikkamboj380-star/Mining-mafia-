package s9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r9.T;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f49379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f49382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f49384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f49385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f49386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f49387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f49388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Long f49389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Long f49390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Long f49391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f49392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Integer f49393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Integer f49394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f49395q;

    public i(T canonicalPath, boolean z9, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f49379a = canonicalPath;
        this.f49380b = z9;
        this.f49381c = comment;
        this.f49382d = j10;
        this.f49383e = j11;
        this.f49384f = j12;
        this.f49385g = i10;
        this.f49386h = j13;
        this.f49387i = i11;
        this.f49388j = i12;
        this.f49389k = l10;
        this.f49390l = l11;
        this.f49391m = l12;
        this.f49392n = num;
        this.f49393o = num2;
        this.f49394p = num3;
        this.f49395q = new ArrayList();
    }

    public final i a(Integer num, Integer num2, Integer num3) {
        return new i(this.f49379a, this.f49380b, this.f49381c, this.f49382d, this.f49383e, this.f49384f, this.f49385g, this.f49386h, this.f49387i, this.f49388j, this.f49389k, this.f49390l, this.f49391m, num, num2, num3);
    }

    public final T b() {
        return this.f49379a;
    }

    public final List c() {
        return this.f49395q;
    }

    public final long d() {
        return this.f49383e;
    }

    public final int e() {
        return this.f49385g;
    }

    public final Long f() {
        Long l10 = this.f49391m;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f49394p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f49390l;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f49393o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f49389k;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f49392n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f49388j;
        if (i10 != -1) {
            return j.c(this.f49387i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f49386h;
    }

    public final long j() {
        return this.f49384f;
    }

    public final boolean k() {
        return this.f49380b;
    }

    public /* synthetic */ i(T t10, boolean z9, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(t10, (i13 & 2) != 0 ? false : z9, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0 ? j13 : -1L, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? -1 : i11, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? i12 : -1, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }
}
