package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Db0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1605Db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5138sc f18258a;

    public C1605Db0(C5138sc c5138sc) {
        this.f18258a = c5138sc;
    }

    private static final Uri b(Uri uri, String str) throws C5264tc {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new C5264tc("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i10 = iIndexOf + 1;
                            StringBuilder sb = new StringBuilder(string.substring(0, i10));
                            sb.append("dc_ms");
                            sb.append("=");
                            sb.append(str);
                            sb.append(";");
                            sb.append((CharSequence) string, i10, string.length());
                            return Uri.parse(sb.toString());
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        StringBuilder sb2 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb2.append(";");
                        sb2.append("dc_ms");
                        sb2.append("=");
                        sb2.append(str);
                        sb2.append(";");
                        sb2.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return Uri.parse(sb2.toString());
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new C5264tc("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new C5264tc("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = iIndexOf3 + 1;
        StringBuilder sb3 = new StringBuilder(string2.substring(0, i11));
        sb3.append("ms");
        sb3.append("=");
        sb3.append(str);
        sb3.append("&");
        sb3.append((CharSequence) string2, i11, string2.length());
        return Uri.parse(sb3.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws C5264tc {
        try {
            return b(uri, this.f18258a.b().h(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C5264tc("Provided Uri is not in a valid state");
        }
    }
}
