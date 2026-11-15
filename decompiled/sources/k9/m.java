package k9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45912c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f45914b = new int[10];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f45914b[i10];
    }

    public final int b() {
        if ((this.f45913a & 2) != 0) {
            return this.f45914b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f45913a & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            return this.f45914b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f45913a & 16) != 0 ? this.f45914b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final int e(int i10) {
        return (this.f45913a & 32) != 0 ? this.f45914b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f45913a) != 0;
    }

    public final void g(m other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f45914b;
            if (i10 < iArr.length) {
                this.f45913a = (1 << i10) | this.f45913a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f45913a);
    }
}
