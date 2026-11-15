package Q4;

import com.google.android.gms.internal.ads.C4795pt;
import com.google.android.gms.internal.ads.EnumC3385eg;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4795pt f4817c;

    /* synthetic */ A(C0950z c0950z, byte[] bArr) {
        this.f4815a = c0950z.d();
        this.f4816b = c0950z.e();
        this.f4817c = c0950z.f();
    }

    public final Set a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f4815a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f4815a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final EnumC3385eg c() {
        byte b10;
        switch (this.f4815a) {
            case "NATIVE":
                b10 = 2;
                break;
            case "INTERSTITIAL":
                b10 = 1;
                break;
            case "REWARDED":
                b10 = 3;
                break;
            case "BANNER":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return EnumC3385eg.BANNER;
        }
        if (b10 == 1) {
            return EnumC3385eg.INTERSTITIAL;
        }
        if (b10 != 2) {
            return b10 != 3 ? EnumC3385eg.AD_INITIATER_UNSPECIFIED : EnumC3385eg.REWARD_BASED_VIDEO_AD;
        }
        return EnumC3385eg.AD_LOADER;
    }

    final String d() {
        return this.f4816b;
    }

    final C4795pt e() {
        return this.f4817c;
    }
}
