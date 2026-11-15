package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1078b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7362e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f7364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f7365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7366d;

    /* JADX INFO: renamed from: androidx.activity.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1078b(float f10, float f11, float f12, int i10) {
        this.f7363a = f10;
        this.f7364b = f11;
        this.f7365c = f12;
        this.f7366d = i10;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f7363a + ", touchY=" + this.f7364b + ", progress=" + this.f7365c + ", swipeEdge=" + this.f7366d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1078b(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C1077a c1077a = C1077a.f7361a;
        this(c1077a.c(backEvent), c1077a.d(backEvent), c1077a.a(backEvent), c1077a.b(backEvent));
    }
}
