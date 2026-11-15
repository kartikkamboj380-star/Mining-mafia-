package p225w4;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: w4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC7145e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC7145e f50328a = a().f(10485760).d(TTAdConstant.MATE_VALID).b(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: w4.e$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC7145e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    AbstractC7145e() {
    }

    static a a() {
        return new C7141a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
