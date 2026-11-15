package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5138sc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f33194d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33195a = "ad.doubleclick.net";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f33196b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4509nc f33197c;

    public C5138sc(InterfaceC4509nc interfaceC4509nc) {
        this.f33197c = interfaceC4509nc;
    }

    private final Uri f(Uri uri, String str) throws C5264tc {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f33195a) && uri.getPath().contains(";")) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new C5264tc("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i10) + "dc_ms=" + str + ";" + string.substring(i10));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
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
            return Uri.parse(string2.substring(0, i11) + "ms=" + str + "&" + string2.substring(i11));
        } catch (UnsupportedOperationException unused2) {
            throw new C5264tc("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f33196b;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final InterfaceC4509nc b() {
        return this.f33197c;
    }

    public final void c(MotionEvent motionEvent) {
        this.f33197c.g(motionEvent);
    }

    public final Uri d(Uri uri, Context context, View view, Activity activity) throws C5264tc {
        try {
            return f(uri, this.f33197c.h(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C5264tc("Provided Uri is not in a valid state");
        }
    }

    public final boolean e(Uri uri) {
        if (a(uri)) {
            String[] strArr = f33194d;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }
}
