package p224w3;

import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f50252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f50253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f50254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f50255e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String taskKey, WritableMap data, long j10, boolean z9) {
        this(taskKey, data, j10, z9, null, 16, null);
        Intrinsics.checkNotNullParameter(taskKey, "taskKey");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final WritableMap a() {
        return this.f50252b;
    }

    public final g b() {
        return this.f50255e;
    }

    public final String c() {
        return this.f50251a;
    }

    public final long d() {
        return this.f50253c;
    }

    public final boolean e() {
        return this.f50254d;
    }

    public a(String taskKey, WritableMap data, long j10, boolean z9, g gVar) {
        Intrinsics.checkNotNullParameter(taskKey, "taskKey");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f50251a = taskKey;
        this.f50252b = data;
        this.f50253c = j10;
        this.f50254d = z9;
        this.f50255e = gVar;
    }

    public /* synthetic */ a(String str, WritableMap writableMap, long j10, boolean z9, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, writableMap, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? false : z9, (i10 & 16) != 0 ? h.f50272b : gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(a source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String str = source.f50251a;
        WritableMap writableMapCopy = source.f50252b.copy();
        long j10 = source.f50253c;
        boolean z9 = source.f50254d;
        g gVar = source.f50255e;
        this(str, writableMapCopy, j10, z9, gVar != null ? gVar.copy() : null);
    }
}
