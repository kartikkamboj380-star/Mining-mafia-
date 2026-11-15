package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5801xs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C5549vs0 f35046a = new C5549vs0("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f35046a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strA = AbstractC5675ws0.a(signature.toByteArray());
                            arrayList.add(strA);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                                return true;
                            }
                        }
                        f35046a.b(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", p065g4.c.a(", ", arrayList)), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f35046a.b("Play Store package is not found.", new Object[0]);
                }
            } else {
                f35046a.b("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f35046a.b("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
