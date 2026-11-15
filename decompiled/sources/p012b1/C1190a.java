package p012b1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;
import p192t1.AbstractC7124b;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1190a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f11501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11502b;

    public C1190a(Bitmap bitmap, boolean z9) {
        this.f11501a = bitmap;
        this.f11502b = z9;
    }

    @Override // p012b1.n
    public long a() {
        return AbstractC7124b.a(this.f11501a);
    }

    @Override // p012b1.n
    public boolean b() {
        return this.f11502b;
    }

    @Override // p012b1.n
    public void c(Canvas canvas) {
        canvas.drawBitmap(this.f11501a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
    }

    public final Bitmap d() {
        return this.f11501a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190a)) {
            return false;
        }
        C1190a c1190a = (C1190a) obj;
        return Intrinsics.b(this.f11501a, c1190a.f11501a) && this.f11502b == c1190a.f11502b;
    }

    @Override // p012b1.n
    public int getHeight() {
        return this.f11501a.getHeight();
    }

    @Override // p012b1.n
    public int getWidth() {
        return this.f11501a.getWidth();
    }

    public int hashCode() {
        return (this.f11501a.hashCode() * 31) + Boolean.hashCode(this.f11502b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f11501a + ", shareable=" + this.f11502b + ')';
    }
}
