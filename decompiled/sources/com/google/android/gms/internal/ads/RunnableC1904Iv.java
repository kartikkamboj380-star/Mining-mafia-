package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1904Iv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f19691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC1956Jv f19692e;

    RunnableC1904Iv(AbstractC1956Jv abstractC1956Jv, String str, String str2, String str3, String str4) {
        this.f19688a = str;
        this.f19689b = str2;
        this.f19690c = str3;
        this.f19691d = str4;
        Objects.requireNonNull(abstractC1956Jv);
        this.f19692e = abstractC1956Jv;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b10;
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.f19688a);
        String str = this.f19689b;
        if (!TextUtils.isEmpty(str)) {
            map.put("cachedSrc", str);
        }
        String str2 = this.f19690c;
        switch (str2) {
            case "interrupted":
                b10 = 3;
                break;
            case "badUrl":
                b10 = 8;
                break;
            case "inProgress":
                b10 = 2;
                break;
            case "downloadTimeout":
                b10 = 9;
                break;
            case "contentLengthMissing":
                b10 = 0;
                break;
            case "playerFailed":
                b10 = 5;
                break;
            case "sizeExceeded":
                b10 = 11;
                break;
            case "externalAbort":
                b10 = 10;
                break;
            case "noop":
                b10 = 4;
                break;
            case "error":
                b10 = 1;
                break;
            case "expireFailed":
                b10 = 6;
                break;
            case "noCacheDir":
                b10 = 7;
                break;
            default:
                b10 = -1;
                break;
        }
        String str3 = "internal";
        switch (b10) {
            case 6:
            case 7:
                str3 = "io";
                break;
            case 8:
            case 9:
                str3 = "network";
                break;
            case 10:
            case 11:
                str3 = "policy";
                break;
        }
        map.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, str3);
        map.put("reason", str2);
        String str4 = this.f19691d;
        if (!TextUtils.isEmpty(str4)) {
            map.put(PglCryptUtils.KEY_MESSAGE, str4);
        }
        this.f19692e.v("onPrecacheEvent", map);
    }
}
