package Q7;

import androidx.fragment.app.O;
import com.swmansion.rnscreens.AbstractC6812p;
import com.swmansion.rnscreens.C6814s;
import kotlin.jvm.internal.Intrinsics;
import p129m8.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5074a;

        static {
            int[] iArr = new int[C6814s.d.values().length];
            try {
                iArr[C6814s.d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6814s.d.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6814s.d.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C6814s.d.SLIDE_FROM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C6814s.d.SLIDE_FROM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C6814s.d.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C6814s.d.FADE_FROM_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C6814s.d.IOS_FROM_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C6814s.d.IOS_FROM_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5074a = iArr;
        }
    }

    public static final void a(O o10, C6814s.d stackAnimation, boolean z9) {
        Intrinsics.checkNotNullParameter(o10, "<this>");
        Intrinsics.checkNotNullParameter(stackAnimation, "stackAnimation");
        if (z9) {
            switch (a.f5074a[stackAnimation.ordinal()]) {
                case 1:
                    o10.q(AbstractC6812p.f42485a, AbstractC6812p.f42486b);
                    return;
                case 2:
                    int i10 = AbstractC6812p.f42501q;
                    o10.q(i10, i10);
                    return;
                case 3:
                    o10.q(AbstractC6812p.f42490f, AbstractC6812p.f42491g);
                    return;
                case 4:
                    o10.q(AbstractC6812p.f42507w, AbstractC6812p.f42509y);
                    return;
                case 5:
                    o10.q(AbstractC6812p.f42506v, AbstractC6812p.f42510z);
                    return;
                case 6:
                    o10.q(AbstractC6812p.f42505u, AbstractC6812p.f42504t);
                    return;
                case 7:
                    o10.q(AbstractC6812p.f42489e, AbstractC6812p.f42503s);
                    return;
                case 8:
                    o10.q(AbstractC6812p.f42500p, AbstractC6812p.f42498n);
                    return;
                case 9:
                    o10.q(AbstractC6812p.f42496l, AbstractC6812p.f42494j);
                    return;
                default:
                    throw new k();
            }
        }
        switch (a.f5074a[stackAnimation.ordinal()]) {
            case 1:
                o10.q(AbstractC6812p.f42487c, AbstractC6812p.f42488d);
                return;
            case 2:
                int i11 = AbstractC6812p.f42501q;
                o10.q(i11, i11);
                return;
            case 3:
                o10.q(AbstractC6812p.f42490f, AbstractC6812p.f42491g);
                return;
            case 4:
                o10.q(AbstractC6812p.f42506v, AbstractC6812p.f42510z);
                return;
            case 5:
                o10.q(AbstractC6812p.f42507w, AbstractC6812p.f42509y);
                return;
            case 6:
                o10.q(AbstractC6812p.f42504t, AbstractC6812p.f42508x);
                return;
            case 7:
                o10.q(AbstractC6812p.f42502r, AbstractC6812p.f42492h);
                return;
            case 8:
                o10.q(AbstractC6812p.f42497m, AbstractC6812p.f42499o);
                return;
            case 9:
                o10.q(AbstractC6812p.f42493i, AbstractC6812p.f42495k);
                return;
            default:
                throw new k();
        }
    }
}
