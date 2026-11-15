package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3068c9 extends AbstractC5960z8 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f27054m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final D8 f27055v;

    public AbstractC3068c9(int i10, String str, D8 d10, C8 c10) {
        super(i10, str, c10);
        this.f27054m = new Object();
        this.f27055v = d10;
    }

    protected void A(String str) {
        D8 d10;
        synchronized (this.f27054m) {
            d10 = this.f27055v;
        }
        d10.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5960z8
    protected final E8 s(C5456v8 c5456v8) {
        String str;
        String str2;
        try {
            byte[] bArr = c5456v8.f33999b;
            Map map = c5456v8.f34000c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(CommonGatewayClient.HEADER_CONTENT_TYPE)) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(c5456v8.f33999b);
        }
        return E8.a(str, V8.a(c5456v8));
    }
}
