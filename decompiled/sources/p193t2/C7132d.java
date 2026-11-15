package p193t2;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7132d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49537f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f49540c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49538a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49541d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49542e = -1;

    /* JADX INFO: renamed from: t2.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f49538a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f49539b) {
            drawable.setColorFilter(this.f49540c);
        }
        int i11 = this.f49541d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f49542e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public final void b(int i10) {
        this.f49538a = i10;
    }

    public final void c(ColorFilter colorFilter) {
        this.f49540c = colorFilter;
        this.f49539b = colorFilter != null;
    }

    public final void d(boolean z9) {
        this.f49541d = z9 ? 1 : 0;
    }

    public final void e(boolean z9) {
        this.f49542e = z9 ? 1 : 0;
    }
}
