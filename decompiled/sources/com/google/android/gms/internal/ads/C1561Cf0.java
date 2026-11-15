package com.google.android.gms.internal.ads;

import android.content.Context;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1561Cf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QR f17920a;

    C1561Cf0(QR qr, Context context) {
        this.f17920a = qr;
    }

    private final void t(String str, long j10, String str2, String str3, B4.b bVar, int i10, int i11, int i12, String str4) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        prA.c("pat", Long.toString(j10));
        prA.c("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        prA.c("max_ads", Integer.toString(i10));
        prA.c("cache_size", Integer.toString(i11));
        prA.c("pas", Integer.toString(i12));
        prA.c("pv", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        prA.c("ad_unit_id", str3);
        prA.c("pid", str2);
        prA.d();
    }

    private final void u(String str, String str2, long j10, int i10, int i11, String str3, C1925Jf0 c1925Jf0, String str4) {
        PR prA = this.f17920a.a();
        prA.c(str2, Long.toString(j10));
        if (c1925Jf0 != null) {
            prA.c("ad_unit_id", c1925Jf0.a());
            prA.c("ad_format", c1925Jf0.b());
            prA.c("pid", c1925Jf0.c());
        }
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        if (str3 != null) {
            prA.c("gqi", str3);
        }
        if (i10 >= 0) {
            prA.c("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            prA.c("cache_size", Integer.toString(i11));
        }
        prA.c("pv", str4);
        prA.d();
    }

    private final void v(String str, long j10, String str2, String str3, B4.b bVar, int i10, int i11, int i12, int i13, int i14) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        prA.c("pat", Long.toString(j10));
        prA.c("pid", str2);
        prA.c("ad_unit_id", str3);
        prA.c("max_ads", Integer.toString(i10));
        prA.c("cache_size", Integer.toString(i11));
        prA.c("tpcnt", Integer.toString(i13));
        prA.c("mpl", Integer.toString(i14));
        if (bVar != null) {
            prA.c("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        }
        if (i12 > 0) {
            prA.c("nptr", Integer.toString(i12));
        }
        prA.d();
    }

    public final void a(int i10, long j10, C1925Jf0 c1925Jf0, String str) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "start_preload");
        prA.c("sp_ts", Long.toString(j10));
        prA.c("ad_format", c1925Jf0.b());
        prA.c("ad_unit_id", c1925Jf0.a());
        prA.c("pid", c1925Jf0.c());
        prA.c("max_ads", Integer.toString(i10));
        prA.c("pv", str);
        prA.d();
    }

    public final void b(Map map, long j10, String str) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "start_preload");
        prA.c("sp_ts", Long.toString(j10));
        prA.c("pv", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        for (B4.b bVar : map.keySet()) {
            String strValueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            prA.c(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(bVar)).intValue()));
        }
        prA.d();
    }

    public final void c(int i10, int i11, long j10, C1925Jf0 c1925Jf0) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "cache_resize");
        prA.c("cs_ts", Long.toString(j10));
        prA.c("orig_ma", Integer.toString(i10));
        prA.c("max_ads", Integer.toString(i11));
        prA.c("ad_format", c1925Jf0.b());
        prA.c("ad_unit_id", c1925Jf0.a());
        prA.c("pid", c1925Jf0.c());
        prA.c("pv", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        prA.d();
    }

    public final void d(int i10, int i11, long j10, Long l10, String str, C1925Jf0 c1925Jf0, String str2) {
        PR prA = this.f17920a.a();
        prA.c("plaac_ts", Long.toString(j10));
        prA.c("max_ads", Integer.toString(i10));
        prA.c("cache_size", Integer.toString(i11));
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "is_ad_available");
        if (c1925Jf0 != null) {
            prA.c("ad_unit_id", c1925Jf0.a());
            prA.c("pid", c1925Jf0.c());
            prA.c("ad_format", c1925Jf0.b());
        }
        if (l10 != null) {
            prA.c("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            prA.c("gqi", str);
        }
        prA.c("pv", str2);
        prA.d();
    }

    public final void e(long j10, String str) {
        u("poll_ad", "ppacwe_ts", j10, -1, -1, null, null, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void f(long j10, C1925Jf0 c1925Jf0, int i10, int i11, String str) {
        u("poll_ad", "ppac_ts", j10, i10, i11, null, c1925Jf0, str);
    }

    public final void g(long j10, int i10, int i11, String str, C1925Jf0 c1925Jf0, String str2) {
        u("poll_ad", "psvroc_ts", j10, i10, i11, str, c1925Jf0, str2);
    }

    public final void h(long j10, int i10, int i11, String str, C1925Jf0 c1925Jf0, String str2) {
        PR prA = this.f17920a.a();
        prA.c("ppla_ts", Long.toString(j10));
        prA.c("ad_format", c1925Jf0.b());
        prA.c("ad_unit_id", c1925Jf0.a());
        prA.c("pid", c1925Jf0.c());
        prA.c("max_ads", Integer.toString(i10));
        prA.c("cache_size", Integer.toString(i11));
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "poll_ad");
        if (str != null) {
            prA.c("gqi", str);
        }
        prA.c("pv", str2);
        prA.d();
    }

    public final void i(long j10, String str, C1925Jf0 c1925Jf0, int i10, int i11, String str2) {
        u("paa", "pano_ts", j10, i10, i11, str, c1925Jf0, str2);
    }

    public final void j(long j10, C1925Jf0 c1925Jf0, int i10, String str) {
        u("pae", "paeo_ts", j10, i10, 0, null, c1925Jf0, str);
    }

    public final void k(long j10, C1925Jf0 c1925Jf0, H4.Z0 z9, int i10, int i11, String str) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "pftla");
        prA.c("pftlat_ts", Long.toString(j10));
        prA.c("pftlaec", Integer.toString(z9.f1252a));
        prA.c("ad_format", c1925Jf0.b());
        prA.c("max_ads", Integer.toString(i10));
        prA.c("cache_size", Integer.toString(i11));
        prA.c("ad_unit_id", c1925Jf0.a());
        prA.c("pid", c1925Jf0.c());
        prA.c("pv", str);
        prA.d();
    }

    public final void l(long j10, B4.b bVar, int i10) {
        t("pda", j10, null, null, bVar, -1, -1, i10, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void m(long j10, String str, String str2, B4.b bVar, int i10, int i11) {
        t("pd", j10, str, str2, bVar, i10, i11, 1, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void n(B4.b bVar, long j10, int i10) {
        t("pgcs", j10, null, null, bVar, -1, -1, i10, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void o(long j10, String str, String str2, B4.b bVar, int i10, int i11) {
        t("pgc", j10, str, str2, bVar, i10, i11, 1, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void p(int i10, long j10, String str, String str2, B4.b bVar, int i11) {
        t("pnav", j10, str, str2, bVar, i11, i10, 1, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void q(long j10, String str, String str2, B4.b bVar, int i10, int i11, int i12, int i13) {
        v("acmpa", j10, str, str2, bVar, i10, i11, 0, i12, i13);
    }

    public final void r(long j10, String str, String str2, B4.b bVar, int i10, int i11, int i12, int i13, int i14) {
        v("acmpr", j10, str, str2, bVar, i10, i11, i12, i13, i14);
    }

    public final void s(long j10, int i10, int i11) {
        PR prA = this.f17920a.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "acmlr");
        prA.c("pat", Long.toString(j10));
        prA.c("mpl", Integer.toString(i10));
        prA.c("pas", Integer.toString(i11));
        prA.d();
    }
}
