package T3;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.P;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends T3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f5721g = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5722a;

        static {
            int[] iArr = new int[T3.b.values().length];
            try {
                iArr[T3.b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T3.b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T3.b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[T3.b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5722a = iArr;
        }
    }

    static {
        p064g3.b.a("BaseLayoutAnimation", p064g3.a.ERROR);
    }

    @Override // T3.a
    public Animation c(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        T3.b bVarD = d();
        if (bVarD == null) {
            throw new P("Missing animated property from animation config");
        }
        int i14 = b.f5722a[bVarD.ordinal()];
        float alpha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i14 == 1) {
            float alpha2 = i() ? view.getAlpha() : 0.0f;
            if (!i()) {
                alpha = view.getAlpha();
            }
            return new m(view, alpha2, alpha);
        }
        if (i14 == 2) {
            float f10 = i() ? 1.0f : 0.0f;
            float f11 = i() ? 0.0f : 1.0f;
            return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
        }
        if (i14 == 3) {
            return new ScaleAnimation(i() ? 1.0f : 0.0f, i() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i14 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, i() ? 1.0f : 0.0f, i() ? 0.0f : 1.0f, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0.5f);
        }
        throw new p129m8.k();
    }

    @Override // T3.a
    public boolean g() {
        return e() > 0 && d() != null;
    }

    public abstract boolean i();
}
