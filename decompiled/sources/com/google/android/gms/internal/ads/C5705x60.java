package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5705x60 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3269dk0 f34734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3269dk0 f34735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f34738e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f34739f;

    public C5705x60(C3269dk0 c3269dk0, C3269dk0 c3269dk1, boolean z9, boolean z10, boolean z11) {
        this.f34734a = c3269dk0;
        this.f34735b = c3269dk1;
        this.f34736c = z9;
        this.f34737d = z10;
        this.f34739f = z11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((AF) obj).f17275a;
        if (this.f34738e) {
            return;
        }
        Bundle bundleA = AbstractC2176Ob0.a(bundle, "pii");
        boolean z9 = this.f34739f;
        if (!z9) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29673R3)).booleanValue()) {
                if (this.f34734a.c()) {
                    bundleA.putString("paidv1_id_android", this.f34734a.a());
                    bundleA.putLong("paidv1_creation_time_android", this.f34734a.b());
                }
            } else if (z9) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29693T3)).booleanValue()) {
                    if (this.f34734a.c()) {
                        bundleA.putString("paidv1_id_android", this.f34734a.a());
                        bundleA.putLong("paidv1_creation_time_android", this.f34734a.b());
                    }
                }
            }
        } else if (z9) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29693T3)).booleanValue()) {
                if (this.f34734a.c()) {
                    bundleA.putString("paidv1_id_android", this.f34734a.a());
                    bundleA.putLong("paidv1_creation_time_android", this.f34734a.b());
                }
            }
        }
        if (!z9) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29683S3)).booleanValue()) {
                if (this.f34735b.c()) {
                    bundleA.putString("paidv2_id_android", this.f34735b.a());
                    bundleA.putLong("paidv2_creation_time_android", this.f34735b.b());
                }
                bundleA.putBoolean("paidv2_pub_option_android", this.f34736c);
                bundleA.putBoolean("paidv2_user_option_android", this.f34737d);
            } else if (z9) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29703U3)).booleanValue()) {
                    if (this.f34735b.c()) {
                        bundleA.putString("paidv2_id_android", this.f34735b.a());
                        bundleA.putLong("paidv2_creation_time_android", this.f34735b.b());
                    }
                    bundleA.putBoolean("paidv2_pub_option_android", this.f34736c);
                    bundleA.putBoolean("paidv2_user_option_android", this.f34737d);
                }
            }
        } else if (z9) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29703U3)).booleanValue()) {
                if (this.f34735b.c()) {
                    bundleA.putString("paidv2_id_android", this.f34735b.a());
                    bundleA.putLong("paidv2_creation_time_android", this.f34735b.b());
                }
                bundleA.putBoolean("paidv2_pub_option_android", this.f34736c);
                bundleA.putBoolean("paidv2_user_option_android", this.f34737d);
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleA);
    }

    public C5705x60(boolean z9) {
        this.f34739f = z9;
    }
}
