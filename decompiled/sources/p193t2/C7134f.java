package p193t2;

import Y1.k;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import p253z2.m;

/* JADX INFO: renamed from: t2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7134f extends AbstractC7129a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    int[] f49544G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int[] f49545H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f49546I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean[] f49547J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int f49548K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private m f49549L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f49550M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f49551N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f49552O;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Drawable[] f49553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f49554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f49555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f49556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f49557m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f49558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    long f49559w;

    public C7134f(Drawable[] drawableArr, boolean z9, int i10) {
        super(drawableArr);
        this.f49552O = true;
        k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f49553i = drawableArr;
        this.f49544G = new int[drawableArr.length];
        this.f49545H = new int[drawableArr.length];
        this.f49546I = 255;
        this.f49547J = new boolean[drawableArr.length];
        this.f49548K = 0;
        this.f49554j = z9;
        this.f49555k = z9 ? 255 : 0;
        this.f49556l = i10;
        t();
    }

    private void i(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f49548K++;
        if (this.f49552O) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f49548K--;
        drawable.draw(canvas);
    }

    private void q() {
        if (this.f49550M) {
            this.f49550M = false;
            m mVar = this.f49549L;
            if (mVar != null) {
                mVar.c();
            }
        }
    }

    private void r() {
        int i10;
        if (!this.f49550M && (i10 = this.f49556l) >= 0) {
            boolean[] zArr = this.f49547J;
            if (i10 < zArr.length && zArr[i10]) {
                this.f49550M = true;
                m mVar = this.f49549L;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f49551N && this.f49557m == 2 && this.f49547J[this.f49556l]) {
            m mVar = this.f49549L;
            if (mVar != null) {
                mVar.b();
            }
            this.f49551N = false;
        }
    }

    private void t() {
        this.f49557m = 2;
        Arrays.fill(this.f49544G, this.f49555k);
        this.f49544G[0] = 255;
        Arrays.fill(this.f49545H, this.f49555k);
        this.f49545H[0] = 255;
        Arrays.fill(this.f49547J, this.f49554j);
        this.f49547J[0] = true;
    }

    private boolean v(float f10) {
        boolean z9 = true;
        for (int i10 = 0; i10 < this.f49553i.length; i10++) {
            boolean z10 = this.f49547J[i10];
            int i11 = z10 ? 1 : -1;
            int[] iArr = this.f49545H;
            int i12 = (int) (this.f49544G[i10] + (i11 * 255 * f10));
            iArr[i10] = i12;
            if (i12 < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (z10 && iArr[i10] < 255) {
                z9 = false;
            }
            if (!z10 && iArr[i10] > 0) {
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[LOOP:0: B:25:0x0052->B:27:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[EDGE_INSN: B:33:0x0072->B:28:0x0072 BREAK  A[LOOP:0: B:25:0x0052->B:27:0x0057], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zV;
        Drawable[] drawableArr;
        int i10 = this.f49557m;
        int i11 = 0;
        boolean z9 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                k.i(this.f49558v > 0);
                zV = v((o() - this.f49559w) / this.f49558v);
                this.f49557m = zV ? 2 : 1;
            }
            while (true) {
                drawableArr = this.f49553i;
                if (i11 < drawableArr.length) {
                    break;
                }
                i(canvas, drawableArr[i11], (int) Math.ceil(((double) (this.f49545H[i11] * this.f49546I)) / 255.0d));
                i11++;
            }
            if (z9) {
                invalidateSelf();
            } else {
                q();
                s();
            }
        }
        System.arraycopy(this.f49545H, 0, this.f49544G, 0, this.f49553i.length);
        this.f49559w = o();
        zV = v(this.f49558v == 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        r();
        this.f49557m = zV ? 2 : 1;
        z9 = zV;
        while (true) {
            drawableArr = this.f49553i;
            if (i11 < drawableArr.length) {
                break;
                break;
            } else {
                i(canvas, drawableArr[i11], (int) Math.ceil(((double) (this.f49545H[i11] * this.f49546I)) / 255.0d));
                i11++;
            }
        }
        if (z9) {
            invalidateSelf();
        } else {
            q();
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f49546I;
    }

    public void h() {
        this.f49548K++;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f49548K == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f49548K--;
        invalidateSelf();
    }

    public void k() {
        this.f49557m = 0;
        Arrays.fill(this.f49547J, true);
        invalidateSelf();
    }

    public void l(int i10) {
        this.f49557m = 0;
        this.f49547J[i10] = true;
        invalidateSelf();
    }

    public void m(int i10) {
        this.f49557m = 0;
        this.f49547J[i10] = false;
        invalidateSelf();
    }

    public void n() {
        this.f49557m = 2;
        for (int i10 = 0; i10 < this.f49553i.length; i10++) {
            this.f49545H[i10] = this.f49547J[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long o() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f49546I != i10) {
            this.f49546I = i10;
            invalidateSelf();
        }
    }

    public void u(int i10) {
        this.f49558v = i10;
        if (this.f49557m == 1) {
            this.f49557m = 0;
        }
    }
}
