package p105k4;

import N4.t;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final t f45602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MediationInterstitialAdapter f45603b;

    /* JADX INFO: renamed from: k4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0458a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45604a;

        static {
            int[] iArr = new int[com.google.ads.mediation.unity.a.b.values().length];
            f45604a = iArr;
            try {
                iArr[com.google.ads.mediation.unity.a.b.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45604a[com.google.ads.mediation.unity.a.b.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45604a[com.google.ads.mediation.unity.a.b.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45604a[com.google.ads.mediation.unity.a.b.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45604a[com.google.ads.mediation.unity.a.b.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(t tVar, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f45602a = tVar;
        this.f45603b = mediationInterstitialAdapter;
    }

    public void a(com.google.ads.mediation.unity.a.b bVar) {
        if (this.f45602a == null) {
            return;
        }
        int i10 = C0458a.f45604a[bVar.ordinal()];
        if (i10 == 1) {
            this.f45602a.s(this.f45603b);
            return;
        }
        if (i10 == 2) {
            this.f45602a.u(this.f45603b);
            return;
        }
        if (i10 == 3) {
            this.f45602a.g(this.f45603b);
        } else if (i10 == 4) {
            this.f45602a.t(this.f45603b);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f45602a.b(this.f45603b);
        }
    }
}
