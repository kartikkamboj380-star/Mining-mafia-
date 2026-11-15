package K5;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2780b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2779a;
            f10 += ((b) cVar).f2780b;
        }
        this.f2779a = cVar;
        this.f2780b = f10;
    }

    @Override // K5.c
    public float a(RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f2779a.a(rectF) + this.f2780b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2779a.equals(bVar.f2779a) && this.f2780b == bVar.f2780b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2779a, Float.valueOf(this.f2780b)});
    }
}
