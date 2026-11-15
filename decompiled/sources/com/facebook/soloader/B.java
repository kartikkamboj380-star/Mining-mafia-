package com.facebook.soloader;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class B extends C {
    public B(String str, String str2) {
        super(str, str2);
    }

    public static B b(String str, Context context, E[] eArr) {
        StringBuilder sb = new StringBuilder("couldn't find DSO to load: ");
        sb.append(str);
        sb.append("\n\texisting SO sources: ");
        for (int i10 = 0; i10 < eArr.length; i10++) {
            sb.append("\n\t\tSoSource ");
            sb.append(i10);
            sb.append(": ");
            sb.append(eArr[i10].toString());
        }
        if (context != null) {
            sb.append("\n\tNative lib dir: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            sb.append("\n");
        }
        return new B(str, sb.toString());
    }
}
